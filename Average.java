
public class Average {

    public static double calculate_average(int[] num) throws EmptyArrayExceptions, NegativeElementExceptions {
        int  sum = 0;

        if(num.length == 0){
            throw new EmptyArrayExceptions("Array is empty");
        }
        for (int i = 0; i < num.length; i++){
            if(num[i] < 0){
                throw new NegativeElementExceptions("Array contains negative numbers");
            }
            sum += num[i];
        }
        return (double) sum / num.length;

    }
}
