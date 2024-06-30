package com.company   ;

import java.net.SocketTimeoutException;

public class practice_set_1 {
    public static void main(String[] args) {
        //problem 1
        String name ="jD Pansuriya";
        name = name.toLowerCase();
        System.out.println(name);

        //problem 2
        String name1="to lower case";
        name1=name1.replace(" ", "_");
        System.out.println(name1);

        //problem3
        String latter="Dear <|name|>, thanks a lot!";
        latter =latter.replace("<|name|>", "jd");
        System.out.println(latter);

        //problem 4
        String  myString="this    string contains      doubal and tripal sopace";
        System.out.println(myString.indexOf("   "));
        System.out.println(myString.indexOf(" "));
        System.out.println(myString.indexOf("  "));
    }
    
}
