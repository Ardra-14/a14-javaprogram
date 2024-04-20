public class Transaction {
    public void atm (int pin, int amount) throws AtmExceptions {
        if (pin != 2351) {
            throw new AtmExceptions("Invalid pin");
        } else {
            System.out.println("Pin entered successfully");
        }

        if (amount > 50000){
            throw new AtmExceptions("Insufficient Balance");
        }else{
            System.out.println("Your transaction under process and you can collect your cash");
        }
    }

}