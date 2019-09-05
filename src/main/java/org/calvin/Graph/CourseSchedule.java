package org.calvin.Graph;

import java.util.*;

public class CourseSchedule {
    public static List<String> order(Map<String, List<String>> prereqs) throws Exception {
        Graph courseGraph = new GraphImpl(GraphType.DIRECTED);

        for (Map.Entry<String, List<String>> prereq : prereqs.entrySet()) {
            for (String course : prereq.getValue()) {
                courseGraph.addEdge(prereq.getKey(), course, 0);
            }
        }

        return TopologicalSort.sort(courseGraph);
    }

    public static boolean canFinish(Map<String, List<String>> prerequisites) {
        Map<String, Integer> indegreeMap = new HashMap<>();
        // put 2d array --> graph
        // get indegree
        for (Map.Entry<String, List<String>> entry : prerequisites.entrySet()) {
            for (String course : entry.getValue()) {
                indegreeMap.put(course, indegreeMap.getOrDefault(course, 0) + 1);
            }
        }

        // BFS to search
        Queue<String> q = new LinkedList<>();
        // add to q when there is no indgree
        for (Map.Entry<String, List<String>> entry : prerequisites.entrySet()) {
            if (indegreeMap.get(entry.getKey()) == null || indegreeMap.get(entry.getKey()) == 0) {
                q.offer(entry.getKey());
            }
        }
        while (!q.isEmpty()) {
            String curCourse = q.poll();
            List<String> nextCourse = prerequisites.get(curCourse);

            for (int i = 0; nextCourse != null && i < nextCourse.size(); i++) {
                if (indegreeMap.get(nextCourse.get(i)) != null && indegreeMap.get(nextCourse.get(i)) != 0) {
                    int indegree = indegreeMap.get(nextCourse.get(i));
                    indegreeMap.put(nextCourse.get(i), --indegree);
                }
                if (indegreeMap.get(nextCourse.get(i)) != null && indegreeMap.get(nextCourse.get(i)) == 0) {
                    q.offer(nextCourse.get(i));
                }
            }

        }

        for (Map.Entry<String, List<String>> entry : prerequisites.entrySet()) {
            if (indegreeMap.get(entry.getKey()) != null && indegreeMap.get(entry.getKey()) != 0) {
                return false;
            }
        }
        return true;
    }
}
