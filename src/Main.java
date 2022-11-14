public class Main {
    public static void main(String[] args) {

        //Problem1 solution
        int[] arr=new int[]{3,1,2};
        Problem1.buildOnADay(arr,3);
        arr=new int[]{4,5,1,2,3};
        Problem1.buildOnADay(arr,5);


        //Problem2 solution
        BinarySearchTree root=new BinarySearchTree(50);
        root=Problem2.inputTree(root,30);
        root=Problem2.inputTree(root,10);
        root=Problem2.inputTree(root,60);
        root=Problem2.inputTree(root,55);
        System.out.println();
       root= Problem2.skewedTree(root);
        System.out.println();

    }
}