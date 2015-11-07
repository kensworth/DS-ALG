import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Printwriter {
	public static void main(String[] args) {
		try {
			String numbers = "";
			for(int i = 0; i < 2000; i++) {
				String convert = Integer.toString(i) + " ";
				numbers += convert;Integer.toString(i);
			}
			File file = new File("./1000.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(numbers);
			bw.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}
}