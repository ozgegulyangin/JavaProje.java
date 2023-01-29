package gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cümlede a harfinin geçip geçmediğini bulunuz
        // geçiyor ise EVET, geçmiyor ise HAYIR yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle giriniz=");
        String cumle= oku.nextLine();


        if (cumle.contains ("a"))
            System.out.println("EVET");// if (cumle.contains("a")==false)

        if (!cumle.contains("a"))
            System.out.println("HAYIR"); // if (cumle.contains("a")!=false

        // 2. yol
         if (cumle.indexOf("a") != -1)
             System.out.println("EVET"); // var ise indexini verir

         if (cumle.indexOf("a")==-1)
             System.out.println("HAYIR"); // yok ise indexi -1 verir

        // 3. yol

        boolean varMi= cumle.contains("a");
        if (varMi==true)   // if(varMi) yazarsak da olur direkt
            System.out.println("EVET");
        if (varMi==false)   // if(varMi)
            System.out.println("HAYIR");





    }
}
