
Finds the n-largest values in a set of data, given a sequence of values, one value at a time. There could be infinitely many elements in this sequence. 
This keeps track of the n-largest elements seen so far in a sequence of data. 

METHODS
* ```public NLargestCounter(int n)``` - This is the constructor.  It takes in an int n that indicates the amount of largest elements you want to return.

* ```public void count(T x)``` - processes the next element in the set of data. Runs in at worst `O(log n)` time.

* ```public List<T> nlargest()``` - returns a sorted (smallest to largest) list of the n-largest elements. Runs in at worst `O(n log n)` time.
