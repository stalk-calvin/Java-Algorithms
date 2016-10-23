public class MoveZeros {
    public void moveZeroes(int[] A) {
        if (A == null) {
            return;
        }
        int k = A.length - 1;
        int pointer = A.length - 1;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 0) {
                for (int j = k; j < pointer; j++) {
                    int tmp = A[j+1];
                    A[j+1] = A[j];
                    A[j] = tmp;
                }
                pointer--;
                k--;
            } else {
                k--;
            }
        }
    }
}
