package week5.sort;

import java.util.Arrays;

public class SelectionSort implements Sort{
    int[] arr;

    SelectionSort(int[] arr){
        this.arr = arr;
    }


    public void sort(boolean isAscending) {
       for(int i = 0; i < arr.length - 1; i++)
       {
           int targetValue = arr[i];
           int targetIndex = i;
           for(int j = i + 1; j < arr.length; j++)
           {
                if(isAscending ? arr[j] < targetValue : arr[j] >  targetValue)
                {
                    targetValue = arr[j];
                    targetIndex = j;
                }


           }
           arr[targetIndex] = arr[i];
           arr[i] = targetValue;
       }
    }

    public void sort()
    {
        sort(true);
    }

    @Override
    public String toString()
    {
        return Arrays.toString(arr);
    }
}
