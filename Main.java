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
        int[] num = new int[n + 1];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++){
            num[i]= s.nextInt();
        }
            while (true) {
                try {
                    System.out.println("Enter the new element to be inserted: ");
                    int element = s.nextInt();
                    if(element < 0){
                        throw new NegativeNumberExceptions(" Element should be a positive number.");
                    }
                    System.out.println("Enter the position of insertion: ");
                    int position = s.nextInt();
                    ArrayInserting a = new ArrayInserting();
                    a.process(num,position - 1, element);
                    System.out.println("After inserting: " + Arrays.toString(num));
                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Please enter a valid position: ");
                    s.nextLine();
                } catch (NegativeNumberExceptions e) {
                    System.out.println(e.getMessage());
                    s.nextLine();
                }
            }
    }
}