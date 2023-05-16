package week5.sort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {11, 9, 8, 1, 3, 5, 6};

        InsertSort is = new InsertSort(arr);

        is.sort();
        System.out.println(is.toString());
        is.sort(false);
        System.out.println(is.toString());
    }
}
