package programers;

public class P181923 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int min = Integer.MAX_VALUE;
            for (int i = queries[q][0]; i <= queries[q][1]; i++) {
                if (arr[i] > queries[q][2]) {
                    if (arr[i] < min)
                        min = arr[i];
                }
            }
            if (min == Integer.MAX_VALUE)
                min = -1;
            answer[q] = min;
        }
        return answer;
    }
}
