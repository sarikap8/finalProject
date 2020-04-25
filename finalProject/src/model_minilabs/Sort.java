package model_minilabs;

import java.util.ArrayList;

import view.ArrayListUI;

/**
 * Write a description of class isort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sort
{
    public enum ListType {Standard, Bubble, Insert, Selection};
    public ListType listType = ListType.Standard;
    
    private ArrayList<Integer> list = new ArrayList<Integer>();
    private ArrayList<Integer> blist; int bcompares = 0; int bswaps = 0;
    private ArrayList<Integer> ilist; int icompares = 0; int iswaps = 0;
    private ArrayList<Integer> slist; int scompares = 0; int sswaps = 0;


    /**
     * Constructor for objects of class isort
     */
    public Sort()
    {
    	
        list = ArrayListCode.listOfPrimes(Integer.parseInt(ArrayListUI.integer_input.getText())); 
        blist =  (ArrayList<Integer>) list.clone();
        this.BubbleSort();
        ilist = (ArrayList<Integer>)  list.clone();
        this.InsertionSort();
        slist = (ArrayList<Integer>)  list.clone();
        this.SelectionSort();
        
    }
    
    public String toString() {
        ArrayList<Integer> list;
        
        switch(listType) {
            case Standard:
                System.out.println("Original List");
                list = this.list;
                break;
            case Bubble:
                System.out.println("Bubble Sort -- "
                  + " Operations: " + (this.bcompares + this.bswaps)
                  + " Compares: " + this.bcompares
                  + " Swaps: " + this.bswaps);
                list = this.blist;
                break;
            case Insert:
            default:
                System.out.println("Insertions Sort -- "
                  + " Operations: " + (this.icompares + this.iswaps)
                  + " Compares: " + this.icompares
                  + " Swaps: " + this.iswaps);
                list = this.ilist;
                break;
            case Selection:
            	System.out.println("Selections Sort -- "
                        + " Operations: " + (this.scompares + this.sswaps)
                        + " Compares: " + this.scompares
                        + " Swaps: " + this.sswaps);
            	list = this.slist;
            	break;
            
        }
                
        String output = "[";
        for (int i = 0; i < list.size(); i++)
            output += " " + list.get(i);
        return output +" ]";    
    }
    
    private ArrayList<Integer> BubbleSort() { 
        
        // iterate list, one less than length
        for (int i = 0; i < blist.size() - 1; i++) {
            
            // bubble sort key logic
            for (int k = 1; k < blist.size() - i; k++) {
                
                // analytics
                this.bcompares++; // compare counter
                
                // bubble sort swap logic
                if (blist.get(k-1) > blist.get(k)) {
                    int swap = blist.get(k);
                    blist.set(k, blist.get(k-1));
                    swap = blist.get(k-1);
               
                    // analytics
                    this.bswaps++; // swap counter
                }
            
            }
            
        }
        return blist;
    }

    
    private ArrayList<Integer> InsertionSort() {

        // iterate list, one less than length
        for (int i = 0; i < ilist.size() - 1; i++) {
            
            // insertion sort key logic
            int k = i + 1;
            int swap = ilist.get(k);            
            while( k > 0 && swap < ilist.get(k-1)) {
                ilist.set(k, ilist.get(k-1));
                k--;
                
                // analytics
                this.icompares++; // compare counter
                this.iswaps++; // shift counter
            }
            swap = ilist.get(k);
            
            this.iswaps++;  // increment swap counter
            
        }
        
        return ilist;
    }
    private ArrayList<Integer> SelectionSort() 
    {
        // iterate list, one less than length
		for(int i = 0; i < slist.size() ; i++) {
			//find max. of the array
			int max = i;
			for (int k = i + 1; k < slist.size(); k++) 
				if (slist.get(k) > slist.get(max)) 
					max = k;
					this.sswaps++;
					this.scompares++;
				
				//Swap max. with first
				int num = slist.get(max);
				slist.set(max, slist.get(i));
				slist.set(i, num); 
			
		}
		return slist;
    }
    
    /**
     *
     */
    public static void main(String[] args)
    {
        // Original List
        Sort is = new Sort();
        System.out.println(is);
        
        // Bubble Sort
        is.listType = ListType.Bubble;
        System.out.println(is);
        
        // Insertion Sort
        is.listType = ListType.Insert;
        System.out.println(is);
        
        // Selection Sort
        is.listType = ListType.Selection;
        System.out.println(is);
        	//reverse sort hopefully 
        
        // Selection sort is the most effective because it completes the sorting with the least
        // amount of operations
    }
}
