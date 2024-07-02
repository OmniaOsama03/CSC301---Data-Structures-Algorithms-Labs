package Lab9;
public class testBST {
    public static void main(String[] args) {
        BST_Integer tree1, tree2;
        int[] intArray = {18, 4, 10, 60, 40, 100, 2, 1, 200, 250,5, 6, 40, 4, 30, 3,5};
        tree1 = new BST_Integer(intArray);

        tree1.print();
        System.out.println("Inorder: ");
        tree1.inorder();
        System.out.println("\n");

        System.out.println("PostOrder: ");
        tree1.postorder();
        System.out.println("\n");

        System.out.println("PreOrder: ");
        tree1.preorder();
        System.out.println("\n");

        System.out.println("Sum of tree 1: ");
        System.out.println(tree1.sum());
        System.out.println("\n");

        System.out.println("Sum of leaves of tree 1: ");
        System.out.println(tree1.sumLeaves());
        System.out.println("\n");

        System.out.println("Odd count of tree 1: ");
        System.out.println(tree1.countOdd());
        System.out.println("\n");

        System.out.println("Count of single parents of tree 1: ");
        System.out.println(tree1.CountSingleParents());
        System.out.println("\n");

        System.out.println("Calling rightDoubleLeft tree 1: ");
        System.out.println(tree1.RightDoubleLeft());
        System.out.println("\n");

        System.out.println("Max of tree 1: ");
        System.out.println(tree1.Max());
        System.out.println("\n");

        System.out.println("Min of tree 1: ");
        System.out.println(tree1.Min());
        System.out.println("\n");

        System.out.println("Number of occurrences of 5 of tree 1: ");
        System.out.println(tree1.NumberOfOccurrences(5));
        System.out.println("\n");

        System.out.println("Sum of all lefts in tree 1: ");
        System.out.println(tree1.SumAllLefts());
        System.out.println("\n");

        System.out.println("Deleting 4 in tree 1: ");
        System.out.println(tree1.delete(4));
        System.out.println("\n");

        int[] intArray2 = {05, 4, 10, 60, 40, 100, 2, 1, 200, 250,5, 6, 40, 4, 30, 3,5};
        tree2 = new BST_Integer(intArray2);

        System.out.println("Are the 2 trees equal? ");
        System.out.println(tree1.equals(tree2));
    }
}
