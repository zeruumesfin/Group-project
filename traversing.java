public class traversing {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int target = 4;

        int result = binarysearch(array, target);

        System.out.println("The result of linearsearch is; " + result);
    }

    public static int binarysearch(int[] array, int target) {
        int low = 0;
        int high = array.length -1;

        while(low <= high) {
            int mid = (high - low) / 2;

            if(array[mid] == target) {
                return mid;
            }
            else if (array[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }
        return -1;
    }
    
}
