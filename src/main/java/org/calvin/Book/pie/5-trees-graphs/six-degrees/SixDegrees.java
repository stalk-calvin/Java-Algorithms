import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

class ActorGraphNode {
    private String name;
    private Set<ActorGraphNode> linkedActors;
    public ActorGraphNode(String name) {
        this.name = name;
        linkedActors = new HashSet<ActorGraphNode>();
    }

    public void linkCostar(ActorGraphNode costar) {
        linkedActors.add(costar);
        costar.linkedActors.add(this);
    }

    private int baconNumber = -1;

    public int getBaconNumber() { return baconNumber; }

    public void setBaconNumbers() {
        baconNumber = 0;
        Queue<ActorGraphNode> queue = new LinkedList<ActorGraphNode>();
        queue.add(this);
        ActorGraphNode current;
        while ((current = queue.poll()) != null) {
            for (ActorGraphNode n : current.linkedActors) {
                if (-1 == n.baconNumber) { // if node is unvisted
                    n.baconNumber = current.baconNumber + 1;
                    queue.add(n);
                }
            }
        }
    }
}
public class SixDegrees {
    public static void main(String[] args) {
    }
}
