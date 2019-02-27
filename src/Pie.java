import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections.*;
import java.util.HashMap;


public class Pie {




    private static TaskQueue queue = new TaskQueue();
    private static HashTable table = new HashTable();


    public static void main(String[] args) {

        try{
            Thread[] t = new Thread[Runtime.getRuntime().availableProcessors()];
            long timeStart = System.currentTimeMillis();

            for(int i = 0; i < Runtime.getRuntime().availableProcessors(); i++) {
                t[i] = new Thread(new ComputePie(queue, table));
                t[i].start();
            }


            for(Thread threads : t){
                threads.join();
            }

        }
        catch (Exception ex){
            System.out.println("this broke");
        }


    }
}