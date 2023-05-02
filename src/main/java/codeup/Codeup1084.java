package codeup;

import java.io.*;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int r = Integer.parseInt(s[0]);
        int g = Integer.parseInt(s[1]);
        int b = Integer.parseInt(s[2]);

        int result = 0;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        for(int i = 0; i < r; i++)
           for(int j = 0; j < g; j++) {
               line = "";
               for (int k = 0; k < b; k++) {
                   line += i + " " + j + " " + k + "\n";
                   result++;
               }
               bw.write(line);
               bw.flush();
           }
        bw.write(Integer.toString(result));
        bw.flush();
    }
}