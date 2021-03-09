package vvi_example;

import java.util.LinkedList;
import java.util.Queue;

class Node
{
	int data;
	Node left, right;
	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}

class BinaryTree
{
	
	static Node root;

	public  BinaryTree()
	{
		root = null;
	}

	
	void printLevelOrder()
	{
		int h = height(root);
		int i;
		for (i=1; i<=h; i++)
			printGivenLevel(root, i);
	}

	
	int height(Node root)
	{
		if (root == null)
		return 0;
		else
		{
			
			int lheight = height(root.left);
			int rheight = height(root.right);
			
			
			if (lheight > rheight)
				return(lheight+1);
			else return(rheight+1); 
		}
	}
	 void printPostorder(Node node) 
	    { 
	        if (node == null) 
	            return; 
	  
	        // first recur on left subtree 
	        printPostorder(node.left); 
	  
	        // then recur on right subtree 
	        printPostorder(node.right); 
	  
	        // now deal with the node 
	        System.out.print(node.data + " "); 
	    } 
	  

	
	void printGivenLevel (Node root ,int level)
	{
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1)
		{
			printGivenLevel(root.left, level-1);
			printGivenLevel(root.right, level-1);
		}
	}
	 void printInorder(Node node) 
	    { 
	        if (node == null) 
	            return; 
	  
	        /* first recur on left child */
	        printInorder(node.left); 
	  
	        /* then print the data of node */
	        System.out.print(node.data + " "); 
	  
	        /* now recur on right child */
	        printInorder(node.right); 
	    } 
	 void printPreorder(Node node) 
	    { 
	        if (node == null) 
	            return; 
	  
	        /* first print data of node */
	        System.out.print(node.data + " "); 
	  
	        
	        printPreorder(node.left); 
	  
	        /* now recur on right subtree */
	        printPreorder(node.right); 
	    } 
	 int getLeafCount(Node node)  
	    { 
	        if (node == null) 
	            return 0; 
	        if (node.left == null && node.right == null) 
	            return 1; 
	        else
	            return getLeafCount(node.left) + getLeafCount(node.right); 
	    } 
	 static void delete(Node root, int key) 
	 { 
	     if (root == null)  
	         return;  
	           
	     if (root.left == null &&  
	        root.right == null) 
	     {  
	         if (root.data == key)  
	             return;  
	         else
	             return;  
	     } 
	       
	     Queue<Node> q = new LinkedList<Node>();  
	     q.add(root); 
	     Node temp = null, keyNode = null; 
	       
	     // Do level order traversal until 
	     // we find key and last node.  
	     while (!q.isEmpty()) 
	     {  
	         temp = q.peek();  
	         q.remove();  
	           
	         if (temp.data == key)  
	             keyNode = temp;  
	   
	         if (temp.left != null)  
	             q.add(temp.left);  
	   
	         if (temp.right != null)  
	             q.add(temp.right);  
	     }  
	   
	     if (keyNode != null) 
	     {  
	         int x = temp.data;  
	         deleteDeepest(root, temp);  
	         keyNode.data = x;  
	     }  
	 } 
				 static void deleteDeepest(Node root, 
			             Node delNode) 
			{ 
			Queue<Node> q = new LinkedList<Node>();  
			q.add(root); 
			
			Node temp = null; 
			
			// Do level order traversal until last node  
			while (!q.isEmpty()) 
			{  
			temp = q.peek();  
			q.remove(); 
			
			if (temp == delNode) 
			{  
			temp = null;  
			return;  
			 
			}  
			if (temp.right!=null) 
			{  
			if (temp.right == delNode) 
			{  
			   temp.right = null;  
			   return;  
			}  
			else
			q.add(temp.right);  
			}  
			
			if (temp.left != null)  
			{  
			if (temp.left == delNode) 
			{  
			temp.left = null;  
			return;  
			}  
			else
			q.add(temp.left);  
			}  
			}  
			} 
		boolean isLeaf(Node root,int key) {
			       
					    if (root == null)
					        return false; 
					   
					    if (root.right == null && root.left == null&&root.data==key)
					       return true;
					    else
					    return false; 
					    
					}
	
	public static void main(String args[])
	{
	BinaryTree tree = new BinaryTree();
	tree.root= new Node(1);
	tree.root.left= new Node(2);
	tree.root.right= new Node(3);
	tree.root.left.left= new Node(4);
	tree.root.left.right= new Node(5);
	tree.root.left.right.left=new Node(12);
		
	System.out.println("Level order traversal of binary tree is ");
	tree.printLevelOrder();
	System.out.println();
	tree.printPostorder(root);
	System.out.println();
	tree.printInorder(root);
	System.out.println();
	tree.printPreorder(root) ;
	tree.delete(root,12);
	System.out.println();
	tree.printLevelOrder();
	System.out.println();
	 System.out.println(tree.getLeafCount(root));
	 if(tree.isLeaf(root,12))
		 System.out.println("given binary tree node is a leaf");
	 else
		 System.out.println("given binary tree node is not a leaf");
	 System.out.println("number of leafs  "+tree.getLeafCount(root));
	}
}
