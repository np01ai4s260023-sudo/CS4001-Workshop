import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your grade: ");
        int grade = sc.nextInt();
        
        String result = (grade >= 40) ? "Pass" : "Fail";
        
        System.out.println("\nGrade:\t" + grade);
        System.out.println("Result:\t" + result);
        
        sc.close();
    }
}