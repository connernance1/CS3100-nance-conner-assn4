import javafx.concurrent.Task;

import java.util.ArrayList;
import java.util.LinkedList;

public class TaskQueue{

    private static ArrayList<Long> list = new ArrayList<>();
    private static LinkedList TaskQueue = new LinkedList();
    private static int i = 0;

    public static LinkedList MyList() {
        for(long i = 0; i < 999; i++) {
            list.add(i);
        }

        java.util.Collections.shuffle(list);

        for (Long item: list){
            TaskQueue.add(item);
        }

        for(Object item: TaskQueue){
            System.out.println(item);
        }

        return TaskQueue;
    }

    synchronized long getNext(LinkedList TaskQueue) {
        if(i == 0){
            return TaskQueue.indexOf(i);
        }
        else {
            i++;
            return TaskQueue.indexOf(i);
        }
    }
}
