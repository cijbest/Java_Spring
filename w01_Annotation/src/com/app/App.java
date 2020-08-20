package com.app;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Search;
import com.frame.Service;
import com.vo.Item;
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
      Item item = new Item(item_id, item_name);
      
      //IoC
      Service service1 = (Service)factory.getBean("userservice");

      Service service2 =(Service)factory.getBean("itemservice");
    
      User dbuser = null;
      dbuser = (User)service1.get("id01");
      System.out.println("Result: " + dbuser);
      
      ArrayList<User> list = null;
      list = service1.get();
      for(User u : list) {
    	  System.out.println(u);
      }
      System.out.println("=======");
      // 검색 기능
      Search itemservice =(Search)factory.getBean("itemservice");
      
      ArrayList<Item> list2 = null;
      list2 = itemservice.search(10000); 
      for(Item it:list2) {
    	  System.out.println(it);
      }
      
      factory.close();
      System.out.println("Spring End...............");
      System.out.println("App End.............");
   }

}