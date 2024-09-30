
import java.util.Scanner;


class AgeVerify{
    void vote(int age) throws IllegalAccessException {
        for (int i = 0; i <10; i++){
            try {
                if (age<18) {
                        throw new IllegalAccessException("You must be atleast 18 years to vote");
                        
                    }
                    else{
                        System.out.println("You can vote!");
                        break;

                    }

            } catch (Exception e){
                System.out.println("Exception Occurred: "+e);
                break;
            } finally {
                System.out.println("Finally age verification done");
                break;

            }
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

