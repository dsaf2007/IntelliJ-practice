package codeup;

import java.io.*;

public class Codeup1099 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] map = new String[10][10];
        String line;
        for(int i = 0; i < 10; i++) {
            line = br.readLine();
            map[i] = line.split(" ");
        }

        int x= 1, y = 1;

        boolean movable = true;

        if(map[x][y].equals("2") == true) movable = false;
        map[x][y] = "9";
        while(movable){
            if(map[x][y+1].equals("1") != true)
            {
                y++;
                if(map[x][y].equals("2") == true)
                    movable = false;
                map[x][y] = "9";

            }
            else if(map[x+1][y].equals("1") != true){
                x++;
                if(map[x][y].equals("2") == true)
                    movable = false;
                map[x][y] = "9";
            }
            else
                movable = false;
        }

        for(int i = 0; i < 10; i++)
        {
            String out = "";
            for(int j = 0; j < 10; j++)
            {
                out += map[i][j] + " ";
            }out +="\n";
            bw.write(out);
            bw.flush();
        }
    }
}
