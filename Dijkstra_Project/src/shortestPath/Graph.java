package shortestPath;

import java.util.ArrayList;

public class Graph {

	private ArrayList<Node> nodes;
	private ArrayList<Connection> connections;
	
	public Graph(ArrayList<Node> nodes, ArrayList<Connection> connections) {
		this.nodes = nodes;
		this.connections = connections; 
		// Create the ArrayList<Connection> field of each node
		for(int i = 0; i<this.connections.size() ; i++) {
			this.connections.get(i).getsourceNode().getNeighbors().add(this.connections.get(i));
		}
	}
	
	

	public ArrayList<Node> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}

	public ArrayList<Connection> getConnections() {
		return connections;
	}

	public void setConnections(ArrayList<Connection> connections) {
		this.connections = connections;
	}
	
	
	
    
	//Pick the next unvisited node to visit(find the node with the lowest value) and call that node.

	
	public int NextNode(ArrayList<Node> node) {
		int v = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<this.nodes.size();i++) {
			int currCost = this.nodes.get(i).getValue();
			if(!this.nodes.get(i).isVisited() && currCost<min) {
			min = currCost;
			v = i;
			}
		}
		return v;
	}

	@Override
	public String toString() {
		return "Graph [nodes=" + nodes + ", connections=" + connections + "]";
	}
	
	
	
	
    
}
