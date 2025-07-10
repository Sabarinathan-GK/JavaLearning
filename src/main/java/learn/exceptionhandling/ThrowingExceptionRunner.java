package learn.exceptionhandling;

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
        }
    }

    @Override
    public String toString() {
        return currency +" "+ amount;
    }
}

public class ThrowingExceptionRunner {
    public static void main(String[] args) {
        Amount amt = new Amount("USD",10);
        Amount amt2 = new Amount("INR",2000);
        amt.addCurrency(amt2);
        amt2.addCurrency(amt);
        System.out.println(amt);
        System.out.println(amt2);
    }
}
