package shortestPath;



public class Connection {
	private Node sourceNode;
	private Node destinationNode;
	private int length;
	
	
	public Connection(Node sourceNode, Node destinationNode, int length) {
		this.sourceNode = sourceNode;
		this.destinationNode = destinationNode;
		this.length = length;
	}


	public Node getsourceNode() {
		return sourceNode;
	}


	public void setsourceNode(Node sourceNode) {
		this.sourceNode = sourceNode;
	}


	public Node getdestinationNode() {
		return destinationNode;
	}


	public void setdestinationNode(Node destinationNode) {
		this.destinationNode = destinationNode;
	}


	public int getlength() {
		return length;
	}


	public void setlength(int length) {
		this.length = length;
	}
	
	// _____________________________________Update Function _________________________	
    
    public void update( ) {
			// New Label for the destination.
			String neighbourLabel = this.sourceNode.getName();
			this.destinationNode.setLabel(neighbourLabel);
			
			// New Value for the destination.
			if(!this.destinationNode.isVisited()) {
				int cost = this.sourceNode.getValue()+this.getlength();
				
				if(cost<this.destinationNode.getValue()) {
					this.destinationNode.setValue(cost);
				}
			}
	
		}
	
	

}
