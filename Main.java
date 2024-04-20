import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your pin: ");
        int pin = s.nextInt();
        System.out.println("Enter your amount: ");
        int amount = s.nextInt();

        try {
            Transaction t = new Transaction();
            t.atm(pin,amount);
        }catch (AtmExceptions e){
            System.out.println(e.getMessage());
        }
        System.out.println("Thank You! Visit again");
    }

}