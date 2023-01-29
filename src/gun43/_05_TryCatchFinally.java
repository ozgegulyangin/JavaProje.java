package gun43;

public class _05_TryCatchFinally {
    public static void main(String[] args) {

        long starTime=0;
        String str="";
        try{
            // hata olma olasılığının olduğu kodlar
            starTime=System.currentTimeMillis();
            System.out.println("Hatadan önceki kısım");
            char ilkHarf=str.charAt(0);
            System.out.println("Hatadan sonraki kısım");
        }
        catch (Exception ex){
            // hata olduğunda yapılacaklar bu kısımda
            System.out.println("catch bloğu çalıştı");
        }
        finally
        // hata olsa da çalışır olmasa da çalışacak kısım bu bölümün
        // yukarıdaki süreçle olduğunu göstermek için finally içine yazılır
        {
           long gecenSure=System.currentTimeMillis()-starTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloğuyla ilgili son yapılacaklar- Finally kısmı");
        }

        System.out.println("diğer çalışan kodlar");
        System.out.println("program sonu");

    }
}
