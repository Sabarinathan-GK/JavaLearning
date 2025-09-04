package learn.latestfeatures;

public class PatternMatchingRunner {

    record Transaction(String sender, String receiver, int amount){}

    public static void main(String[] args) {
        Object objString = "Animal";
        oldVerInstanceOf(objString);
        newVerInstanceOf(objString);
        printTransactionOld(new Transaction("Sabari","Mani",1_00_000));
    }
    /*private static void printTransactionNew(Object obj){
        if(obj
                instanceof
                Transaction(String sender, String receiver, int amount)){
            System.out.println(sender +" "+receiver+" "+amount);
        }
    }*/
    private static void printTransactionOld(Object obj){
        if(obj instanceof Transaction trans){
            String sender = trans.sender();
            String receiver = trans.receiver();
            int amt = trans.amount();
            System.out.println(sender +" "+receiver+" "+amt);
        }
    }

    private static void newVerInstanceOf(Object obj) {
        if(obj instanceof String conString){
            System.out.println(conString.toUpperCase());
        }
    }
    private static void oldVerInstanceOf(Object obj) {
        if(obj instanceof String){
            String convertedString = (String)obj;
            System.out.println(convertedString.toLowerCase());
        }
    }
}
