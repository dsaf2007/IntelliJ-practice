package programers;

public class P181922 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int[] q : queries)
        {
            for(int i = q[0]; i <= q[1]; i++)
            {
                if(i % q[2] == 0){
                    arr[i]+=1;
                }
            }
        }
        answer = arr;
        return answer;
    }
}
