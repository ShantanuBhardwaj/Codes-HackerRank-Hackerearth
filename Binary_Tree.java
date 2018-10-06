class Binary_Tree{
	Node root;
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int item){
			data = item;
			left =null;
			right = null;
		}
		}
		public static void printLeafNodes(Node node) {
			if(node==null){
				return;
			}
   				if (node.left != null || node.right != null) 
				{
     		 				System.out.printf("%d ", node.data);
    			}
				printLeafNodes(node.left);
    			printLeafNodes(node.right);
 				}
	public static void main(String args[]){
		Binary_Tree bt  = new Binary_Tree();
		Node first  = new Node(3);
		Node second = new Node(7);
		Node third  = new Node(1);
		Node forth = new Node(9);
		bt.root = new Node(99);
		bt.root.left = first;
		bt.root.left = new Node(10);
		bt.root.right = second;
		bt.root.left.right = third;
		bt.root.right.right = forth;
		bt.root.right.left = new Node(12);
		printLeafNodes(bt.root);
	}

}