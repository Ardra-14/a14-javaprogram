//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int n1 = n.nextInt();
        int n2 = n.nextInt();
        int diff = n2-n1;
        if( n1>n2){
            System.out.println( n1 + " is greater than " + n2 + " by " +diff+ " units");
        } else {
            System.out.println( n2 + " is greater than " + n1 + " by " +diff+ " units");
        }
    }
}