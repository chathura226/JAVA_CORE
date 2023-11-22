package org.chathura.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        //new Map<>() introduce many functions related. so use Hashmap istead
        Map<String,String> emailList=new HashMap<>();

        //for int use Integer . not int
        Map<Integer,String> test=new HashMap<>();

        emailList.put("Chathura","chathura@gmail.com");
        emailList.put("Lakshan","lakshan@gmail.com");

        System.out.println(emailList.get("Chathura"));

        System.out.println(emailList.size());

        emailList.remove("Chathura");

        System.out.println(emailList.size());

        System.out.println(emailList.containsKey("Lakshan"));
        System.out.println(emailList.containsValue("Lakshan"));

        System.out.println(emailList);
        System.out.println(emailList.keySet());

    }
}
