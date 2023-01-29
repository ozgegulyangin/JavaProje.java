package gun45;

public class s03 {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
            if (arr[i].equals("C")){
                continue;  // ilk adımda A yazdığı için burası çalışmadan sonraki adıma geçti
            }
            System.out.println("Work done");
            break;
            //  A , Work done
        }
    }
}
