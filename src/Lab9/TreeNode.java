package Lab9;

//Omnia Osama Ahmed 1084505
public class TreeNode<E extends Comparable<E>> {
    protected E element;
    protected TreeNode<E> left, right;

    public TreeNode(E e) {
        element = e;
    }
    public boolean hasLeft () { return left != null;}
    public boolean hasRight () { return right != null;}
    public boolean hasTwoChildren () { return left != null && right != null;}
    public boolean hasOnlyOneChild () {
        return (left != null && right == null) || (left == null && right != null);

// Other versions:
//		return !hasTwoChildren() && !isLeaf();
    }

    public boolean isLeaf () { return left == null && right == null;}


}

