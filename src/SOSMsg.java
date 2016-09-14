import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SOSMsg {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int count=0;
	        String s = in.next();
	        String str="SOS";
	        int x=s.length()/3;
	        for(int i=0;i<x-1;i++){
	        	str=str+"SOS";
	        }
	        System.out.println(str);
	        for(int i=0;i<s.length();i++){
	        	if(s.charAt(i)!=str.charAt(i)){
	        		count++;
	        	}
	        }
	        System.out.println(count);
	    }
}
