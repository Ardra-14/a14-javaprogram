import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int retry_limit = 3;
        int retries = 0;
        Scanner s = new Scanner(System.in);
        while (retries < retry_limit) {
            System.out.println("Enter your pin: ");
            int pin = s.nextInt();
            System.out.println("Enter your amount: ");
            int amount = s.nextInt();
            try {
                Process p = new Process();
                p.atm(pin, amount);
                break;
            }
            catch (PinExceptions | LengthException | AtmExceptions e) {
                System.out.println(e.getMessage());
                retries++;
                if (retries < retry_limit){
                    System.out.println("Please retry");
                }
                else {
                    System.out.println("Maximum number of attempts reached.please try again after sometimes");
                }
            }
            finally {
                System.out.println("Thank you! visit again");
            }
        }
    }
}