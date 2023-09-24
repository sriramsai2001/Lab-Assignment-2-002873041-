import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt(); 
            ArrayList<Integer> line = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                line.add(scanner.nextInt());
            }

            lines.add(line);
        }

        int q = scanner.nextInt(); 
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt(); 
            int y = scanner.nextInt(); 

            if (x >= 1 && x <= n && y >= 1 && y <= lines.get(x - 1).size()) {
                System.out.println(lines.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
