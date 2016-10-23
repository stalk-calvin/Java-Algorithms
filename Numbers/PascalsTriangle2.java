public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> current = new ArrayList<>();
        current.add(1);// add 1
        rowIndex = rowIndex + 1;
        for (int i = 1; i < rowIndex; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1); // add beginning 1
            for (int j = 1; j < current.size(); j++) {
                tmp.add(current.get(j-1) + current.get(j)); //add middle values;
            }
            tmp.add(1); // add last 1;
            current = tmp;
        }
        return current;
    }
}
