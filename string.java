import java.io.NotSerializableException;
import java.security.KeyStore.TrustedCertificateEntry;

import javax.sound.sampled.SourceDataLine;

public class string {
    public static void main(String[] args) {
        String name = "Jayesh Dineshbahi Pansuriya";
        System.out.println(name); 
        
        String lstring=name.toLowerCase();
        String ustring=name.toUpperCase();
        int value =name.length();
        String nonTrimmedString="    jd    ";
        System.out.println(nonTrimmedString);
        System.out.println(ustring);
        System.out.println(value);
        System.out.println(lstring);
        System.out.println(nonTrimmedString.trim());
        System.out.println(name.substring(5));
        System.out.println(name.substring(0));
        System.out.println(name.substring(0,20));//starting index and finishing index
        System.out.println(name.replace('J', 'j'));
        System.out.println(name.startsWith("ja"));
        System.out.println(name.endsWith("ya"));
        System.out.println(name.charAt(0));//index 
        System.out.println(name.indexOf("yesh"));//it will return the position of string starts withe
        System.out.println(name.indexOf("i",3));
        System.out.println(name.lastIndexOf("riya", 27));//give the position of last digits
        System.out.println(name.equals("Jayesh"));//it will chech the given syting"jayesh" is equal to the name string 
        System.out.println(name.equalsIgnoreCase("Jayesh dineshbahi Pansuriya"));//it will only check the value of string 
        String s1 = "we ares known as \"kathiyawadi\" the woriarse";
        System.out.println(s1);
    }
}

