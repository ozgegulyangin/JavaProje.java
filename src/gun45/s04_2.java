package gun45;

public class s04_2 {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
            if (arr[i].equals("C")){
                continue;  // ilk adımda A yazdığı için burası çalışmadan sonraki adıma geçti
            }
            System.out.println("Work done");
/*           ** Çıktı **
            A
            Work done
            B
            Work done
            C
            D
            Work done */
        }
    }
}
