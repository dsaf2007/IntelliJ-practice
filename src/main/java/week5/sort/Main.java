package week5.sort;

public class Main {


    public static void main(String[] args) {
        Integer[] arr = {11, 9, 8, 1, 3, 5, 6};

        Sort sorting = new InsertSort(arr);

        sorting.sort();
        System.out.println(sorting.toString());
        sorting.sort(false);
        System.out.println(sorting.toString());
    }
}