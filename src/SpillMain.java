import javax.swing.*;

public class SpillMain {

    public static void main(String[] args) {


        Stigespill stigespill = new Stigespill(Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall spillere")));
        stigespill.start();
    }
}
