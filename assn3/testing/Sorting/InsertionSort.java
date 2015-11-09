public class InsertionSort {
	//insertion sort reads the next item and finds the place for it in the sorted array preceding it
	public static void main(String[] args) {
		int[] array = {1, 5, 7, 2 , 3, 8, 10, 7, 4, 0};

		System.out.println("original: " );
		for(int i : array){
            System.out.print(i);
            System.out.print(", ");
        }

        System.out.println();
		int[] array2 = sort(array);

        System.out.println("sorted: " );
		for(int i : array2){
            System.out.print(i);
            System.out.print(", ");
        }
	}

	/*public static int[] sort(int[] array) {
		int temp;
		for(int i = 0; i < array.length; i++) {
			for(int j = i; j > 0; j--) {
				if(array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		return array;
	}*/

	//implementation from memory
	/*public static int[] sort(int[] array) {
		//initialize temporary integer
		int temp;
		//run through array from index 0 to end
		for(int i = 0; i < array.length; i++) {
			//run from where i is, backwards, so long as j doesn't equal zero
			for(int j = i; j > 0; j--) {
				//for each pair of j and j -1 values going backwards from i, find the location for the new j, only j - 1 comparisons needed as the array from 0 to j is already sorted
				if(array[j - 1] > array[j]) {
					//temp with smalller
					temp = array[j];
					//location of smaller with larger
					array[j] = array[j - 1];
					//replace location of old larger with smaller from temp
					array[j - 1] = temp;
				}
			}
		}
		return array;
	}*/

	//second implementation from memory
	public static int[] sort(int[] array) {
		int temp;
		for(int i = 0; i < array.length; i++) {
			for(int j = i; j > 0; j--) {
				if(array[j - 1] > array[j]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		return array;
	}
}




























