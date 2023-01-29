package gun44;

public class s01 {
    public static void main(String[] args) {

        int[] array = new int[2];

        // int[]array;      ------> bu şelikde de olur
        // array=new int[2];
        //  int array[]=new int[2];  -------> bu şekilde de olur.

        array[0] = 10;
        array[1] = 20;
        System.out.println(array[0] + ":" + array[1]);
    }
}
