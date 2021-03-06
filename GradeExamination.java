import java.util.Scanner;



public class GradeExamination {
    // Reads a grade from the user and prints comments accordingly 
    public static void main(String[] args) {
        int grade, category;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a numeric grade (0 to 100): ");
        grade = scan.nextInt();
        scan.close();

        category = grade / 10;

        System.out.print("That grade is ");

        // Switch statement evaluates an expression to determine a value and then matches that value with one of several possible cases. 
        switch (category){
            case 10:
                System.out.println("a perfect score. Well done.");
                break;
            case 9:
                System.out.println("well above average. Excellent.");
                break;
            case 8:
                System.out.println("above average. Nice job.");
                break;
            case 7:
                System.out.println("average.");
                break;
            case 6:
                System.out.println("below average. You should see the");
                System.out.println("instructor to clarify the material " + "presented in class.");
                break;
                default:
                    System.out.println("not passing.");
                
            
            
        }


    }


}
