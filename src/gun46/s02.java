package gun46;

public class s02 {
    public static void main(String[] args) {
        // *** tek boyutlularda da iki boyutlularda da yöntem aynı ilk oluşturma anında {} değer ataması yapılabilir
        //*** sonrasonda {} atamak için new int[] kullanmak zorundayız

        int [][]arr= new int [2][4];
        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};


        for (int [] a: arr){  // a  satir oluşturuyor  -- satır satır elemanları alıyor
            for(int i:a){     // i  elemanları getiriyor
                System.out.print(i+" ");   // 1 3 5 7
                                           // 1 3
            }
            System.out.println();
        }
    }
}
