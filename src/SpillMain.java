import javax.swing.*;

public class SpillMain {

    public static void main(String[] args) {

        int antallSpillere = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall spillere"));

        while(antallSpillere < 2 || antallSpillere > 4){
            System.out.println("Ugyldig antall spillere");
            antallSpillere = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall spillere"));
        }

        Stigespill stigespill = new Stigespill(antallSpillere);
        stigespill.start();

        }

    }

