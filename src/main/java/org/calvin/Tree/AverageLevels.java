package org.calvin.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevels {
    public static List<Double> averagePerLevels(TreeNode root) {
        //BFS
        List<Double> result = new ArrayList<>();
        double sum=0;
        int count=0;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode magic = new TreeNode(0);
        q.add(root);
        q.add(magic);
        while(!q.isEmpty()) {
            TreeNode tmp = q.poll();
            if (tmp==magic) {
                result.add(sum/count);
                if (!q.isEmpty()) {
                    q.add(magic);
                }
                sum=0;
                count=0;
                continue;
            }
            sum+=tmp.val;
            count+=1;
            if (tmp.left != null) {
                q.add(tmp.left);
            }
            if (tmp.right != null) {
                q.add(tmp.right);
            }
        }
        return result;
    }
}
