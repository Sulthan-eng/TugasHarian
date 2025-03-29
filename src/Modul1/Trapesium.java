package Modul1;

public class Trapesium {
    public static void main(String[] args) {
        LuasTrapesium trapesium= new LuasTrapesium(5,7,8);
        double luasSiTrapesium = trapesium.luasTrapesium();
        System.out.println("Luas trapesium : " + luasSiTrapesium);
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

    double luasTrapesium() {
        return 0.5 * (alas1 + alas2) * tinggi;
    }
}
