package Modul9;
public class MainProgram {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new Kalkulator();
            }
        });
    }

}
