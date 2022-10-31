public class MyTree {
    TNode root;

    public MyTree() {

    }

    void insert(int value) {
        TNode newNode = new TNode(value);
        if (root == null) {
            root = newNode;
            return;
        }
        TNode current = root;
        while (true) {
            if (value <= current.value) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;
            }

        }
    }
//preorder transversal of the tree
    // root left right
    void preOrderTraversal(TNode root){
        if (root==null) return;
        System.out.println(root.value);
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }
    void inOrderTraversal(TNode root){
        if (root==null) return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value+", ");
        inOrderTraversal(root.rightChild);
    }

}
