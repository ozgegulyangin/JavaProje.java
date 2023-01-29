package gun18;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int [] dizi=new int[10]; // boş default bir tek boyutlu dizi
        int [] dizi2= {1,2,3,4,5,66,77,88,99};

        int [][] tablo= new int[2][3];  // boş default değer 0 ;2x3 yani 6 adet veri
        int [][] tablo2= {
                {2, 3, 4}, //0.satır
                {12,45,32}, //1. satır}//
        };
            //  1. YÖNTEM = UZUN YOL
         for (int i = 0; i < 2; i++) {  // i burada satırı temsil ediyor
            System.out.print(tablo2[i][0]+" ");// her bir satırın 0. elemanı
            System.out.print(tablo2[i][1]+" ");// her bir satırın 1. elemanı
            System.out.print(tablo2[i][2]+" ");// her bir satırın 2. elemanı
            System.out.println();  // her satırı yazma işleminden sonra satır atlatıyor
        }
          //2. YÖNTEM  = KISA YOL
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) { // her bir satırın sütunlarını yazdıran for
                System.out.print(tablo2[satir][sutun]+" ");
            }
            System.out.println(); // her satırı yazma işleminden sonra satır atlatıyor
        }

    }
}
