import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Node {

	public int value;
	
	public List<Node> children;
	
	public Node(int value) {
		this.value = value;
		this.children = new ArrayList<>();
	}

	public void add(int value, int parentValue) {
		if (parentValue == this.value) {
			children.add(new Node(value));
		} else {
			children.forEach(child -> {
				child.add(value, parentValue);
			});
		}
	}
	
	public void delete(int value) {
		Node nodeWithValue = null, firstChild = null;
		for(Node child: children) {
			if (child.value == value) {
				nodeWithValue = child;
				if (!child.children.isEmpty()) {
					firstChild = child.children.get(0);
					firstChild.children.addAll(child.children.subList(1, child.children.size()));
					
				}
			}
		}
		if (nodeWithValue != null) {
			this.children.remove(nodeWithValue);
			if (firstChild != null) {
				this.children.add(firstChild);
			}
		} else {
			this.children.stream().forEach(child -> child.delete(value));
		}
	}
	
	private int buscarRecursivo(int value, int nivelAtual) {
		if (value == this.value) {
			return nivelAtual;
		} else {
			for (Node child : children) {
				int buscaEmChild = child.buscarRecursivo(value, nivelAtual+1);
				if (buscaEmChild != -1) {
					return buscaEmChild;
				}
			}
		}
		return -1;
	}
	
	public int buscar(int value) {
		return buscarRecursivo(value, 0);
	}
	
	@Override
	public String toString() {
		if (children.isEmpty()) {
			return "" + value;
		} else {
			return value + " (" + children.stream()
				.map(Node::toString)
				.collect(Collectors.joining(", ")) + ")";
		}
	}

}
