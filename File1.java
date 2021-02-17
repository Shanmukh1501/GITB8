import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File1 {
    public static void main(String args[]) throws Exception {	
	    try {
		    File f=new File("D:\\scores.txt");
			BufferedReader br=new BufferedReader(new FileReader(f));
			int max;
			String line=br.readLine();
			max=Integer.parseInt(line);
			while(line != null) {
			     int next=Integer.parseInt(line);
				 if(max<next)
				    max=next;
				line=br.readLine();
			}
			br.close();
			System.out.println("MAXIMUM SCORE IS: "+max);
		}
		catch (Exception e) {
		   System.out.println(e);
		}
	}
}
