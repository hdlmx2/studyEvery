package cn.hdlmx.Thread;

public class MyThreadPrinter implements Runnable {

    private String name;
    private Object prev;
    private Object self;

    public MyThreadPrinter(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    public void run() {
        int count = 10;
        while (count > 0) {
            synchronized (prev) {
                System.out.println(name);
                count--;
                self.notify();
            }
            try {
                prev.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        MyThreadPrinter pa = new MyThreadPrinter("A", c, a);
        MyThreadPrinter pb = new MyThreadPrinter("B", a, b);
        MyThreadPrinter pc = new MyThreadPrinter("C", b, c);


        Thread t1 = new Thread(pa);
        Thread t2 = new Thread(pb);
        Thread t3 = new Thread(pc);

        t1.start();
        Thread.sleep(100);
        t2.start();
        Thread.sleep(100);
        t3.start();
        Thread.sleep(100);
    }
}
