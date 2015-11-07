import java.io.*;
public class ThreeSumBF {
	public static int count(int[] numbers) {
		//improve with quicksort + binary search
		int N  = numbers.length;
		int count = 0;
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				for(int k = j + 1; k < N; k++) {
					if(numbers[i] + numbers[j] + numbers[k] == 2000) {
						count++;
					}
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String fileName = "1000.txt";
		String line = null;
		String text = "";
		try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                text += line;
            }   
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }

		String[] words = text.split("\\s+");
		for (int i = 0; i < words.length; i++) {
		    // You may want to check for a non-word character before blindly
		    // performing a replacement
		    // It may also be necessary to adjust the character class
		    words[i] = words[i].replaceAll("[^\\w]", "");
		}
		int[] numbers = new int[words.length];
		for(int n = 0; n < words.length; n++) {
		   numbers[n] = Integer.parseInt(words[n]);
		}
		Stopwatch stopwatch = new Stopwatch();
		System.out.println(count(numbers));
		double time = stopwatch.elapsedTime();
		System.out.println(time + " seconds to complete task.");
	}
}