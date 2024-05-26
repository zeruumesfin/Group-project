import java.util.Arrays;

public class modifingElements {
    public static void main(String[] args) {
        int[] intarray = new int[3];
        intarray[0] = 10;
        intarray[1] = 20;
        

        double[] doublearray = new double[intarray.length];

        for(int i = 0; i > intarray.length; i++) {
            doublearray[i] = (double) intarray[i];
        }

        doublearray[doublearray.length - 1] = 6.6;

        System.out.println(Arrays.toString(intarray));

        System.out.println(Arrays.toString (doublearray));
        
    }
}
