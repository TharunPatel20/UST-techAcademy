package trees;


//Write the program based on trees in java 
class Node{
	int value;
	Node left;
	Node right;
	
	Node(int value){
		this.value=value;
		left=null;
		right=null;
	}
}

//Write the program to insert the node algorithms in a tree and delete the 
//node algorithms from a tree in java

public class TreeDataStructure {
	Node root ;
	public static void main(String args[]) {
		
		TreeDataStructure tree = new TreeDataStructure();
		tree.addNode(10);
		tree.addNode(1);
		tree.addNode(20);
		tree.addNode(30);
		tree.addNode(0);
		tree.addNode(100);
		tree.addNode(19);
		tree.addNode(2);
		tree.addNode(3);
		tree.addNode(220);
		
		System.out.println("tree nodes before deletion");
		System.out.print("Inorder \t");
		tree.printInOrder();
		System.out.print("Preorder\t");
		tree.printPreOrder();
		System.out.print("Postorder\t");
		tree.printPostOrder();
		
		
		tree.deleteNode(10);
		tree.deleteNode(220);
		tree.deleteNode(0);
		System.out.println("tree nodes after deletion");
		
		
		System.out.print("Inorder \t");
		tree.printInOrder();
		System.out.print("Preorder\t");
		tree.printPreOrder();
		System.out.print("Postorder\t");
		tree.printPostOrder();
	}

	void addNode(int i) {root = InsertTreeNode(root,i);}
	void deleteNode(int value) {root = deleteNodeRecursive(root,value);}
	void printInOrder(){printRecursiveInOrder(root);System.out.println();}
	void printPreOrder() {printRecursivePreOrder(root);System.out.println();}
	void printPostOrder(){printRecursivePostOrder(root);System.out.println();}
	
	
	private Node InsertTreeNode(Node root, int newValue) {
		if(root==null) { root = new Node(newValue); return root;}
		if(root.value > newValue)root.left =InsertTreeNode( root.left,  newValue);
		else if(root.value < newValue)root.right =InsertTreeNode( root.right,  newValue);
		return root;
	}
	private Node deleteNodeRecursive(Node root, int value) {
		if(root == null) return root;
		else if(root.value > value) root.left = deleteNodeRecursive(root.left,value);
		else if(root.value < value)root.right = deleteNodeRecursive(root.right,value);
		else {
			if(root.left == null) return root.right;
			else if(root.right == null) return root.left;
			root.value = minimumValue(root.right);
			root.right = deleteNodeRecursive(root.right,root.value);
		}
		return root;
	}
	int minimumValue(Node node) {
		int minVal=node.value;
		while(node!=null) {
			minVal = node.value;
			node = node.left;
		}
		return minVal;
	}
	private void printRecursiveInOrder(Node root) {
		if(root!=null) {
			printRecursiveInOrder(root.left);
			System.out.print(root.value +" ");
			printRecursiveInOrder(root.right);
		}
	}
	private void printRecursivePreOrder(Node root) {
		if(root!=null) {
			System.out.print(root.value +" ");
			printRecursiveInOrder(root.left);
			printRecursiveInOrder(root.right);
		}
	}
	private void printRecursivePostOrder(Node root) {
		if(root!=null) {
			printRecursiveInOrder(root.left);
			printRecursiveInOrder(root.right);
			System.out.print(root.value +" ");
		}
	}
}

