package gun44;

public class s03 {
    public static void main(String[] args) {

        int [] stack={10,20,30};

        int size=3;
        int idx=0;

        //bu line 'a ne gelmesi gerekiyor soru bu

    /*    do{
            idx++;
        }while (idx<=size); // 1>=3 devam etmez : sonucu index 1 yani 20 yazar


        while(idx<size){ idx<3
        idx++;
        }// sonuc exception çünkü idx en son 3
     */


       do{
           idx++;
       }while (idx<size-1);  // idx<2   1<2 olur  2. indexteki 30'u verir bize

        // burdaki index idx 2'ye gelmeli 30 çıkabilmesi için
        System.out.println("Tthe Top Eleman:" +stack[idx]);
    }
}
