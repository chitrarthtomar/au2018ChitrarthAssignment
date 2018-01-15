
import java.util.Arrays;

public class GenericSort {
	 private <E> void swap(E[] a, int i, int j) {
	        if (i != j) {
	            E temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	        }
	    }

	    public <E extends Comparable<E>> void selectionSort(E[] a) {
	        for (int i = 0; i < a.length - 1; i++) {
	            // find index of smallest element
	            int smallest = i;
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[j].compareTo(a[smallest])<=0) {
	                    smallest = j;
	                }
	            }

	            swap(a, i, smallest);  // swap smallest to front
	        }
	    }

	    public static void main(String[] args){
	        GenericSort firstsort = new GenericSort();

	        Integer[] arr = {5,4,3,5,7,23,9};
	        System.out.println("before int: "+ Arrays.toString(arr));
	        firstsort.selectionSort(arr);
	        System.out.println("After int : "+Arrays.toString(arr));
	        
	         Character[] arr2= {'q','w','e','r','t'};
	         System.out.println("before sorting char: "+ Arrays.toString(arr2));
	         firstsort.selectionSort(arr2);]
	         System.out.println("After sorting char : "+Arrays.toString(arr2));
	    }

}
