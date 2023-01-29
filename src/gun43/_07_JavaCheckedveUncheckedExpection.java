package gun43;



public class _07_JavaCheckedveUncheckedExpection {
    // Checked ve Unchecked Exception
    // Java derki  yazılımcı bıraktığı hatalara UnChecked exception denir
    // Ama öyle komutlar var ki Javaya ait: bunları hata kontrolü yapmadan
    // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hata durumlarına
    // CHECKED yani kontrol ettiğim hatalar denir.

    public static void main(String[] args) {
        String str="";
        char ilkHarf=str.charAt(0);  // Unchecked expection
        // sen bilirsin ister try-catch kullan ister kullanma, kod kırılır

        try {
            Thread.sleep(1000);  // try-catch yani Checked exception  yani try catch mecburi!!!
        } catch (InterruptedException e) {
        }


    }
}
