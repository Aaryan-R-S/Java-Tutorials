// We can use final to prevent inheritance of a class or a method and hence prevent overriding
final class Outer {
    String name;
    int age;
    boolean married;
    static int num;

    public Outer(){
        this.name = "Undefined";
        this.age = 0;
        num++;
    }
    
    public Outer(String name, int age){
        this.name = name;
        this.age = age;
        num++;
    }

    public void maritalStatus(boolean verdict) {
        this.married = verdict;
    }

    public static void lol(){
        System.out.println("Inside lol outer");
    }

    static{
        System.out.println("It will reun only one time when class is loaded just like static variables");
    }
    
    public void show() {
        System.out.println(this.name+" "+this.age+" "+this.married);
    }

    class Inner {
        int in = 45;
        public void setIn(int in) {
            this.in = in;
        }
        public void show() {
            System.out.println(this.in);
        }
    }
    
    static class Inner1 {
        int in = 45;
        public void setIn(int in) {
            this.in = in;
        }
        public void show() {
            System.out.println(this.in);
        }
    }

}
/*
class k extends Outer{
    // Not allowed
}
*/

public class tut3_oops {
    static int acc = 8; 
    
    public static void main(String[] args) {
        // static method can access only static var from its base class
        System.out.println(acc);

        Outer bb = new Outer();
        bb.name = "BB";
        bb.age = 21;
        Outer cc = new Outer("CC", 23);
        cc.maritalStatus(true);

        bb.show();
        cc.show();
        Outer.lol();

        System.out.println(Outer.num);
        
        // to access inner class use outer class... to access inner class object user outer class object
        Outer.Inner dd = bb.new Inner();
        dd.setIn(34);
        dd.show();
        
        // to access static inner class use outer class... to access static inner class object user outer class 
        Outer.Inner1 dd1 = new Outer.Inner1();
        dd1.setIn(35);
        dd1.show();
        
        // array of objects
        Outer arr[] = new Outer[2];
        arr[0] = bb;
        arr[1] = cc;
        System.out.println(Outer.num);
    }
}
