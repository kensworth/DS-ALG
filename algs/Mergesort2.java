public class Mergesort2 {
	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
		assert isSorted(a, lo, mid);
		assert isSorted(a, mid + 1; hi);
		//assert takes in boolean, if false, throws exception
		for(int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}
		int i = lo, j = mid + 1;
		for(int k = lo; k <= hi; k++) {
			if(i > mid) {
				a[k] = aux[j++];
			}
			else if(j > hi) {
				a[k] = aux[i++];
			}
			else if(less(aux[j], aux[i])) {
				a[k] = aux[j++];
			}
			else {
				a[k] = aux[i++];
			}
		}
	}
	assert isSorted(a, lo, hi);
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
		if(hi <= lo + CUTOFF - 1) {
			//example code to switch to insertion sort at a certain smallness
			Insertion.sort(a, lo, hi);
			return;
		}
		int mid = lo + (hi - lo) / 2; 
		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);
		if(!less(a[mid + 1], a[mid])) {
			return;
			//stops if biggest item in first half is smaller than smallest item in second half
		}
		merge(a, aux, lo, mid, hi);
		//this entire method recursively makes two sorted halves of the array. Goes as deep as possible, does merge, goes up a level, merges, etc
	}
	public static void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
		//final merge happens here
	} 
}