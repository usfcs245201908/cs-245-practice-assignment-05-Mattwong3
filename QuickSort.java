public class QuickSort implements SortingAlgorithm {

    public QuickSort(){

    }

    @Override


    public void sort(int[] a){
        quick(a, 0, a.length - 1);

    }

    public void quick(int[] array, int start, int end){

        int idx = partition(array, start, end);

        
        if (start < idx - 1) {
            quick(array, start, idx - 1);
        }

        
        if (end > idx) {
            quick(array, idx, end);
        }
    }

    public  int partition(int[] array, int left, int right) {
        int pivot = array[left];

        while (left <= right) {
            
            while (array[left] < pivot) {
                left++;
            }
            
            while (array[right] > pivot) {
                right--;
            }

            
            if (left <= right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;

                
                left++;
                right--;
            }
        }
        return left;
    }
}


