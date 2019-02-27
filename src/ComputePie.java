import java.util.HashMap;
import java.util.LinkedList;

public class ComputePie implements Runnable {

    private LinkedList TaskQueue;
    private HashTable hash;
    private int i = 0;

    public ComputePie(TaskQueue queue, HashTable hashTable){
        this.TaskQueue = queue.MyList();
        this.hash = hashTable;
    }

    public void run() {

        Bpp bpp = new Bpp();
        TaskQueue myTQ = new TaskQueue();

        try {
            while (this.TaskQueue.size() > 0) {

                long key = myTQ.getNext(this.TaskQueue);
                int temp = bpp.getDecimal(key);
                int value = temp / 100000000;
                this.hash.ResultTable.put((int)key, value);
            }

            System.out.print(".");

        }
        catch (Exception ex) {
            System.out.println("Error. Error.");
            ex.printStackTrace();
        }

    }
}
