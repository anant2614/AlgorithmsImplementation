package HackeEarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AVLTree {
		public Node1 root;

		public static void main(String[] args) {
			int arr[] = { 10, 6, 15, 20, 30, 5, 7 };
			int myarr[] = new int[arr.length];

			constructLowerArray(arr, myarr, arr.length);
			printArray(myarr, arr.length);
			/* Constructing tree given in the above figure */

		}		
		
		int height(Node1 N) {
			if (N == null) {
				return 0;
			}
			return N.height;
		}

		int size(Node1 N) {
			if (N == null) {
				return 0;
			}
			return N.size;
		}

		// A utility function to get maximum of two integers
		int max(int a, int b) {
			return (a > b) ? a : b;
		}

		// A utility function to right rotate subtree rooted with y
		// See the diagram given above.
		Node1 rightRotate(Node1 y) {
			Node1 x = y.left;
			Node1 T2 = x.right;

			// Perform rotation
			x.right = y;
			y.left = T2;

			// Update heights
			y.height = max(height(y.left), height(y.right)) + 1;
			x.height = max(height(x.left), height(x.right)) + 1;

			y.size = size(y.left) + size(y.right) + 1;
			x.size = size(x.left) + size(x.right) + 1;

			// Return new root
			return x;
		}

		// A utility function to left rotate subtree rooted with x
		// See the diagram given above.
		Node1 leftRotate(Node1 x) {
			Node1 y = x.right;
			Node1 T2 = y.left;

			// Perform rotation
			y.left = x;
			x.right = T2;

			// Update heights
			x.height = max(height(x.left), height(x.right)) + 1;
			y.height = max(height(y.left), height(y.right)) + 1;

			x.size = size(x.left) + size(x.right) + 1;
			y.size = size(y.left) + size(y.right) + 1;

			// Return new root
			return y;
		}

		// Get Balance factor of Node1 N
		int getBalance(Node1 N) {
			if (N == null) {
				return 0;
			}
			return height(N.left) - height(N.right);
		}

		Node1 insert(Node1 Node1, int key, int[] myarr, int i) {

			/* 1. Perform the normal BST rotation */
			if (Node1 == null) {
				return (new Node1(key));
			}

			if (key < Node1.key) {
				Node1.left = insert(Node1.left, key, myarr, i);

			} else {
				Node1.right = insert(Node1.right, key, myarr, i);
				myarr[i] = myarr[i] + size(Node1.left) + 1;

			}

			/* 2. Update height of this ancestor Node1 */
			Node1.height = max(height(Node1.left), height(Node1.right)) + 1;
			Node1.size = size(Node1.left) + size(Node1.right) + 1;

			/*
			 * 3. Get the balance factor of this ancestor Node1 to check whether
			 * this Node1 became unbalanced
			 */
			int balance = getBalance(Node1);

			// If this Node1 becomes unbalanced, then there are 4 cases
			// Left Left Case
			if (balance > 1 && key < Node1.left.key) {
				return rightRotate(Node1);
			}

			// Right Right Case
			if (balance < -1 && key > Node1.right.key) {
				return leftRotate(Node1);
			}

			// Left Right Case
			if (balance > 1 && key > Node1.left.key) {
				Node1.left = leftRotate(Node1.left);
				return rightRotate(Node1);
			}

			// Right Left Case
			if (balance < -1 && key < Node1.right.key) {
				Node1.right = rightRotate(Node1.right);
				return leftRotate(Node1);
			}

			/* return the (unchanged) Node1 pointer */
			return Node1;
		}

		// A utility function to print preorder traversal of the tree.
		// The function also prints height of every Node1
		void preOrder(Node1 Node1) {
			if (Node1 != null) {
				System.out.print(Node1.key + " ");
				preOrder(Node1.left);
				preOrder(Node1.right);
			}
		}

		public static void constructLowerArray(int arr[], int myarr[], int n) {
			int i, j;
			AVLTree tree = new AVLTree();

			// Starting from rightmost element, insert all elements one by one
			// in
			// an AVL tree and get the count of smaller elements
			for (i = n - 1; i >= 0; i--) {
				tree.root = tree.insert(tree.root, arr[i], myarr, i);
			}
			// tree.preOrder(root);
		}

		public static void printArray(int arr[], int size) {
			int i;
			for (i = 0; i < size; i++)
				System.out.print(arr[i] + " ");
		}

	}
