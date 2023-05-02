package programers;

public class P181924 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int[] q : queries){
            int temp = arr[q[0]];
            arr[q[0]] = arr[q[1]];
            arr[q[1]] = temp;
        }
        answer = arr;
        return answer;
    }
}
