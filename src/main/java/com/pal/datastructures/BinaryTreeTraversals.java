package com.pal.datastructures;

import com.pal.utils.Node;

public class BinaryTreeTraversals {

	Node root;
	public BinaryTreeTraversals() {
		root =null;
	}
	public static void main(String[] args) {
			BinaryTreeTraversals binaryTreeTraversals = new BinaryTreeTraversals();
			binaryTreeTraversals.root = new Node(1);
			binaryTreeTraversals.root.left = new Node(2);
			binaryTreeTraversals.root.right = new Node(3);
			binaryTreeTraversals.root.left.left = new Node(4);
			binaryTreeTraversals.root.left.right = new Node(5);
			
			System.out.println("-----------LDR-----Preorder------");
			binaryTreeTraversals.ldrTraversals(binaryTreeTraversals.root);
			System.out.print("\n");
			System.out.println("-----------LRD-----Inorder-----");
			binaryTreeTraversals.lrdTraversals(binaryTreeTraversals.root);
			System.out.print("\n");
			System.out.println("-----------DLR-----Postorder----");
			binaryTreeTraversals.dlrTraversals(binaryTreeTraversals.root);
			System.out.print("\n");
		
		}
	
		public void ldrTraversals(Node node) {
			if(node!=null) {
				ldrTraversals(node.left);
				System.out.print(node.value);
				ldrTraversals(node.right);
			}
			
		}
		
		public void lrdTraversals(Node node) {
			if(node!=null) {
				lrdTraversals(node.left);
				lrdTraversals(node.right);
				System.out.print(node.value);
			}
		}
		public void dlrTraversals(Node node) {
			if(node!=null) {
				System.out.print(node.value);
				dlrTraversals(node.left);
				dlrTraversals(node.right);
			}	
		}
	}
