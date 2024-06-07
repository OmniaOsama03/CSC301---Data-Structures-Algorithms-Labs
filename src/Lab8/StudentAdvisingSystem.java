package Lab8;

import java.util.PriorityQueue;

//Omnia Osama Ahmed- 1084505

public class StudentAdvisingSystem {
    public static void main(String[] args) {
        PriorityQueue<StudentInfo> AdvisingQueue = new PriorityQueue<>(new GPAComparator());

        // add 5 students with different GPAs to the AdvisingQueue

        AdvisingQueue.add(new StudentInfo("Omnia", 3.9));
        AdvisingQueue.add(new StudentInfo("Ainmo", 1.2));
        AdvisingQueue.add(new StudentInfo("Nemo", 3.0));
        AdvisingQueue.add(new StudentInfo("Annabeth", 4.0));
        AdvisingQueue.add(new StudentInfo("BethAnne", 1.1));

        System.out.println("Current student with highest priority: " + AdvisingQueue.peek());

        System.out.println("The students must proceed in the order:");
        while (!AdvisingQueue.isEmpty()) {
			StudentInfo student = AdvisingQueue.poll();
            System.out.println("Student: " + student.toString());
        }

        // Add a new student with a higher priority.
        AdvisingQueue.add(new StudentInfo("Ma", 0.1));
        System.out.println("Added a new student with higher priority.");

        System.out.println("Current student with highest priority: "+ AdvisingQueue.peek());

        // Get the highest priority student.
        StudentInfo highestPriority = AdvisingQueue.peek();
        if (highestPriority  != null) {
            System.out.println("Advised Student: " + highestPriority);
        }
    }
}

