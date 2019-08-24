### ***For more details, refer to my [blog](https://stalk-calvin.github.io/blog/2016/06/28/sorting.html)!***

## BubbleSort

Takes each values adjacent to each other and compares and swap if one is less than the other. O(n<sup>2</sup>)

<center>![bubblesort](https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif)</center>

## CountingSort

Non-comparative sorting algorithm, so can sort better than O(nlogn) since no comparison. Downside of this sort is that we need to know # of occurrences on all numbers in an array before hand. You sort by the number of occurrence for such # in an array. 

## HeapSort

Comparison-based unstable sorting algorithm takes an advantage of the tree being max/min heap. O(nlogn)

<center>![heapsort](https://upload.wikimedia.org/wikipedia/commons/4/4d/Heapsort-example.gif)</center>

## InsertionSort

Insertion sort goes through the array look for the position of an item that is being looked at. O(n<sup>2</sup>)

<center>![insertionsort](https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif)</center>

## MergeSortArray

Stable, Divide and Conquer, Comparison-based. Merge sort divides elements recursively into a smaller pieces and slowly sort them as they merges together. O(nlogn)

<center>![mergesort](https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif)</center>

## MergeSortList

Merge sort of Linked List. O(nlogn). Similar algorithm to the array based one.

## QuickSortArray

Algorithm partitions array so element on left side has less than the element or right side has greater than equail to the element. Then algorithm recursives calls this until all element found the right position where it needs to be. Average, O(nlogn)

## SelectionSort

Selection sort selects the lowest in the array and places in front.

<center>![selectionsort](https://upload.wikimedia.org/wikipedia/csliommons/9/94/Selection-Sort-Animation.gif)</center>