package b;

public class QuickSortEx1 {
	  
	    static int S[] = {40,50,80,20,10,70,30,100,90};
	    
	    
		  private int partition(int S[] , int start, int end) {
				     int pivot = S[end];
				     int i =(start-1);
			      
				     for (int j = 1; j <= end-1; j++) {
						if(S[j]<=pivot) {
							i++; 
							//(S[i], S[j]);
						}
					}
				     
				     return 0;
			}

	    
	    
	    
	    void QuickSort(int S[], int start, int end) {
	    	if(start<end) {
	    		int p = partition(S,start,end);
	    		
	    		QuickSort(S,start,p-1);
	    		QuickSort(S,p+1,end);
	    		
	    	}
	    }
	    
	    
	    
	  
	




	public static void main(String[] args) {
	for (int i = 0; i < S.length; i++) {
		 System.out.print(S[i]+",");
	}	    
		      
	}
	
}
