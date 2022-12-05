import java.util.*;

public class Main {
    /*
    Java: (Arrays cannot change their length)
    int[] arr = new int[length];
    int[] arr = {1,2,3,4,5}

    Javascript:  (Arrays can change their length)
    var arr = [];
    var arr = {1,2,3,4}
    var arr = new Array(length)
     */

    public static void main(String[] args){
        ArrayTester A = new ArrayTester();
        int [] arr = {1,2,3,4,5,1,1};
        int [] arr2= {1,2,3,4,5};
        //A.RandNumPrinter();

        A.swap(arr,1,2);
        A.print(arr);
        System.out.println(A.minimum(arr));
        System.out.println(A.maximum(arr));
        System.out.println(A.sum(arr));
        System.out.println(A.average(arr));
        System.out.println(A.stdDeviation(arr));
        System.out.println(A.numEvens(arr));
        System.out.println(A.indexOf(arr, 1));
        System.out.println(A.mode(arr));
        System.out.println(A.isSorted(arr));
        System.out.println(A.isSorted(arr2));
        for(int x=0; x<(A.findDuplicated(arr)).length; x++){
            System.out.print((A.findDuplicated(arr))[x]);
        }
        System.out.println(A.Reverse(arr2));

    }
}


