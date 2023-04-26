package org.example;

import java.util.Arrays;

public class SwapEx {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));

        int temp;
        temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;

        System.out.println(Arrays.toString(arr));
    }

}
