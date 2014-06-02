package ps3.graph;

public abstract class graph <T> {
	
	public abstract void addNode(T nodeName);
	public abstract void addEdge(T parentName, T childName);
	public abstract void listNodes();
	public abstract void listChildren(T parentName);
	
	
}
