import java.util.Comparator;

public class MaxComparator implements Comparator<Integer> {
    //for passing it to priority queue so that we can make it maxx priority queue.


    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1<o2)
            return 1;
        else if (o1>o2) {
            return -1;

        }
        return 0;
    }
}
