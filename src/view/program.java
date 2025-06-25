import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Scanner apple = new Scanner(System.in);

        System.out.println("Enter marks for Science");
        int science = apple.nextInt();
        System.out.println("Enter marks for Math");
        int math = apple.nextInt();
        System.out.println("Enter marks for English");
        int english = apple.nextInt();
        System.out.println("Enter marks for Nepali");
        int nepali = apple.nextInt();

        int total = science + math + english + nepali;
        double percentage = total / 4.0;

        System.out.println("Total marks = " + total);
        System.out.println("Percentage = " + percentage);

        if (percentage >= 70) {
            System.out.println("Result: First Class");
        } else if (percentage > 59) {
            System.out.println("Result: Upper Second Class");
        } else if (percentage > 49) {
            System.out.println("Result: Second Class");
        } else if (percentage > 39) {
            System.out.println("Result: Third Class");
        } else {
            System.out.println("Result: Fail");
        }

        apple.close();
    }
}