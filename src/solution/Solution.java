/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;
import java.util.Arrays;

/**
 *
 * @author Chux
 * 
 * Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 * 
 * 
 * 
 * 
 */
public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);     
        int min = 1; 
            int cap = A.length; //for efficiency — no need to calculate or access the array object’s length property per iteration 

        for (int i = 0; i < cap; i++){
            if(A[i] == min){
                min++;
            }
        }   
        //min = ( min <= 0 ) ? 1:min; //this means: if (min <= 0 ){min =1}else{min = min} you can also do: if min <1 for better efficiency/less jumps
        return min; 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Solution s = new Solution();
        int a  = s.solution(new int[]{1, 3, 6, 4, 1, 2});
        int b = s.solution(new int[]{1, 2, 3});
        int c = s.solution(new int[]{-1, -3});
        int d = s.solution(new int[]{-1, -3, 1, 2});
        
        System.out.println("Test case 1 : " + a);
        System.out.println("Test case 2 : " + b);
        System.out.println("Test case 3 : " + c);
        System.out.println("Test case 4 : " + d);
    }
    
}
