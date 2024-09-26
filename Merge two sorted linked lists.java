import java.io.*;
import java.util.*;

public class Solution {
    public void testcase (int n, int llist1[], int m, int llist2[]) {
        int newllist[] = new int [n+m];
        for (int i=0; i<n; i++) newllist[i] = llist1[i];
        for (int i=0; i<m; i++) newllist[n+i] = llist2[i];
        Arrays.sort(newllist);
        for (int i=0; i<n+m; i++) System.out.print(newllist[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution s = new Solution();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int test = 0 ; test<t; test++){
            int n;
            
                n = scan.nextInt();
            
                int llist1[] = new int [n];
                for (int data = 0; data<n; data++) {
                    if (scan.hasNextInt()) 
                        llist1[data] = scan.nextInt();
                }
            
            int m;
            
                m = scan.nextInt();
            
                int llist2[] = new int [m];
                for (int data=0; data<m; data++) 
                    if (scan.hasNextInt()) 
                        llist2[data] = scan.nextInt();
            
            
            s.testcase(n, llist1, m, llist2);
        }
    }
}
