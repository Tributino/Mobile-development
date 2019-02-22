package shortestPath;

import java.util.ArrayList;

public class Node {
	
	private String name;
	private String label = "X";
	private boolean visited = false;
	private int value = Integer.MAX_VALUE;
	private ArrayList<Connection> neighbors = new ArrayList<Connection>();
	
	public Node(String name) {
		this.name = name;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public ArrayList<Connection> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(ArrayList<Connection> neighbors) {
		this.neighbors = neighbors;
	}

	@Override
	public String toString() {
		return "Node " + name + ", label=" + label + ", value=" + value;
	}

	
	
	
	

}
