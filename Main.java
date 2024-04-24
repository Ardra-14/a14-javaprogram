import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = s.nextInt();
        if(n == 0){
            System.out.println("Array size is zero");
            return;
        }
        int[] num = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++){
            num[i]= s.nextInt();
        }
        System.out.println("Enter the new element to be inserted: ");
        int element = s.nextInt();
        System.out.println("Enter the position of insertion: ");
        int position = s.nextInt();

            try {
                ArrayInserting a = new ArrayInserting();
                a.process(num, position, element);
                System.out.println("After inserting: " + Arrays.toString(num));

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please enter a valid position: ");
                s.nextLine();
            } catch (NegativeNumberExceptions e) {
                System.out.println("Please enter a positive number: ");
                s.nextLine();
            }

    }
}