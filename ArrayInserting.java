public class ArrayInserting {
    public void process(int[] num,int position,int element) throws NegativeNumberExceptions,ArrayIndexOutOfBoundsException {


        if(position < 0 || position > num.length){
            throw new ArrayIndexOutOfBoundsException("you can't insert element in that position");
        }

        if(element < 0){
            throw new NegativeNumberExceptions(" element should be a positive numbers.");
        }

        for (int i = 0; i < num.length; i++){
            if(num[i] < 0){
                throw new NegativeNumberExceptions("Array contains negative number.");
            }
        }

        for (int i = num.length - 1; i > position; i--) {
            num[i] = num[i - 1];

        }
        num[position] = element;
    }
}
