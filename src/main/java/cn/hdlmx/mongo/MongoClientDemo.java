package cn.hdlmx.mongo;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 * Created by handong on 2017/7/9.
 */
public class MongoClientDemo {
    public static void main(String[] args) {
        MongoClient client=new MongoClient("localhost",27001);
        DB db=client.getDB("mldn");
        for(String name:db.getCollectionNames()){
            System.out.println("¼¯ºÏÃû×Ö£º"+name);
        }

        client.close();

    }
}
