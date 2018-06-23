package artem.balan.WholeSquareCount;

public class Solution {

    private double as;
    private double bs;

    public int solution (int a, int b){

        int result = 0;

        for(int i = a; i <= b; i++)

            for(int j = 1; j * j <= i; j++)
                if(j * j == i)
                    result++;
        return result;
    }

    public int solution2 (int A, int B){

        return (int)Math.sqrt(B) - (int)Math.sqrt(A-1);
    }

    public static void main(String[] args){
        int a = -25;
        int b = 25;
        Solution sol = new Solution();
        System.out.println(sol.solution2(a, b));
    }

}
