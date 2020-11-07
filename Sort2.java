import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Sort2 {

	public static void main(String[] args) throws IOException {
		if(args.length!=1) {
			
			System.out.println("please supply an argument: File name ");
			return;
			
		}
		Path mypath = Paths.get(args[0]);
		if(!Files.exists(mypath)) {
			
			System.out.println("no such a file : " + mypath.toString() );
			return;
		}
 
//		List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\esrau\\eclipse-workspace\\PG\\src\\Friends"));
		List<String> lines = Files.readAllLines(mypath);
		Collections.sort(lines);
		for (String s : lines) {
			System.out.println(s);
		}
	
	}

}
