import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number you want to select");
        System.out.println("1. Addition");
        System.out.println("2. Substraction ");
        System.out.println("3. Mulitplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");

        int num = scanner.nextInt();

        if(num>4){
            System.out.println("Enter the first number");
            int a = scanner.nextInt();
            System.out.println("Enter the second number");
            int b = scanner.nextInt();
            
            switch(No){
                case 1: 
                    int sum = a+b;
                    System.out.println(sum);
                    break;
                
                case 2:
                    int sub = a-b;
                    System.out.println(sub);
                    break;
                
                case 3:
                    int Mulitplication = a*b;
                    System.out.println(Mulitplication);
                    break;

                case 4:
                    int division = a/b;
                    System.out.println(division);
                    break;
                
                case 5:
                    break;
            }
        else{
                System.out.println("Invalid Input");


        }



        }

        

    }
}

