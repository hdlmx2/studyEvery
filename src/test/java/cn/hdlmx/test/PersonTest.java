package cn.hdlmx.test;

import cn.hdlmx.compal.Person;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by handong on 2017/7/19.
 */
public class PersonTest {
    @Test
    public void testCom(){
        Person p1=new Person(10);
        Person p2=new Person(20);

        assertEquals(-1,p1.compareTo(p2));
    }

}