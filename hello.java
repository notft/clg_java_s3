import java.util.Scanner;




public class hello{
    
    public int add(int a, int b){
        int sum; 
        sum = a + b;
        return sum;
}
    public static void main(String[] args){
        System.out.println("\nHello\n");
        Scanner sc = new Scanner(System.in);

        
        String name = sc.nextLine();
        System.out.println(name);
        int a,b;

        a = 12; 
        b = 11;

        System.out.print(add(a,b));
    
        
    }
}