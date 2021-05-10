// ----IMPORT A PACKAGE----
// import package.name.Class;  // E.G : import java.util.Scanner;
// OR
// import package.name*;    // E.G. : import java.util.*;

// ----CREATE A PACKAGE----
// #Include the following line in java file:
// package mypack;    // E.G. : package myPackTest;

// #On terminal type:
// javac MyPackageClass.java   // filename where class is written to compile it
// javac -d . MyPackageClass.java  // it means package will be saved in current directory

// #Testing:
// java mypack.MyPackageClass   // If its runs successfully it means you are ready to use your package
// import mypack.*;

public class tut6_other {
    public static void main(String[] args) {

        // String to Interger conversions
        String s = "234";
        int k = Integer.parseInt(s);
        System.out.println(k);

        s = String.valueOf(k);
        System.out.println(s);

        // Constant in java using final keyword
        final double PI = 3.1415;
        // PI = 3.1416; // not possible

    }
}
