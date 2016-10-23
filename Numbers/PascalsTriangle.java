public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows < 1) {
            return result;
        }
        List<Integer> current = new ArrayList<>();
        current.add(1);
        result.add(current);
        for (int i = 1; i < numRows; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for(int j=1; j<current.size(); j++) {
                tmp.add(current.get(j-1) + current.get(j));
            }
            tmp.add(1);
            result.add(tmp);
            current = tmp;
        }
        return result;
    }
}
