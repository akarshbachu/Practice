import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulTriplets {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n,l,count=0;
        n=in.nextInt();
        l=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
           for(int j=1;j<n;j++){
               for(int k=2;k<n;k++){
                   if(i<j && j<k && a[j]-a[i]==a[k]-a[j] &&a[k]-a[j]== l){
                       count++;
                   }
               }
           } 
        }
        System.out.println(count);
    }
}