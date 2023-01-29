package gun15;

public class _06_DebugOrnek {
    public static void main(String[] args) {
        // Programı adım adım çalıştırıp her satırdaki değerleri kontrol etmek
        // için başlaması istediğimiz yere breakpoint (kırmızı nokta) konur.(bir kere tıklayarak)
        // RUN yerine DEBUG seçilerek çalıştırılır.Program ilk olarak breakpoint de
        // durur ve FN+F8 ile adım adım ilerletilir.Bu şekilde hem değerler izlenir
        // hem de nasıl çalıştığı test edilebilir.
        // FN+F9 ile bir break Pointten diğer Break Pointe atlanabilir.


        int a=10;
        a=1000;
        a+=100;
        a+=5;

        System.out.println("a=" +a);
    }
}
