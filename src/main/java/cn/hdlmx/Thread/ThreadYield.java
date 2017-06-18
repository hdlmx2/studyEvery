package cn.hdlmx.Thread;

public class ThreadYield extends Thread {

    public ThreadYield(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("" + this.getName() + "-----" + i);
            if (i == 30) {
                yield();
            }
        }

    }
}
