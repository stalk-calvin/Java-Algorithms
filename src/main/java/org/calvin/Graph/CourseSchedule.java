package org.calvin.Graph;

import java.util.List;
import java.util.Map;

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
}
