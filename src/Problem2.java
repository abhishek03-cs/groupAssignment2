public class Problem2 {
    public static BinarySearchTree skewedTree(BinarySearchTree root){
        if(root==null)
            return null;
        root.left=skewedTree(root.left);
        root.right =skewedTree(root.right);
        if(root.left==null)
            return root;
        BinarySearchTree temp=root.left;
        while(temp.right!=null){
            temp=temp.right;
        }
        temp.right=root;
        temp.left=null;
        temp=root.left;
        root.left=null;
        return temp;
    }

    public static BinarySearchTree inputTree(BinarySearchTree root, int data){
        if(root==null){
            return new BinarySearchTree(data);
        }
        if(root.data>data)
            root.left=inputTree(root.left,data);
        else root.right=inputTree(root.right,data);
        return root;
    }
}
