import java.util.Scanner;

public class Pali{
    public static void main (String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the word");
        String name = scanner.nextLine();
        int len=name.length();
        int flag = 0;

        for(int i = 0;i<len/2;i++ ){
            if (name.charAt(i)!=name.charAt(len-i-1)){
                flag = 1;
                break;
            }
        }
        if (flag == 1){
            System.out.println("not palindrome");
        }
        if (flag == 0){
        
        System.out.println( name+ " is palindrome ");  
        }
        }
}



