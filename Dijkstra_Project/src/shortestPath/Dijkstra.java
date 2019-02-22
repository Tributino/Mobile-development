package shortestPath;

import java.util.ArrayList;

public class Dijkstra {
	private Node sourceNode;
	private Graph g;
	private Node destinationNode;
	
	
	public Dijkstra(Node sourceNode, Node destinationNode, Graph g) {
		this.sourceNode = sourceNode;
		this.destinationNode = destinationNode;
		this.g = g;
			
		
	}//



	public void run() {
	
		this.sourceNode.setLabel(null);
		this.sourceNode.setValue(0);
		
		ArrayList<Node> nodes = this.g.getNodes();
		int v = this.g.getNodes().indexOf(sourceNode);
		do {
		    
			for(int i=0; i< nodes.get(v).getNeighbors().size(); i++) {
			nodes.get(v).getNeighbors().get(i).update();
			}
			nodes.get(v).setVisited(true);	
			v = this.g.NextNode(nodes);

		}while(nodes.get(v)!=destinationNode && nodes.get(v).getValue()!=Integer.MAX_VALUE);
		
	}



	public ArrayList<String> func(){
		ArrayList<String> ShortPath = new ArrayList<String>();
		ShortPath.add(this.destinationNode.getName());
		Node curr = this.destinationNode;
		
		do {
		
		ShortPath.add(curr.getLabel());
		
		ArrayList<Node> nodes = this.g.getNodes();
	 
		for(Node n : nodes) {
			if(curr.getLabel() == n.getName())
				curr = n;
		}
	    
		}while(curr!=this.sourceNode);
		return ShortPath;
	}

	public void printShortPath() {
		System.out.print("");
		for(int i=func().size()-1;i>0; i--) {
			System.out.print(func().get(i) + "-->");
			}
		System.out.print(destinationNode.getName());
		System.out.println("\nDistance between " + sourceNode.getName() + " to " +
				destinationNode.getName() + " is " + destinationNode.getValue());
	}

	
	 


	
	
	


}
