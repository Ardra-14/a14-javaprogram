public class Process {
    public void atm (int pin, int amount) throws AtmExceptions,PinExceptions ,LengthException{
        int pinlength = 4;
        String str = String.valueOf(pin);
        if(str.length() != pinlength){
            throw  new LengthException("The entered pin should be 4 digits");
        } else if (pin != 2351) {
            throw new PinExceptions("Invalid pin");
        }
        else {
            System.out.println("Pin entered successfully");
        }

        if (amount > 50000){
            throw new AtmExceptions("Insufficient Balance");
        }else{
            System.out.println("Your transaction under process and you can collect your cash");
        }
    }

}