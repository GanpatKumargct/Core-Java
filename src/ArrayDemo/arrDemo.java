package ArrayDemo;

import java.util.Arrays;

public class arrDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(arr); //hashcode
        System.out.println(arr.length); //size of the array
        System.out.println(Arrays.stream(arr).max());  //max number of the array


        //printing the array
        for (int array: arr) {
            System.out.print(array +"  ");
        }

        System.out.println();

        System.out.println("element at first index "+arr[1]);  //print element which one present in the index 0
    }
}
