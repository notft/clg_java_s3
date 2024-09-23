
import java.util.Scanner;

class AgeVerify{
    void vote(int age) throws IllegalAccessException {
        try {
                if (age<18) {
                    throw new IllegalAccessException("You must be atleast 18 years to vote");
                }
                else{
                    System.out.println("You can vote!");

                }
        } catch (Exception e){
            System.out.println("Exception Occurred: "+e);
        } finally {
            System.out.println("Finally age verification done");

        }
    }
}
public class TryCatch{
    public static void main(String[] args) throws IllegalAccessException{
        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("Enter age of voter: ");
        age = sc.nextInt();
        AgeVerify av = new AgeVerify();
        av.vote(age);
        System.out.println("Verification completed successfully");
    }
}

