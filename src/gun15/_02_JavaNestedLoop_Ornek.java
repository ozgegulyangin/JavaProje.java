package gun15;

public class _02_JavaNestedLoop_Ornek {
    public static void main(String[] args) {
        // 5 ler dahil 1,2,3,4,5 çarpım tablosunu oluşturunuz

        for(int c=1; c<=5; c++){

            for (int i = 1; i <= 10; i++)
                System.out.println(c+"x" + i + "=" + (c * i));

            System.out.println();
        }
    }
}
