import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class ReadFile
{
    
	public static void main(String[] args) throws Exception
	{
        String line = null;
        //pass the path to the file as a parameter
		File file =
			new File("/Users/lovpretkaur/Desktop/ECS140A/HW2/input");
		Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            System.out.println(line);
            
            //pass line to Student class program
            
        }
    }
}
