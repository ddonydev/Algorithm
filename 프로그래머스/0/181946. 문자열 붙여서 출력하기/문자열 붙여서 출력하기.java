import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(a.replace(" ", ""));
        bw.flush();
        bw.close(); 
    }
}