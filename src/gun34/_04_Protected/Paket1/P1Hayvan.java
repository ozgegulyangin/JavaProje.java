package gun34._04_Protected.Paket1;

public class P1Hayvan {
    public String ad;  // Projenin her yerinden ,her paketten ulaşılabiliyor
    int yas;  // sadece bulunduğu pakettekiler ulaşabilir
    protected String cinsi;   // default gibi, ancak bazen diğer paketlerden erişim seçeneği var
    private String renk; // sadece bulunduğu CLASStan erişilebilir

}
