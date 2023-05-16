import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Rotate {

    static int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
    };

    public static void rotation(int k, int size, int[][] tempArr)
    {
        if(k == size * size) return;

        rotation(k+1,size,tempArr);
        arr[k%size][size -1 - (k/size)] = tempArr[k/size][k%size];
    }

    public static void main(String[] args) {

        int[][] tempArr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        rotation(0,3, tempArr);

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }
}
