package org.Arrays;

/*Example 1:

        Input
        ["MovingAverage", "next", "next", "next", "next"]
        [[3], [1], [10], [3], [5]]
        Output
        [null, 1.0, 5.5, 4.66667, 6.0]

        Explanation
        MovingAverage movingAverage = new MovingAverage(3);
        movingAverage.next(1); // return 1.0 = 1 / 1
        movingAverage.next(10); // return 5.5 = (1 + 10) / 2
        movingAverage.next(3); // return 4.66667 = (1 + 10 + 3) / 3
        movingAverage.next(5); // return 6.0 = (10 + 3 + 5) / 3
        */

import javax.sound.midi.Soundbank;
import java.util.Deque;
import java.util.LinkedList;

public class MovingAvgFromDataStream {
    int size;
    int sum;
    public Deque<Integer> queue;

    public MovingAvgFromDataStream(int size) {
        this.size = size;
        this.sum =0;
        this.queue = new LinkedList<Integer>();
    }

    public void next(int value) {

        double avg=0;
        if(queue.size()==3){
            int i = queue.removeFirst();
            sum = sum - i;
        }
        queue.addLast(value);
        sum = sum + value;
        avg = (double)sum/queue.size();
        System.out.print(avg + " ");

    }

}

class Client{
    public static void main(String[] args) {

        MovingAvgFromDataStream movingAverage = new MovingAvgFromDataStream(3);
        movingAverage.next(1); // return 1.0 = 1 / 1
        movingAverage.next(10); // return 5.5 = (1 + 10) / 2
        movingAverage.next(3); // return 4.66667 = (1 + 10 + 3) / 3
        movingAverage.next(5); // return 6.0 = (10 + 3 + 5) / 3

    }
}


