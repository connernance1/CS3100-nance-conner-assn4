import java.util.HashMap;
import java.util.LinkedList;

public class ComputePie implements Runnable {

    private LinkedList TaskQueue;
    private HashMap HashTable;
    private int i = 0;

    public ComputePie(TaskQueue queue, HashTable hashTable){
        this.TaskQueue = queue.MyList();
        this.HashTable = hashTable.ResultTable;
    }

    public void run() {

        Bpp bpp = new Bpp();
        TaskQueue myTQ = new TaskQueue();

        try {
            while (TaskQueue.size() > 0) {
                int temp = bpp.getDecimal(myTQ.getNext(this.TaskQueue));
                this.HashTable.put(i, temp);
                i++;
            }

            System.out.println("hello");


//            for(int j = 1; j <= TaskQueue.size(); j++){
//                t[0].run();
//            }
        }
        catch (Exception ex) {
            System.out.println("Error. Error.");
            ex.printStackTrace();
        }

    }
}
