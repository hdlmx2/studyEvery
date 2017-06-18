package cn.hdlmx.Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + "主线程开始执行=======");
        Thread1 thread1 = new Thread1("A");
        Thread1 thread2 = new Thread1("B");

        thread1.setPriority(1);
        thread2.setPriority(2);

        thread1.start();
        thread2.start();
    /*    try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/
       /* Thread2 t3 = new Thread2("C");
        Thread2 t4 = new Thread2("D");
        Thread thread3 = new Thread(t3);
        Thread thread4 = new Thread(t4);

        thread3.setPriority(3);
        thread4.setPriority(4);


        thread3.start();
        thread4.start();*/
        System.out.println(Thread.currentThread().getName() + "主线程=======");

    }
}
