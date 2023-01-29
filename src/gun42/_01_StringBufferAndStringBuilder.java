package gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {

        String cumle = "";
        cumle = cumle + "Bugün"; // + işareti Stringlerde birleştirme yapar
        cumle += " hava";
        cumle += " çok soğuk";
        System.out.println("cumle = " + cumle);

        /******************** concat ***********************/
        System.out.println("cumle.concat= " + cumle.concat(" fakat dün ılıktı")); // atamadığımız için
        // asıl kaynak olan "cümeyi" değiştirmedi, soutta yazdırınca çıktı 
        System.out.println("cumle = " + cumle); // cümleye atamadığımız için cumle değişmedi
        cumle = cumle.concat(" fakat dün ılıktı"); // concat de birleştirir , atama ister + gibi
        System.out.println("cumle = " + cumle);

        /******************** String Builder ***********************/
        StringBuilder cumle2 = new StringBuilder();
        cumle2.append("Bugün"); // append ekle demek,atama gerektirmez direkt ekler
        cumle2.append(" hava");
        cumle2.append(" soğuk");
        System.out.println("cumle2 = " + cumle2);

        /******************** +,concat,String Builder ; 3 modelin hızını test edelim ***********************/

        Long startTime = System.currentTimeMillis();

        String test1 = "";
        for (int i = 0; i < 10000; i++)
            test1 += " merhaba";
        System.out.println("+ için süre=" + (System.currentTimeMillis() - startTime) + " ms");


        startTime = System.currentTimeMillis();

        String test2 = "";
        for (int i = 0; i < 10000; i++)
            test2.concat(" merhaba");
        System.out.println("concat için süre= " + (System.currentTimeMillis() - startTime) + " ms");


         startTime = System.currentTimeMillis();

        StringBuilder test3 = new StringBuilder();
        for (int i = 0; i < 10000; i++)
            test3.append(" merhaba");
            System.out.println("String Builder için süre= " + (System.currentTimeMillis() - startTime) + " ms");
            
        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.
        System.out.println("--------------------------------------------\n\n");
        /*********** String Builder'i yakından tanıyalım **************/

        StringBuilder sb=new StringBuilder();
        sb.append("Bugün");
        sb.append(" hava ");
        sb.append( "soğuk");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());
        sb.append(4); // sonuna 4 ekliyor
        System.out.println("sb = " + sb);
        
        sb.reverse();  // cümleyi ters çeviriyor
        System.out.println("sb = " + sb);
        sb.reverse(); // tekrar ters çevirdik
        System.out.println("sb = " + sb);
        
        sb.delete(0,5);  // index 0 dahil 5'e kadar siler
        System.out.println("sb = " + sb);
        
        sb.deleteCharAt(3);  // sadecee belirtilen indexteki karakteri siler
        System.out.println("sb = " + sb);
        
        sb.insert(5," KELİME"); // 5 nolu indexe kelimeyi ekliyor; araya ekleme yapıyor
        System.out.println("sb = " + sb);

        sb=new StringBuilder();  // sıfırlamış olduk
        System.out.println("sb = " + sb);
        sb=new StringBuilder("Bugün hava ılıktı."); // yeni değer atadık
        System.out.println("sb = " + sb);
        
        sb.replace(6,10,"sabah");
        System.out.println("sb = " + sb);

        String strSb=sb.toString();

        /*********** String Buffer'i yakından tanıyalım **************/
        StringBuffer sBuffer=new StringBuffer();
        //  String builder' ile tek farkı paralel çalışan yazılımlarda String Buffer kullanıyoruz.

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}