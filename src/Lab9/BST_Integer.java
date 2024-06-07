package Lab9;
//Omnia Osama Ahmed 1084505
public class BST_Integer extends BST<Integer> {

    public BST_Integer(int[] array) {
        for (int i = 0; i < array.length; i++)
            insert(Integer.valueOf(array[i]));
    }

    //SumAllLefts: returns the sum of all left nodes' values
    public Integer SumAllLefts() {
        return SumAllLefts(root);
    }

    protected Integer SumAllLefts(TreeNode<Integer> node) {
        if (node == null) return 0;
        if (!node.hasLeft()) return SumAllLefts(node.right);
        return node.left.element + SumAllLefts(node.left) + SumAllLefts(node.right);
    }

    // NumberOfOccurrences (counts the number of time an item multiple of VAL appeared in the tree)
    public int NumberOfOccurrences(Integer VAL) {
        return NumberOfOccurrences(root, VAL);
    }

    protected int NumberOfOccurrences(TreeNode<Integer> node, Integer VAL) {
        if (node == null) return 0;
        return (node.element.equals(VAL) ? 1 : 0) + NumberOfOccurrences(node.left, VAL) + NumberOfOccurrences(node.right, VAL);
    }

    //RightDoubleLeft: counts number of nodes having right's value equal to double to left's value
    public int RightDoubleLeft() {
        return RightDoubleLeft(root);
    }

    protected int RightDoubleLeft(TreeNode<Integer> node) {
        if (node == null) return 0;
        return ((node.hasLeft() && node.right!= null &&(node.right.element == 2 * node.left.element)) ? 1 : 0) +
                RightDoubleLeft(node.left) + RightDoubleLeft(node.right);
    }

    public Integer sum() {
        return sum(root);
    }

    protected Integer sum(TreeNode<Integer> root) {
        if (root == null) return 0;
        return root.element + sum(root.left)+ sum(root.right);
    }

    public Integer sumLeaves() {
        return sumLeaves(root);
    }

    protected Integer sumLeaves(TreeNode<Integer> node) {
        if (node == null) return 0;
        if (node.isLeaf()) return node.element;
        return sumLeaves(node.left) + sumLeaves(node.right);
    }

    // CountOdd: counts number of nodes storing odd values
    public Integer countOdd() {
        return countOdd(root);
    }

    protected Integer countOdd(TreeNode<Integer> node) {
        if (node == null) return 0;
        if (node.element %2 != 0) // it is odd
        return 1 + countOdd(node.left) + countOdd(node.right);
		else return 0 + countOdd(node.left) + countOdd(node.right);
    }

}



