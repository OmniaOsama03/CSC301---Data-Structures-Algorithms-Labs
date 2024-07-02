package Lab9;
public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    // CountSingleParents: returns how many nodes have a single child.
    public int CountSingleParents() {
        return CountSingleParents(root);
    }

    protected int CountSingleParents(TreeNode<E> node) {
        if (node == null) return 0;
        if (node.hasOnlyOneChild())
            return 1 + CountSingleParents(node.left) + CountSingleParents(node.right);
        else return 0;

//	 return (node.hasOnlyOneChild() ? 1 : 0) + CountSingleParents(node.left)+ CountSingleParents(node.right);
    }

    // Max: returns the maximum of the BST.
    public E Max() {
        if (root.element == null) return null;
        return Max(root);
    }

    protected E Max(TreeNode<E> node) {
        if (!node.hasRight()) return node.element;
        return Max(node.right);
    }


    //Min: returns the minimum of the BST.
    public E Min() {
        if (isEmpty()) return null;
        return Min(root);
    }

    protected E Min(TreeNode<E> node) {
        if (!node.hasLeft()) return node.element;
        return Min(node.left);
    }

// Equal  (checks if two trees are equal).
    public Boolean Equal(BST<E> tree) {
        if (tree == null) return false;
        return Equal(this.root, tree.root);
    }

    protected boolean Equal(TreeNode<E> node1, TreeNode<E> node2) {
//Preorder
        if (node1 == null && node2 == null) return true;
        if (node1 != null && node2 == null) return false;
        if (node1 == null && node2 != null) return false;
        if (!node1.element.equals(node2.element)) return false;
        return Equal(node1.left, node2.left) && Equal(node1.right, node2.right);}

    public void print() {
        print("", this.root, true);
    }

    public void print(String prefix, TreeNode<E> n, boolean isLeft) {
        if (n != null) {
            System.out.println(prefix + (isLeft ? "|--" : " └--") + n.element);
            print(prefix + (isLeft ? "|   " : "    "), n.right, true);
            print(prefix + (isLeft ? "|  " : "   "), n.left, false);
        }
    }

    /* Create a default binary search tree */
    public BST() { }

    /* Create a binary search tree from an array of objects */
    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }

    @Override /* Return true if the element is in the tree */
    public boolean search(E e) {
        TreeNode<E> current = root; // Start from the root
        while (current != null) {
            if (e.compareTo(current.element) < 0)
                current = current.left;
            else if (e.compareTo(current.element) > 0)
                current = current.right;
            else // element matches current.element
                return true; // Element is found
        }
        return false;
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override /* Insert element e into the binary search tree.
     * Return true if the element is inserted successfully. */
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e); // Create a new root
        else {
            // Locate the parent node
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null)
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else
            return false; // Duplicate node not inserted

            // Create the new node and attach it to the parent node
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }

        size++;
        return true; // Element inserted successfully
    }

    @Override /* Inorder traversal from the root */
    public void inorder() {
        inorder(root);
    }

    /* Inorder traversal from a subtree */
    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print("(" + root.element + ") ");
        inorder(root.right);
    }

    @Override /* Postorder traversal from the root */
    public void postorder() {
        postorder(root);
    }

    /* Postorder traversal from a subtree */
    protected void postorder(TreeNode<E> root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print("(" + root.element + ") ");
    }

    @Override /* Preorder traversal from the root */
    public void preorder() {
        preorder(root);
    }

    /* Preorder traversal from a subtree */
    protected void preorder(TreeNode<E> root) {
        if (root == null) return;
        System.out.print("(" + root.element + ") ");
	    preorder(root.left);
	    preorder(root.right);
    }

    @Override /* Get the number of nodes in the tree */
    public int getSize() {
        return size;
    }

    /* Returns the root of the tree */
    public TreeNode<E> getRoot() {
        return root;
    }

    /* Remove all elements from the tree */
    public void clear() {
        root = null;
        size = 0;
    }

    /* Returns a path from the root leading to the specified element */
    public java.util.ArrayList<TreeNode<E>> path(E e) {
        java.util.ArrayList<TreeNode<E>> list = new java.util.ArrayList<>();
        TreeNode<E> current = root; // Start from the root
        boolean found = false;
        while (current != null && !found) {
		list.add(current); // Add the node to the list
            if (e.  compareTo(current.element) < 0)
                current = current.left;
            else if (e.compareTo(current.element) > 0)
                current = current.right;
            else found = true;
        }

        return list; // Return an array list of nodes
    }

    @Override /* Delete an element from the binary search tree.
     * Return true if the element is deleted successfully.
     * Return false if the element is not in the tree. */
    public boolean delete(E e) {
        // Locate the node to be deleted and also locate its parent node
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        boolean found = false;
        while (current != null && !found) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else
                found = true ; // Element is in the tree pointed at by current
        }

        if (found) {
            // Case 1: current has no left child
            if (current.left == null) {
                // Connect the parent with the right child of the current node
                if (parent == null)
                    root = current.right;
                else if (e.compareTo(parent.element) < 0)
                    parent.left = current.right;
                else
                    parent.right = current.right;
            } else {
                // Case 2: The current node has a left child.
                // Locate the rightmost node in the left subtree of
                // the current node and also its parent.
                TreeNode<E> parentOfRightMost = current;
                TreeNode<E> rightMost = current.left;

                while (rightMost.right != null) {
                    parentOfRightMost = rightMost;
                    rightMost = rightMost.right; // Keep going to the right
                }

                // Replace the element in current by the element in rightMost
                current.element = rightMost.element;

                // Eliminate rightmost node
                if (parentOfRightMost.right == rightMost)
                    parentOfRightMost.right = rightMost.left;
                else
                    // Special case: parentOfRightMost == current
                    parentOfRightMost.left = rightMost.left;
            }
            size--;
        }
        return found; // Element deleted successfully
    }

    @Override /* Obtain an iterator. Use inorder. */
    public java.util.Iterator<E> iterator() {
        return new InorderIterator();
    }

    // Inner class InorderIterator
    private class InorderIterator implements java.util.Iterator<E> {
        // Store the elements in a list
        private java.util.ArrayList<E> list = new java.util.ArrayList<>();
        private int current = 0; // Point to the current element in list

        public InorderIterator() {
            inorder(); // Traverse binary tree and store elements in list
        }

        /* Inorder traversal from the root*/
        private void inorder() {
            inorder(root);
        }

        /* Inorder traversal from a subtree */
        private void inorder(TreeNode<E> root) {
            if (root == null) return;
            inorder(root.left);
            list.add(root.element);
            inorder(root.right);
        }

        @Override /* More elements for traversing? */
        public boolean hasNext() {
            if (current < list.size())
                return true;
            return false;
        }

        @Override /* Get the current element and move to the next */
        public E next() {
            return list.get(current++);
        }

        @Override /* Remove the current element */
        public void remove() {
            delete(list.get(current)); // Delete the current element
            list.clear(); // Clear the list
            inorder(); // Rebuild the list
        }
    }
}
