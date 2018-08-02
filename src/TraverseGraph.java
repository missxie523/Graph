import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TraverseGraph {
    public List<Integer> bfsTraverse(List<GraphNode> graph){
        if(graph == null){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        for(GraphNode start: graph){
            if(!start.visited){
                Queue<GraphNode> q = new LinkedList<>();
                start.visited = true;
                q.offer(start);
                while(!q.isEmpty()){
                    GraphNode cur = q.poll();
                    list.add(cur.value);
                    for(GraphNode nei: cur.neighbors){
                        if(!nei.visited){
                            nei.visited = true;
                            q.offer(nei);
                        }
                    }
                }
            }
        }
        return list;
    }
}
