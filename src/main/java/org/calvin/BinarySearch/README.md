## BinarySearch.java

Just a plain binary search against int array. I see the middle key generation can cause overflow.

It is better to write:
```
int mid = first + (last-first)/2;
```

## FirstBadVersion.java

Search first bad integer (chosen randomly) using binary search from given 0 to n.
