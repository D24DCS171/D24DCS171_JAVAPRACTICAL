package part1;
import java.util.Scanner;
public class prac6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of days for genrate exercise routine");
        int n=scanner.nextInt();

       int first=0;
       int second=1;
       System.out.println("exercise routine for"+n+"days");
       for(int i=1;i<=n;i++){
        System.out.println("day"+i+":"+first+"minute");
        int next=first+second;
        first=second;
        second=next;
       }
    }
}

