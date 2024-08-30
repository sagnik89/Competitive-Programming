import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Redirect input
        System.setIn(new FileInputStream("input.txt"));
        // Redirect output
        System.setOut(new PrintStream(new FileOutputStream("output.txt")));

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        // Your code here
        
        System.out.println("ls");





        out.close();
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}