import java.util.Scanner;
public class Driver{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int score = sc.nextInt();
        

        if (score >= 70 && score <=100){
            System.out.println("Your grade is A");
        }else if (score >= 60 && score <=69){
            System.out.println("Your grade is B");
        }else if (score >= 50 && score <=59){
            System.out.println("Your grade is C");
        }else if (score >= 45 && score <=49){
            System.out.println("Your grade is D");
        }else if (score >= 40 && score <=45){
            System.out.println("Your grade is E");
        }else if (score >= 0 && score <=39){
            System.out.println("Your grade is F");
        }else{
            System.out.println("Invalid score!");
        }
    }
}