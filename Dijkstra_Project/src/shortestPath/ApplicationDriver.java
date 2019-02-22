package shortestPath;

import java.util.ArrayList;

public class ApplicationDriver {

	public static void main(String[] args) {
		
		ArrayList<Node> nodes = new ArrayList<Node>();
		ArrayList<Connection> connections = new ArrayList<Connection>();
		
		Node A = new Node("A");
		Node B = new Node("B");
		Node C = new Node("C");
		Node D = new Node("D");
		Node E = new Node("E");
		Node F = new Node("F");
		
		nodes.add(A);
		nodes.add(B);
		nodes.add(C);
		nodes.add(D);
		nodes.add(E);
		nodes.add(F);
		
		Connection CAB = new Connection(A, B, 10);
		Connection CAC = new Connection(A, C, 5);
		Connection CBD = new Connection(B, D, 1);
		Connection CCB = new Connection(C, B, 3);
		Connection CCD = new Connection(C, D, 8);
		Connection CCE = new Connection(C, E, 2);
		Connection CDE = new Connection(D, E, 4);
		Connection CDF = new Connection(D, F, 4);
		Connection CEF = new Connection(E, F, 6);
		
		connections.add(CAB);
		connections.add(CAC);
		connections.add(CBD);
		connections.add(CCB);
		connections.add(CCD);
		connections.add(CCE);
		connections.add(CDE);
		connections.add(CDF);
		connections.add(CEF);
		
		
		
		Graph g = new Graph(nodes, connections);			
		Dijkstra d = new Dijkstra(A, F, g);
		d.run();
		
		
		for(int i=0;i<nodes.size();i++) {
        System.out.println(nodes.get(i).toString());
		}
		
		d.printShortPath();
			
			
     

}
}
