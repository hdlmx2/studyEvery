package cn.hdlmx.Thread;

public class MainThreadYield {
    public static void main(String[] args) {
        ThreadYield ty1=new ThreadYield("A");
        ThreadYield ty2=new ThreadYield("B");

        ty1.setPriority(Thread.MAX_PRIORITY);
        ty2.setPriority(Thread.MIN_PRIORITY);

        ty1.start();
        ty2.start();

    }
}
