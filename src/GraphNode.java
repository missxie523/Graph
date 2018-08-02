import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    int value;
    List<GraphNode> neighbors;
    public boolean visited;
    public GraphNode(int value){
        this.value = value;
        neighbors = new ArrayList<>();
        visited = false;
    }
}
