import java.util.Scanner;

public class tut2_calculator {
    public static void calc() {   
        float x, y;

        System.out.print("x : ");
        Scanner scan1 = new Scanner(System.in);
        x = scan1.nextFloat();

        System.out.print("y : ");
        y = scan1.nextFloat();

        String prompt = "0 : '+' \n1 : '-' \n2 : '*' \n3 : '/'";
        System.out.println(prompt);

        int op = scan1.nextInt(); 
        System.out.print("Result: ");
        switch (op) {
            case 0:
                System.out.println(x+y);
                break;
        
            case 1:
                System.out.println(x-y);
                break;
        
            case 2:
                System.out.println(x*y);
                break;
        
            case 3:
                System.out.println(x/y);
                break;
        
            default:
                System.out.println("Invalid Input!");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.print("Do you want to star the calculator? (1 for yes else 0): ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if(i==1){
            calc();
        }
        else{
            System.out.println("Ok!");
        }
    }
}
