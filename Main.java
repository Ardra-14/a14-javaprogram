import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no .of elements of array: ");
        int n = s.nextInt();
        int [] num = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++){
            num[i] = s.nextInt();
        }
        try {
            double avg;
            avg = Average.calculate_average(num);
            System.out.println("The average of element is: "+ avg);
        }catch (NegativeElementExceptions | EmptyArrayExceptions e){
            System.out.println(e.getMessage());
        }

    }
}