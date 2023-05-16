package week5.sort;

import java.util.Arrays;

public class InsertSort {

    int[] arr;

    InsertSort(int[] arr){
        this.arr = arr;
    }


    public void sort(boolean isAscending) {
        for(int i = 1; i < arr.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(isAscending ? arr[j] < arr[j-1] : arr[j] > arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else
                    break;
            }
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
