public class SelectionSort {
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
		for(int i = 0; i < array.length - 1; i++) {
			int index = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[index] > array[j]) {
					index = j;
				}
			}
			int smallerNumber = array[index];
			array[index] = array[i];
			array[i] = smallerNumber;
		}
		return array;
	}*/

	//implementation from memory
	/*public static int[] sort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			int index = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[index] > array[j]) {
					index = j;
				}
				int smallerNumber = array[index];
				array[index] = array[i];
				array[i] = smallerNumber;
			}
		}
		return array;
	}*/
	
	//second implementation from memory
	public static int[] sort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			int index = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[index] > array[j]) {
					index = j;
				}
				int smallerNumber = array[index];
				array[index] = array[i];
				array[i] = smallerNumber;
			}
		}
		return array;
	}
}