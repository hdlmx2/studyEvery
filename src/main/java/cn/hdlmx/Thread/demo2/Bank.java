package cn.hdlmx.Thread.demo2;

public class Bank {
    static int money = 1000;

    public void counter(int money) {
        Bank.money -= money;
    }
}
