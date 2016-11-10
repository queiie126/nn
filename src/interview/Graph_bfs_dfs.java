package interview;

/*
  This class implements BFS and DFS witha graph represented by adj list
 
  Complexity(s):
    Both are O(V);
 
 @HW
 */

class Graph_bfs_dfs{
    
    public static void main (String[] args){
        GraphDirectedUnweighted g = new GraphDirectedUnweighted(7);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.addEdge(3, 1);
        g.addEdge(3, 5);
        
        
      //  g.BFS(3);
       // g.BFS(1);
        //g.BFS(6);
        
      //  g.DFS(1);
        
        GraphDirectedUnweighted g2 = new GraphDirectedUnweighted(6);
        g2.addEdge(5, 2);
        g2.addEdge(5, 0);
        g2.addEdge(4, 0);
        g2.addEdge(4, 1);
        g2.addEdge(2, 3);
        g2.addEdge(3, 1);
        g2.kahntop();
       // g2.alltop();
        //System.out.println();
    }
}

