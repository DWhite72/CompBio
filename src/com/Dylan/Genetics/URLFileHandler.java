import java.io.*;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Dylan
 */
public class URLFileHandler {

	public static String getFile(String uRlS) throws IOException {
		java.net.URL dl = new URL(uRlS);
		BufferedReader br = new BufferedReader(new InputStreamReader(dl.openStream()));
		String line, temp = "";
		boolean startReading = false;
		while((line = br.readLine()) != null){
			temp+= line + "\n";
		}
		return temp;
	}
}
