package learn.exceptionhandling;


class CurrencyIncorrectException extends Exception{
    public CurrencyIncorrectException(String msg){
        super(msg);
    }
}

class CurrencyIncorrectRuntimeException extends RuntimeException{
    public CurrencyIncorrectRuntimeException(String msg){
        super(msg);
    }
}

class Amount{
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        super();
        this.currency = currency;
        this.amount = amount;
    }

    public void addCurrency(Amount other){
        if(this.currency == "USD" && other.currency =="INR"){
            this.amount = this.amount + (other.amount / 86);
        }else if(this.currency == "INR" && other.currency =="USD"){
            this.amount = this.amount + (other.amount * 86);
        }else{
            throw new RuntimeException("Currency is incorrect");
        }
    }

    public void addWithCheckedException(Amount other) throws Exception{

        if(this.currency == "USD" && other.currency =="INR"){
            this.amount = this.amount + (other.amount / 86);
        }else if(this.currency == "INR" && other.currency =="USD"){
            this.amount = this.amount + (other.amount * 86);
        }else{
            throw new Exception("Currency is incorrect with Checked Exception");
        }
    }

    public void addWithCustomException(Amount other) throws CurrencyIncorrectException{

        if(this.currency == "USD" && other.currency =="INR"){
            this.amount = this.amount + (other.amount / 86);
        }else if(this.currency == "INR" && other.currency =="USD"){
            this.amount = this.amount + (other.amount * 86);
        }else{
            throw new CurrencyIncorrectException("Currency is incorrect with Custom Exception");
        }
    }

    public void addWithUncheckedException(Amount other) {

        if(this.currency == "USD" && other.currency =="INR"){
            this.amount = this.amount + (other.amount / 86);
        }else if(this.currency == "INR" && other.currency =="USD"){
            this.amount = this.amount + (other.amount * 86);
        }else{
            throw new CurrencyIncorrectRuntimeException("Currency is incorrect with Custom Exception");
        }
    }

    @Override
    public String toString() {
        return currency +" "+ amount;
    }
}

public class ThrowingExceptionRunner {
    public static void main(String[] args) throws Exception {
        Amount amt = new Amount("USD",10);
        Amount amt2 = new Amount("INR",2000);
        amt.addCurrency(amt2);
        amt2.addCurrency(amt);
        System.out.println(amt);
        System.out.println(amt2);
        Amount amt3 = new Amount("USD",10);
        Amount amt4 = new Amount("IO",2000);
        //amt3.addCurrency(amt4);
        System.out.println(amt3);
        //amt3.addWithCheckedException(amt4);
        amt3.addWithCustomException(amt4);
    }
}
