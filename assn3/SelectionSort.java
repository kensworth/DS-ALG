package proj3;

public class SelectionSort <E extends Comparable <E> > implements Sorter<E> {
 
    public void sort(E[] list){
        for (int i = 0; i < list.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < list.length; j++) {
                  if (list[j].compareTo(list[index]) == -1) {
                       //index is now smaller
                        index = j; 
                  }
            //iterating to find the smallest
            }
      
            //assign smallerNumber to the smaller number
            E smallerNumber = list[index]; 
            //making the location of smaller, now the larger
            list[index] = list[i];
            //making the location of the larger, now the smaller
            list[i] = smallerNumber;
        }
    }
}
