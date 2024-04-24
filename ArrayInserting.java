public class ArrayInserting {
    public void process(int[] num,int position,int element) throws NegativeNumberExceptions {

        int[] newNum = new int[num.length + 1];
        for (int i = 0; i < newNum.length; i++){
            if(i == position){
                newNum[i] = element;
            } else if (i < position) {
                newNum[i] = num[i];
            }else {
                newNum[i] = num[i - 1];
            }
        }
        for (int i = 0; i < newNum.length; i++){
            num[i] = newNum[i];
        }


        if(position < 0){
            throw new ArrayIndexOutOfBoundsException("you can't insert element in that position");
        }
        if(position > num.length){
            throw new ArrayIndexOutOfBoundsException("Invalid position");
        }

        if(element < 0){
            throw new NegativeNumberExceptions(" element should be a positive numbers.");
        }

        for (int i = 0; i < num.length; i++){
            if(num[i] < 0){
                throw new NegativeNumberExceptions("Array contains negative number.");
            }
        }

    }
}
