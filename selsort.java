public class selsort {
    public static void selectionsort(int[] array) {
        for(int i = 0; i<array.length-1; i++) {
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {2,3,6,1,9,8,0};

        selectionsort(array);

        for(int i : array) {
            System.out.println(i);
        }

    }
    
}
