package cn.hdlmx.Thread;

class Station extends Thread {

    public Station(String name) {
        super(name);
    }

    static int ticket = 20;
    static Object ob = "aa";

    public synchronized void sale() {

        while (ticket>0){
            if (ticket > 0) {
                System.out.println(getName() + "卖出了第" + ticket-- + "张票");
            } else {
                System.out.println("===票卖完了====");
            }

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void run() {

       sale();
       /* while (ticket > 0) {
            synchronized (ob) {
                if (ticket > 0) {
                    System.out.println(getName() + "卖出了第" + ticket-- + "张票");
                } else {
                    System.out.println("===票卖完了====");
                }

                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }

    public static void main(String[] args) {
        Station stationA = new Station("Station-A");
        Station stationB = new Station("Station-B");

        stationA.start();
        stationB.start();
    }
}
