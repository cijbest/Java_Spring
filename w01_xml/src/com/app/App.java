package com.app;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Service;
import com.vo.Items;
import com.vo.User;

public class App {

   public static void main(String[] args) {
      System.out.println("App Start.........");
      AbstractApplicationContext factory = 
            new GenericXmlApplicationContext("com.xml");
      System.out.println("Spring Started...........");
      
      String user_id = "id01";
      String user_pwd = "pwd01";
      String user_name = "name1";
      User user = new User(user_id, user_pwd, user_name);
      
      String item_id = "it1";
      String item_name = "item1";
      Items item = new Items(item_id, item_name);
      
      //IoC
      Service service1 = (Service)factory.getBean("userservice");
      service1.register(user);
      service1.remove(user_id);
      service1.modify(user);
      service1.get(user_id);
      service1.get();
      
      Service service2 =(Service)factory.getBean("itemservice");
      service2.register(item);
      service2.remove(item_id);
      service2.modify(item);
      service2.get(item_id);
      service2.get();
      
      User dbuser = null;
      dbuser = (User)service1.get("id01");
      System.out.println("Result: " + dbuser);
      
      ArrayList<User> list = null;
      list = service1.get();
      for(User u : list) {
    	  System.out.println(u);
      }
      
      factory.close();
      System.out.println("Spring End...............");
      System.out.println("App End.............");
   }

}