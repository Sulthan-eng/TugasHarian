package Modul7;

class AlatMusik {
    String name;

    void bunyi(){
        System.out.println("Alat musik ini mengeluarkan suara ... ");
    }
}

class Piano extends AlatMusik{
    @Override
    void bunyi() {
        System.out.println("Piano berbunyi ting ting");
    }
}
class Biola extends AlatMusik{
    @Override
    void bunyi() {
        System.out.println("Biola berbunyi wing wing");
    }
}
class Gitar extends AlatMusik{
    @Override
    void bunyi() {
        System.out.println("Gitar berbunyi jreng jreng");
    }
}
class Drum extends AlatMusik{
    @Override
    void bunyi() {
        System.out.println("Drum berbunyi bum bum");
    }
}
class Saxophone extends AlatMusik{
    @Override
    void bunyi() {
        System.out.println("Saxophone berbunyi Doo wop");
    }
}
class Trumpet extends AlatMusik{
    @Override
    void bunyi() {
        System.out.println("Trumpet berbunyi teret teret");
    }
}
public class ProgramAlatMusik {
    public static void main(String[] args) {
        AlatMusik[] alatMusik = new AlatMusik[6];
        alatMusik[0] = new Piano();
        alatMusik[1] = new Biola();
        alatMusik[2] = new Gitar();
        alatMusik[3] = new Trumpet();
        alatMusik[4] = new Saxophone();
        alatMusik[5] = new Trumpet();

        for(AlatMusik alat : alatMusik){
             alat.bunyi();  //manggil polimmorfik
        }

    }
}
