package gun21;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atayarak
        // yazdırınız.

        Scanner oku=new Scanner(System.in);
        int [] dizi=new int [6];
        ArrayList<Integer>tekler=new ArrayList<>();

        for (int i = 0; i < dizi.length ; i++) {
            System.out.print("sayı=");
            dizi[i]= oku.nextInt();  // diziyi 6 elemanla doldurduk bu adımla
            if (dizi[i]%2!=0)
                tekler.add((dizi[i]));
        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

        System.out.println("tekler = " + tekler);

    }
}
