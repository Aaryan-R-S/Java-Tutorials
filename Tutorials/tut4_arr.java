/**
 * CalcAdd
 */
class CalcAdd {
    public int add(int ... n) {
        int sum = 0;
        for (int i : n) {
            sum+=i;
        }
        return sum;
    }
}

/**
 * tut4_arr
 */
public class tut4_arr {
    public static void main(String[] args) {
        // int arr[] = new int[4];
        // arr[0] = 4;
        // arr[1] = 4;
        // arr[2] = 5;
        // arr[3] = 4;
        // arr[0] = 2;

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }



        // int arr2d[][] = {
        //     {1,2,3,4},
        //     {5,6,7,8},
        //     {9,10,11,12}
        // };
        // System.out.println(arr2d[2][2]);

        // // Enhanced for loop for iteration - for each
        // for (int k[] : arr2d) {
        //     for (int j : k) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }



        CalcAdd k = new CalcAdd();
        System.out.println(k.add(2,52,25));
    }
    
}