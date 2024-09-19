package part1;
import java.util.Scanner;

public class prac5 {
    public static void main(String[]args){
        int[] code={1,2,3,4,5};
        int[] price={300,1500,200,400,600};
        Scanner scanner=new Scanner(System.in);
        
        for(int i=0;i<=code.length;i++){
            int codes= code[i];
            int prices= price[i];
            double tax=0;

            switch(codes){
                case 1:
                     tax=0.08;
                     break;
                case 2:
                     tax=0.12;
                     break;
                case 3:
                     tax=0.05;
                     break;
                case 4:
                     tax=0.075;
                     break;
                default:
                    tax=0.03;
            }
            double Totalamount= prices * tax;
            double totalprice=prices + tax;
            double totalbill=0;
            totalbill += totalprice;
            


        

    }

}
