package cn.hdlmx.String;

public class Demo {

    public static void main(String[] args) {
        String string="handong,muxing,";

        String[] ss=string.split(",");

        for(String out:ss){
            System.out.println(out);
        }
        System.out.println(ss.length);
    }
}
