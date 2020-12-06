package algorithms;

/**
 * f(n)=f(n-1)+f(n-2)
 * f(0)=1
 * f(1)=1
 * n=4
 * 1,1,2,3
 */
public class FibonacciSeriesAlgorithm {
    //generate n number of elements of Fibonacci Series.

    public int[] generateNElements(int number) {
        int[] series = new int[number];
        //1,1,2,3
        while (number > 0) {
            series[number - 1] = getFibonacciNumberByIndex(number - 1);
            number--;
        }
        return series;
    }

    /**
     * fib(3)= fib2+fib(1)= (fib(1)+fib(0))+fib(1)=1+1+1=3
     *
     * @param p1
     * @return
     */
    private int getFibonacciNumberByIndex(int p1) {
        if (p1 == 0 || p1 == 1) {
            return 1;
        } else {
            return getFibonacciNumberByIndex(p1 - 1) + getFibonacciNumberByIndex(p1 - 2);
        }
    }
}
