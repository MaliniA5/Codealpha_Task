
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name of student #" + (i + 1) + ": ");
            String name = scanner.next();

            System.out.print("Enter score of " + name + ": ");
            int score = scanner.nextInt();

            students.add(new Student(name, score));
        }

        scanner.close();

        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (Student s : students) {
            total += s.getScore();
            if (s.getScore() > highest) highest = s.getScore();
            if (s.getScore() < lowest) lowest = s.getScore();
        }

        double average = (double) total / students.size();

        System.out.println("\n---- Student Summary ----");
        for (Student s : students) {
            System.out.println("Name: " + s.getName() + ", Score: " + s.getScore() + ", Grade: " + s.getGrade());
        }

        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}

