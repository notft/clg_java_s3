import java.io.*;
import java.util.*;

class file{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//writring to file
		FileWriter fw = new FileWriter(/*use the location of the text file*/);
		System.out.println("enter lines of text (type 'stop' to end) :");
		do {
			s= sc.nextLine();
			if ( !s.equals("stop")){
				fw.write(s);
				fw.write("\n");
				}
			}while (!s.equals("stop"));
			fw.close();
			//reading from file
			
			try{
				FileReader fr = new FileReader(/*use the location of the text file*/);
				BufferedReader br = new BufferedReader(fr);
				System.out.println("content in the file is :-");
				while ((s = br.readLine()) !=null){
					System.out.println(s);
				}
				br.close();//close the buffered reader
				fr.close();//close the file reader		
			} catch (FileNotFoundException fe){
				System.out.println("file not found");
			}		
		}
	}
