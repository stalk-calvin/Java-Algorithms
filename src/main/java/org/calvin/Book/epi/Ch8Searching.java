package org.calvin.terview.epi;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ch8Searching {
    public static int bsearch(int t, List<Integer> A) {
        int L = 0, U = A.size() - 1;

        while (L <= U) {
            int M = L + (U - L) / 2;
            if (A.get(M) < t) {
                L = M + 1;
            } else if (A.get(M) == t) {
                return M;
            } else {
                U = M - 1;
            }
        }
        return -1;
    }

    public static class Student {
        public String name;
        public double gradePointAverage;

        Student(String name, double gradePointAverage) {
            this.name = name;
            this.gradePointAverage = gradePointAverage;
        }
    }

    private static final Comparator<Student> compGPA = new Comparator<Student>() {
        @Override
        public int compare(Student a, Student b) {
            if (a.gradePointAverage != b.gradePointAverage) {
                return Double.compare(a.gradePointAverage, b.gradePointAverage);
            }
            return a.name.compareTo(b.name);
        }
    };

    public static boolean searchStudent(List<Student> students, Student target, Comparator<Student> compGPA) {
        return Collections.binarySearch(students, target, compGPA) >= 0;
    }

    public static int searchFirstOfK(List<Integer> A, int k) {
        int left = 0, right = A.size() - 1, result = -1;
        // A.subList(left, right + 1) is the candidate set.
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (A.get(mid) > k) {
                right = mid - 1;
            } else if (A.get(mid) == k) {
                result = mid;
                // Nothing to the right of mid can be the first occurrence of k.
                right = mid - 1;
            } else { // A.get(mid) < k
                left = mid + 1;
            }
        }
        return result;
    }
}
