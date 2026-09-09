/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node,Node> m = new HashMap<>();
    public Node cloneGraph(Node n) {
        if(n == null) return null;
        
        if(m.containsKey(n)){
            return m.get(n);
        }

        Node c = new Node(n.val);

        m.put(n,c);

        for(Node neighbor : n.neighbors){
            c.neighbors.add(cloneGraph(neighbor));
        }
        return c;
    }
}