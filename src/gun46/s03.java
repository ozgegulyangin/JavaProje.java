package gun46;

public class s03 {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];
        arr[0] = new int[]{1, 3, 5, 7};
        arr[1] = new int[]{1, 3};


        for (int[] a : arr) {  // a  satir oluşturuyor  -- satır satır elemanları alıyor
            for (int i = 0; i < arr.length; i++) {
                // önce datırın 0. elemanı:1 3
                // sonra satırın 1. elemanı 1 3
                // ** ÇIKTI : 1 3 1 3
                // a.lenght : satırın bütün elemanlarını yazdırır
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }
    }
}
