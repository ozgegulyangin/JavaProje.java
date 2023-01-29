package gun30._01_StaticDegiskenler.Ornek2;

public class Student {

    String fullName;
    private int id;
    static int sayac = 1;
    // sen bi tanesin
    //Static olmadan her zaman 0'la başlıyordu
    // Static olduğunda artık bir tane olduğundan
    // değerini korudu ve hep 1 arttı
    //tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılabilir


    public Student(String fullName) {
        this.fullName = fullName;
        this.id = sayac++; // önce var olan değer
        // veriliyor, sonra artıyor
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName=" + fullName + ',' + "id=" + id +
                '}';
    }
}