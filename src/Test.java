import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        TreeNode t1 = new TreeNode(7);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(2);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t5.right = t6;

        PrintByLayers sol = new PrintByLayers();
        System.out.println(sol.bfs(t1));

        GraphNode g1 = new GraphNode(3);
        GraphNode g2 = new GraphNode(4);
        GraphNode g3 = new GraphNode(81);
        GraphNode g4 = new GraphNode(0);
        GraphNode g5 = new GraphNode(8);
        GraphNode g6 = new GraphNode(6);
        List<GraphNode> graph = new ArrayList<>();
        graph.add(g1);
        graph.add(g2);
        graph.add(g3);
        graph.add(g4);
        graph.add(g5);
        graph.add(g6);
        g1.neighbors.add(g2);
        g1.neighbors.add(g3);
        g1.neighbors.add(g4);
        g2.neighbors.add(g3);
        g3.neighbors.add(g5);
        g3.neighbors.add(g4);
        g4.neighbors.add(g5);
        g4.neighbors.add(g6);
        g4.neighbors.add(g2);
        g5.neighbors.add(g6);
        g6.neighbors.add(g2);
        TraverseGraph sol1 = new TraverseGraph();
        System.out.println(sol1.bfsTraverse(graph));


    }
}
