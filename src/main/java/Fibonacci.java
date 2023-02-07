
public class Fibonacci {

    final private int getNthFib(int maxN, int currN, int sum1, int sum2)
    {
        if(maxN == 1) return 0;
        if(maxN == 2) return 1;
        if(maxN == currN) return sum2;
        if(currN == 2) 
        {
            sum1 = 1;
            sum2 = 1;
        }

        return getNthFib(maxN, currN+1, sum2, sum1+sum2);
    }

    final private int getNthFib(int n)
    {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return(getNthFib(n - 1) + getNthFib(n - 2));
    }

    /**
     * Return the nth number of fibonacci sequence.
     * The fibonacci sequence is calculated by adding the previous two numbers in the sequence to obtain the next
     * number. The first two numbers in the whole fibonacci sequence are always 0 and 1.
     * For instance, the sequence starts as:
     * 0 1 1 2 3 5 8 13 21
     * where the 4th number of the sequence would be 3, the 5th number would be 5, the 6th number would be 8, etc.
     *
     * You could either use a for loop to keep track of the current number of the fibonacci sequence as well as the two
     * numbers before it, or you could look up a recursive solution to experiment with recursion for the first time.
     *
     * @param n an iteration of the fibonacci sequence.
     * @return the nth number of fibonacci sequence.
     */
    public int fib(int n){
        //return getNthFib(n, 0, 0, 0);
        return getNthFib(n);
    }
}
