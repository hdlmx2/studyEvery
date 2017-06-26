package cn.hdlmx.String;

/**
 * Created by yedong on 2017/6/26.
 */
public class TestDemo {
    public int add(int... objects) {
        int sum = 0;
        for (int i = 0; i < objects.length; i++) {
            sum += objects[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new TestDemo().add(1, 2, 3, 4, 5));
    }
}
