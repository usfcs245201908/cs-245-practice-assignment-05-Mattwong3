public class MergeSort implements  SortingAlgorithm{

public MergeSort(){

}

    public void sort(int[] a){
        int[] left, right;

        if ( a.length == 1 )
        {
           
            return;
        }

      
        int middle = a.length/2;

        left  = new int[middle];           

        for ( int i = 0; i < middle; i++ )
            left[i] = a[i];

        right = new int[a.length-middle];  

        for ( int i = 0; i < a.length-middle; i++ )
            right[i] = a[i+middle];

      
        sort( left );       
        sort( right );      

     
        merge( a, left, right );   

    }

    public void merge(int [] result,int [] a, int [] b){
        int i, j, k;

        i = j = k = 0;

        while ( i < a.length || j < b.length )
        {
            if ( i < a.length && j < b.length )
            {  
                if ( a[i] < b[j] )
                    result[k++] = a[i++];
                else
                    result[k++] = b[j++];
            }
            else if ( i == a.length )
                result[k++] = b[j++];    
            else if ( j == b.length )
                result[k++] = a[i++];     
        }

    }
}
