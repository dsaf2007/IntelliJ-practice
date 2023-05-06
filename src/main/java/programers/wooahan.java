package programers;

public class wooahan {
    public static void main(String[] args) {
        int[][] diags = { {19,23}};
        int height = 40;
        int width = 51;

        long[][] map = new long[height+1][width + 1];

        for(int i =0 ; i < height + 1; i++)
        {
            map[i][0] = 1;
            for(int j = 1; j < width + 1; j++)
            {
                if(i == 0)
                {
                    map[i][j] = 1;
                }
                else
                {
                    map[i][j] = map[i-1][j] + map[i][j-1];
                }
            }
        }map[0][0] = 0;

        int distToDiag = 0;
        int distToDest = 0;
        long numOfDiag = 0;
        long numOfDest = 0;
        int answer = 0;

        for(int i = 0; i < diags.length; i++)
        {
            int r = diags[i][0];
            int c = diags[i][1];

            Pair a = new Pair(r - 1, c);
            Pair b = new Pair(r, c - 1);

            //a까지
            numOfDiag = map[a.r][a.c] - map[0][0];
            numOfDest = map[height - b.r][width - b.c] - map[0][0];
            distToDiag = a.r + a.c;
            distToDest = (width - b.c) + (height - b.r);
            if(distToDest + distToDiag + 1 == width + height + 1)
            {
                answer += ((numOfDiag % 10000009) * (numOfDest % 10000009)) %10000009;
            }

            numOfDiag = map[b.r][b.c] - map[0][0];
            numOfDest = map[height - a.r][width - a.c] - map[0][0];
            distToDiag = b.r + b.c;
            distToDest = (width - a.c) + (height - a.r);
            if(distToDest + distToDiag + 1 == width + height + 1)
            {
                answer += ((numOfDiag % 10000009) * (numOfDest % 10000009)) %10000009;
            }
        }
        System.out.println("answer = " + answer);
    }
}

class Pair{
    public int r;
    public int c;
    Pair(int r, int c){
        this.r = r;
        this.c =  c;
    }
}
