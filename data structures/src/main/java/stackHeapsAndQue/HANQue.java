package stackHeapsAndQue;

import java.util.ArrayList;

/**
 * Created by bobkuipers on 26/02/2018.
 */
public class HANQue<T> {
    private ArrayList<T> que = new ArrayList<T>();
    private int iterator = 0;
    private int maxQue = 10;
    private int elementToReturn = 0;

    public void enQueue(T element){
        if(iterator == maxQue){
            findEmptySpotForIterator();
        }
        que.add(iterator,element);
        iterator++;
    }

    private void findEmptySpotForIterator() {
        int i = 0;
        while(que.get(i) != null && i == maxQue){
            i++;
        }
        if(i == maxQue - 1) {
            this.iterator = i;
        }
        else maxQue = maxQue*2;
    }

    public T deQueue(){
        T element = que.get(elementToReturn);
        que.add(elementToReturn,null);
        elementToReturn++;
        return element;
    }

    public T getFront(){
        return que.get(elementToReturn);
    }

    public int getIterator() {
        return iterator;
    }

    public int maxQue() {
        return maxQue;
    }
}
