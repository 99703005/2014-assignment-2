package ps3.graph;

import java.util.*;

public class GraphPS <T> extends graph <T>  {

	private Map<T, List<T>> adjacencyList;
	
	public GraphPS() {
        this.adjacencyList = new HashMap<T, List<T>> ();
	}
	
	public void addNode(T nodeName) {
		if (nodeName == null) {
            throw new IllegalArgumentException("null");
        }        
        
        adjacencyList.put(nodeName, new ArrayList<T>());
	}
	public void addEdge(T parentName, T childName) {
		if (parentName == null) {
            throw new IllegalArgumentException("null");
        }
		adjacencyList.get(parentName).add(childName);
	}
	public void listNodes() {
		adjacencyList.keySet();
	}
	public void listChildren(T parentName) {
		adjacencyList.get(parentName);
	}
}
