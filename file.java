import java.io.*;
import java.util.*;

class file{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		FileWriter fw = new FileWriter("test.txt");
		System.out.println("enter lines of text (type 'stop' to end) :");
		do {
			s = sc.nextLine();
			if ( !s.equals("stop")){
				fw.write(s);
				fw.write("\n");
				}
			}while (!s.equals("stop"));
			fw.close();
			
			
			try{
				FileReader fr = new FileReader("test.txt");
				BufferedReader br = new BufferedReader(fr);
				System.out.println("content in the file is :-");
				while ((s = br.readLine()) !=null){
					System.out.println(s);
				}
				br.close();
				fr.close();		
			} catch (FileNotFoundException fe){
				System.out.println("file not found");
			}		
		}
	}
