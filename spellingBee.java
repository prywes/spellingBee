import java.math.*;
import java.io.*;
import java.util.Scanner;

public class spellingBee {  
	public static void main(String[] args) throws IOException {  
  		FileWriter fileWriter = new FileWriter("result.txt");
    		PrintWriter printWriter = new PrintWriter(fileWriter);
       		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the center letter: ");
		String s = scanner.next();
		char special =  s.charAt(0);
		System.out.print("Enter the next six letters: ");	
		char[] letters = new char[6];
		s = scanner.next();
		letters[0] = s.charAt(0);
		letters[1] = s.charAt(1);
		letters[2] = s.charAt(2);
		letters[3] = s.charAt(3);
		letters[4] = s.charAt(4);
		letters[5] = s.charAt(5);
		
		
		
		BufferedReader br = new BufferedReader(new FileReader(new File("words.txt")));
		String st;
		while((st = br.readLine()) != null)
		{
			Boolean validW = false;
			Boolean containsS = false;
			if(st.length() > 3)
			{
				for(int i = 0; i < st.length(); i++)
				{
					validW = false;
					for(int j = 0; j < letters.length; j++)
					{
						if(st.charAt(i) == letters[j])
						{
							validW = true;
						}
						else if(st.charAt(i) == special)
						{
							validW = true;
							containsS = true;
						}
					}
					if(validW == false)
					{
						i = st.length();
					}
				
				}
			}
			if(validW && containsS)
			{
				printWriter.print(st + "\n");	
			}
			
		}
		


       	
       		printWriter.close();
       	}
}
       	
       	
  
    

