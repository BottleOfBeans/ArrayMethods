import java.util.Random;
import java.util.ArrayList;
import java.util.List;


public class ArrayTester {
    public static void RandNumPrinter() {
        int[] array = new int[20];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(50);

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void print(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println("Index: "+i+"   Value: "+arr[i]);
        }
    }
    public static void swap(int [] arr, int index1, int index2){
        int data1 = arr[index1];
        int data2 = arr[index2];
        arr[index1] = data2;
        arr[index2] = data1;
    }
    public static int minimum(int [] arr){
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int maximum(int [] arr){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int sum(int [] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int average(int [] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }

    public static double stdDeviation(int [] arr){
        int mean = average(arr);
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            sum += (arr[i]-mean)*(arr[i]-mean);
        }
        return sum/arr.length;
    }

    public static int numEvens(int[] arr){
        int num = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]%2 == 0){
                num ++;
            }
        }
        return num;
    }
    public static int indexOf(int[] arr, int toFind){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    public static int mode(int [] arr){
        int[] numOfAppearing = new int[arr.length];
        int maxCount = 0;
        int maxIndex  = 0;
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int ii=0; ii<arr.length; ii++){
                if(arr[i]==arr[ii]){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount = count;
                maxIndex = i;
            }
        }
        System.out.println("Arr = "+maxIndex+"   Count = "+maxCount);
        return (arr[maxIndex]);
    }

    public static boolean isSorted (int[] arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i] == (arr[i-1]+1)){
                ;
            }else{
                return false;
            }
        }
        return true;
    }

    public static Object[] findDuplicated(int [] arr){
        List<Integer> duplis = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            boolean duplicated = false;
            for(int ii=0; ii<arr.length; ii++){
                if(arr[i]==arr[ii]){
                    duplicated = true;
                }
            }
            if(duplicated){
                duplis.add(arr[i]);
            }
        }
        return duplis.toArray();
    }

    public static int[] Reverse(int[] arr){
        int [] returnArr = new int[arr.length];
        int index = 0;
        for(int x=arr.length-1; x>=0; x--){
            returnArr[index] = arr[x];
        }
        return returnArr;
    }

}


