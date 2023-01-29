package gun38._02_Ornek_Sekiller;

public abstract class Sekil {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sekilCizildi(){
        System.out.println(name+" isimli şekil çizildi");
    }




    abstract double Alan();
    abstract double Cevre();

    @Override
    public String toString() {
        return  name +"'in" +" Alanı:"+Alan()+" Çevresi:"+Cevre();
    }
}
