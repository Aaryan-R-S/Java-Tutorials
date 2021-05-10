// with abstract we can't directly create object of class A

abstract class A {
    private int p = 3;
    int q = 4;
    public A(){
        System.out.println("A1");
    }
    public A(int a){
        System.out.println("A2");
    }
    public void show() {
        System.out.println("A");
    }
}

class B extends A {
    public B(){
        System.out.println("B1");
    }
    public B(int a, int b){
        super(a);
        System.out.println("B2");
    }
    public void show() {
        System.out.println("B");
    }
}

class C extends B {
    public C(){
        System.out.println("C1");
    }
    public C(int a, int b, int c){
        super(a, b);
        System.out.println("C2");
    }
    public void show() {
        System.out.println("C");
    }
    public void benefitsOfAbstractClass(Number n) {
        System.out.println(n);        
    }
}
// Java doesn't support multiple inheritance

public class tut5_inherit {
    public static void main(String[] args) {
        C c1 = new C();
        C c2 = new C(1,3,4);
        
        System.out.println(c2.q);
        // System.out.println(c2.p); // not possible
        // A s = new A(); // not possible

        // Number is abstract class so we canot create object of this class unlike Integer, Float and Double.
        // But since remaining three extends the Number class we can use Number as reference variable in single method instead of writing three methods separately for Integer, Float and Double 
        c1.benefitsOfAbstractClass(7);
        c1.benefitsOfAbstractClass(-7);
        c1.benefitsOfAbstractClass(7.34f);
        c1.benefitsOfAbstractClass(7.34);

        A s = new B();   // not object of A but its reference
        s.show();   // will run for A

        
        // this assumes new inherited class without any name 
        A newInheritedClassShortcut = new A(){
                                            public void show(){
                                                System.out.println("lol");
                                            }
                                        };
        newInheritedClassShortcut.show();    
    }
}
