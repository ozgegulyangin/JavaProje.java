package gun44;

public class s02 {
    public static void main(String[] args) {

        int [] arr={1,2,3,4};
        int i=0;
        do{
            System.out.println(arr[i]+" ");
            i++;
        }while (i<arr.length+1);

        // ArrayIndexOutOfBoundsException   hataso verir çünkü i<5 oluyor, 4 eleman var 5. elemanı bulamıyor hata veriyor

    }
}
