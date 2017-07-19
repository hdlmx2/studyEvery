package cn.hdlmx.compal;

/**
 * Created by handong on 2017/7/19.
 */
public class Person implements Comparable<Person> {

    private int age;
    private String name;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person p) {

        if (this.age > p.age) return 1;
        return -1;
    }
}
