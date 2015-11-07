import java.io.*;
public  class BinarySearch {
	public static int binarySearch(int[] numbers, int key) {
		int lo = 0, hi = numbers.length -1;
		while(lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if(key < numbers[mid]) {
				hi = mid - 1;
			}
			else if(key > numbers[mid]) {
				lo = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
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
		int key = 1;
		Stopwatch stopwatch = new Stopwatch();
		System.out.println(binarySearch(numbers, key));
		double time = stopwatch.elapsedTime();
		System.out.println(time + " seconds to complete task.");
	}
}