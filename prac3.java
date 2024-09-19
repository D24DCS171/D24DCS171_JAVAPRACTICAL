package part1;
import java.util.Scanner;
public class prac3 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter distance in meter:");
        int distance=scanner.nextInt();
        System.out.println("enter time - hours:");
        int hours=scanner.nextInt();
        System.out.println("enter time - minutes:");
        int minutes=scanner.nextInt();
        System.out.println("enter time - seconds:");
        int seconds=scanner.nextInt();

        int totalseconds=hours*3600+minutes*60+seconds;

        double speedms=distance/totalseconds;
        double speedkh=(distance/1000.0)/(totalseconds/3600.0);
        double speedmh=(distance/1609.0)/(totalseconds/3600.0);
        System.out.println("speed in meter/second:"+speedms);
        System.out.println("speed in kilometer/hour:"+speedkh);
        System.out.println("speed in miles/hour:"+speedmh);


    }
    

}
