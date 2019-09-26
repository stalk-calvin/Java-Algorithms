# Recursion

Recursion is a deceptively simple concept: Any function that calls itself is recursive.

## Understanding Recursion

Recursion is useful for tasks that can be defined in terms of similar subtasks.
For example, sort, search, and traversal problems often simple revursive solutions.

**Note**: Recursive algorithms have two cases: recursive cases and base cases. Every recursive case must eventually lead to a base case.

Take the "n factorial" `n!` for example.

    n! = n(n-1)!
    0! = 1! = 1


    int factorial(int n) {
        if (n > 1) { // Recursive case
            return factorial(n-1)*n;
        } else {
            return 1;
        }
    }


The operation of this functin when computeing `4!`.
    
    f(4)
        return f(3)*4
            f(3)
                return f(2)*3
                    f(2)
                        return f(1)*2
                            f(1)
                            return 1
                        return 1*2
                return 2*3
        return 6*4
                        
Note that when the value returned by the recursive call is itselft immediately returned, as in the preceding definition for `factorial`, the function is `tail-recursive`.
Some compilers can perform `tail call elimination` on tail-recursive functions, an optimization that reuses the same stack frame for each recursive call.

This is an exremely simpe example of a recursive function. In many cases, the recursive functions may need additional data structures or an argument that tracks the recursion level. Often the best solution in such cases is to move the dta structure or argument initialization code into a seprate function.

For example, if we need a factorial function that returns all its intermediate results(factorial less than n), as well as the final result(n!), we most naturally return these results as an integer array, which mean the function needs to allocate an array.

    int[] allFactorails(int n) { // Wrapper function
        int[] results = new int[n==0? 1 : n];
        doAllFactorials(n, results, 0);
        return results;
    }
    int doAllFactorials(int n, int[] results, int level) {
        if (n > 1) { // recursive case
            results[level] = n * doAllFactorials(n-1, results, level+1);
            return results[level];
        } else { // base case
            results[level] = 1;
            return 1;
        }
    }
    
**Note**: It may be useful to write a sepatrate wrapper fucntion to do initialization for a complex recursive functin.

Although recursion is a powerful technique, it is not always the best approach, and rarely is it the most efficient approach.

**Note**: Iterative solutions are usually more efficient than recursive solutions.

Any problem that can be solved recursively can also be solved iteratively. Iterative algorithms are often easy to write, even for tasks that might appear to be fundamentally recursive.

    int factorial(int n) {
        int i, val = 1;
        for (i = n; i > 1; i--) // n = 0 or n = 1 falls through
            val *= i;
        return val;
    }

For some problems, obvious iterative alternatives like the one just shown don't exist, but it's always possible to implement a recursive algorithm without using recursive calls.
Implementing this type of stack-based iterative funtion trends to be signficantly more complicated than implementing an equivalent function using recursive calls. Furthermore, unless the overhead for the stack you use is signficantly less than the function call overhead, a function written this way won't be more efficient than a conventional recursive implementation.
Therfore, we should implement recursive algorithm with recursive call unless instructed otherwise.

## Recursion Problems
|No.|Title|Solution|
|---|-----|--------|
|7.1|[Binary Search](binary-search)|[Java](binary-search/BinarySearch.java)|
|7.2|[Permutations of a String](permutations-of-string)|[Java](permutations-of-string/PermutationsOfString.java)|
|7.2|[Combinations of a String](combinations-of-string)|[Java](combinations-of-string/CombinationsOfString.java)]|
|7.3|[Telephone Words](telephone-words)|[Java](telephone-words/TelephoneWords.java)

