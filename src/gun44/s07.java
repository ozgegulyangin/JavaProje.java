package gun44;

import java.util.Arrays;

public class s07 {
    public static void main(String[] args) {

        int[] a={15,30,45,60,75};
        a[2]=a[4];
        a[4]=90;
        System.out.println(Arrays.toString(a));  //[15, 30, 75, 60, 90]
    }
}
