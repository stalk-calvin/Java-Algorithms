# Sorting

Sorting algorithms are useful for two reasons.
The first is to order data for presentation to the user, such as sorting a list of employees alphabetically by first or last name.
The second is to simplify and optimize other algorithms, either by sorting the input data prior to applying an algorithm or by sorting the intermediate data an algorithm uses as it runs.

Most languages include at least one sorting algorithm(typically quicksort) in their standard libraries, but we still need to understand the differences and trade-offs between them.
Each algorithm has benefits and drawbacks, and there's no single best way to sort in all cases.

## Sorting Algorithms

Choosing the right sorting algorithm can have a huge impact on application performance.
What's right for one application isn't necessarily right for a different application. 
Here are some criteria to consider when selecting a sorting algorithm:

* __How much data is to be sorted?__ For large data sets, the worst-case bounds become radically different.
* __Does the data fit in memory?__ Most sorting algorithms are efficient only when the data they operate on resides in memory. If the data set is too large for memory, we need to split it into smaller chunks for sotring and then combine those sorted chunks to create the final sorted data set.
* __Is the data already mostly sorted?__ Adding new data to a sorted list can be done efficiently with certain algorithms, but these same algorithms have poor performance on randomly ordered data.
* __How much additional memory does the algorithm require?__ An in-place sorting algorithm sorts the data withour using any additional memory, such as by swapping elements in an array. WHen memory is at the premium, an in-place algorithm may be a better choice than one with otherwise superior efficiency.
* __Is relative order preserved?__ A stable sorting algorithm preserves the relative order of data elements that are otherwise identical for sorting purpose. (In other words, if elements A and B have identical key values and A precedes B in the original data set, A will still precede B after a stable sorting.) Staility is generally a desirable feature, but in many cases it may be worth sacrificing statbility for improved performacne.


For simplicity, the sorting problems used in interviews often deal with simple integer values stored in array. In the real world, sorting usually involves more complex data structures with only one or a few of the values in those data structures affecting the sorting order.

## Selection Sort

Selection sort is one of the simplest sorting algorithms. 
It start with the first element in the array(or list) and scan through the array to find the element with the smallest key, which it swaps with the first element. The process is then repeated with each subsequent element until the last element is reached.

[Java](SelectionSort.java)

## Insertion Sort

Insertion sort is another simple sorting algorithm. It builds a sorted array(or list) one element at a time by comparing each new element to the already-sorted elements and inseting the new element into the correction location, similar to the way you sort a hand of playing cards.

[Java](InsertionSort.java)

## Quick Sort

Quicksort is a divide-and-conquer algorithm that involves choosing a pivot value form a data set and splitting the set into two subsets: a set that contains all values lees than the pivot value and a set that contains all values greater than or equal to the pivot. The pivot/split process is recursively applied to each subset until there are no more subsets to split. The results are combined to form the final sorted set.

[Java](QuickSort.java)
