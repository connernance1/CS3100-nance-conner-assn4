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
                t[i].run();
            }



            for(Thread threads : t){
                threads.join();
            }

            System.out.println(table.ResultTable);

            System.out.print("3.");
            for (int i = 1; i < table.ResultTable.size(); i++){
                System.out.print(table.ResultTable.get(i));
            }
        }
        catch (Exception ex){
            System.out.println("this broke");
        }


    }
}