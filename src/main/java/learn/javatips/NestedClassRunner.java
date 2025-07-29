package learn.javatips;

class DefalutClass{
    void Print(){
        System.out.println("DefaultClass");
    }
}
public class NestedClassRunner {
    class InnerClass{
        void Print(){
            System.out.println("Inner Class");
        }
    }
    static class StaticInneClass{
        void Print(){
            System.out.println("StaticInnerClass");
        }
    }

    public static void main(String[] args) {
        StaticInneClass sic = new StaticInneClass();
        //InnerClass ic = new InnerClass();
        NestedClassRunner NCR = new NestedClassRunner();
        InnerClass ic = NCR.new InnerClass();
    }
}
