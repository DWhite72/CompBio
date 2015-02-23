import java.io.*;

/**
 * Created by Dylan
 */
public class FileWriterGUI {
	public static void WritePS(String RNA, String c[],String AA[]) throws IOException {
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("PS.txt")));
		int i = 0;
		try {
			writer.write("RNA Sequence:" + RNA + "Split into Codons:");
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (i < c.length) {
			writer.write("[" + c[i] + "]");
			i++;
		}

		i = 0;
		writer.write("\r\n\r\nTranslated into Amino Acids:\r\n\r\n");
		while (i < (RNA.length() / 3)) {
			writer.write("[" + AA[i] + "] ");
			i++;
		}

		i = 0;
		writer.write("\r\n\r\nConsolidated Format:\r\n\r\n");
		while (i < (RNA.length() / 3)) {
			writer.write(AA[i]);
			i++;
		}
	}
}
