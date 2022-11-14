import java.util.PriorityQueue;

public class Problem1 {

    public static void buildOnADay(int[] arr, int n){
        PriorityQueue<Integer> pq=new PriorityQueue<>(new MaxComparator());
        int k=0;
        for(int i=0;i<n;i++){
            System.out.println("Day "+(i+1));
            if(arr[i]==n-k){
                System.out.print(arr[i]+" ");
                k++;
                while(!pq.isEmpty()){
                    if(pq.peek()==n-k){
                        System.out.print(pq.remove()+" ");
                        k++;
                    }else break;
                }
                System.out.println();

            }else{ pq.add(arr[i]);
                System.out.println();}
        }
    }
}
