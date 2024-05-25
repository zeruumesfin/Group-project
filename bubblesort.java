public class bubblesort {
    public static void bubblesort(int[] array) {
        for(int i = 0; i < array.length -1; i++) {
            for(int j = 0; j < array.length -i-1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2,6,9,1,5,0,4};

        bubblesort(array);

        for(int i : array) {
            System.out.println(i);
        }
    }
    
}
