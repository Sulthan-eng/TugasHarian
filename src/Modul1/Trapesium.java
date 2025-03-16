package Modul1;

public class Trapesium {
    public static void main(String[] args) {
        LuasTrapesium Trapesium= new LuasTrapesium(5,7,8);
        double LuasTrapesium = Trapesium.LuasTrapesium();
        System.out.println("Luas trapesium : " + LuasTrapesium);
    }
}

class LuasTrapesium {
    double alas1;
    double alas2;
    double tinggi;

    public LuasTrapesium(double alas1,double alas2,double tinggi) {
        this.alas1 = alas1;
        this.alas2 = alas2;
        this.tinggi = tinggi;
    }
    double getAlas1() {
        return alas1;
    }
    double getAlas2() {
        return alas2;
    }
    double getTinggi() {
        return tinggi;
    }

    double LuasTrapesium() {
        return 0.5 * (alas1 + alas2) * tinggi;
    }
}
