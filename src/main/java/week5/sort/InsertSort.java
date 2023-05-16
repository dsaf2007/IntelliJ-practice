package week5.sort;

import java.util.Arrays;

public class InsertSort<T extends Comparable<T>> implements Sort{

    T[] arr;

    public InsertSort(T[] arr){
        this.arr = arr;
    }


    public void sort(boolean isAscending) {
        for(int i = 1; i < arr.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(isAscending ? arr[j].compareTo(arr[j-1]) < 0: arr[j].compareTo(arr[j-1]) > 0)
                {
                    T temp = arr[j];
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
