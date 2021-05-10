import java.util.Scanner;

/**
 * Welcome to first java file
 */
public class tut1_intro {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        // String my_Name = "Aaryan R S";
        // System.out.println(my_Name);

        // int a = 45, x=3, y=5;
        // float f = 45.65f;

        // System.out.println(a);
        // System.out.println(f);

        // boolean isAdult = true;
        // System.out.println(isAdult);
        
        // Both same :
        // Integer ii = new Integer(4);
        // int ii = 5;

// Data types - 
        // 1. Primitive - byte(1), short(2), int(4), float(4), long(8), double(8), boolean(1), char(1)
        // 2. Non Primitive - created through classes
        
        // byte b = -128; // to 127
        // char c = 97;
        // double d = -127.34525;
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);

        // int num1=10, num2=3;
        // num2+=3;
        // System.out.println(num2);
        // System.out.print("The value: ");
        // System.out.println(num1+num2);
        // System.out.println(num1-num2);
        // System.out.println(num1*num2);
        // System.out.println(num1/num2);
        // System.out.println(num1%num2);

        // System.out.println(++num1 + ++num1);
        // System.out.println(num1);
        // System.out.println(num1++ + num1++);
        // System.out.println(num1);

// Taking user INPUT:
        // Scanner details = new Scanner(System.in);

        // System.out.print("Enter name: ");
        // String name = details.nextLine();
        
        // System.out.print("Enter age: ");
        // int age = details.nextInt();
        
        // System.out.println(name);
        // System.out.println(age);
    
// String methods:
        // String s = "AbDasd";
        // String ss = "gfbbD";
        // System.out.println(s);
        // System.out.println(s.length());
        // System.out.println(s.toLowerCase());
        // System.out.println(s.toUpperCase());
        // System.out.println(s+" lol "+ss);
        // System.out.println(s.contains("as"));
        // System.out.println(s.charAt(2));
        // System.out.println(s.startsWith("Ab"));
        // System.out.println(s.indexOf("as"));

// Math class
        // int m = -2, n = 3;
        // System.out.println(Math.min(m, n));
        // System.out.println(Math.abs(m));
        // System.out.println(Math.sqrt(n));
        // System.out.println(5+Math.random()*(5));

// Conditionals + Switch case
// Loops
    // Same as of cpp

// Arrays 
        // int[] marks = {2,4,5,2};
        // System.out.println(marks[2]);
        // marks[2] = 2;
        // System.out.println(marks[2]);
        
        // for (int i : marks) {
        //     System.out.print(i);
        // }
        
        // System.out.println("");
        
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.print(marks[i]);
        // }

        // int[][] marks2d = {{2,4,5,2},{4,6,3,5}};
        // System.out.println(marks2d[1][3]);
        
// Try catch
        // int[][] marks2d = {{2,4,5,2},{4,6,3,5}};
        // try {
        //     System.out.println(marks2d[1][4]);
        // } catch (Exception e) {
        //     System.out.println("___________");
        //     System.out.println(e);
        //     System.out.println("___________");
        // }finally{
        //     System.out.println("Done");
        // }
        // System.out.println("Exit");


    }
}