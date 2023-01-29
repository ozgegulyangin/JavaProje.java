package gun44;

public class s04 {


    // CEVAP :   NULL POINTER EXCEPTION  a runtime
    public static void main(String[] args) {
        String[] strs=new String[2];
        int idx=0;

        // String ifadelerde default değer NULL, NULL üzerine de concat yapılamıyor.
        //  strs[0]="özge"; strs[1]="sdk";  vs yazsaydık dolmuşrmuş olacaktık concat çalışacaktı

        for (String s:strs){
            strs[idx].concat("element"+ idx);  // strs dizisi boş NULL buna ekleme yapmaya çalıltığımız için
            // concat ile hata veriyor.
            idx++;
        }
        for(idx=0; idx<strs.length;idx++){
            System.out.println(strs[idx]);

        }
    }
}
