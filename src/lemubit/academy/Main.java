package lemubit.academy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        var priorityQ = new PriorityQueue<Person>(Comparator.comparingInt(p -> p.age));

        priorityQ.add(new Person("Jack", 91));
        priorityQ.add(new Person("Bob", 34));
        priorityQ.add(new Person("Bill", 33));
        priorityQ.add(new Person("Donald", 60));

        System.out.println(priorityQ.peek());


    }

}
