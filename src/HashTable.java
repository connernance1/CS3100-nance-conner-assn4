import java.util.HashMap;
import java.util.LinkedList;

public class HashTable {

    HashMap<Integer, Integer> ResultTable = new HashMap<>();

    public void Results(LinkedList<Integer> TaskQueue){

            for(int i = 0; i < TaskQueue.size(); i++) {
                ResultTable.put(i, TaskQueue.indexOf(i));
            }
    }
}
