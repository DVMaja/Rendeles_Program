package vezerlo;

import java.io.IOException;
import modell.Etterem;
import nezet.SzamlaConsole;

public class ConsoleVezerlo {

    public ConsoleVezerlo() throws IOException {
        //Etlap modell = new Etlap();
        //Asztal piros = new Asztal("Piros");
        Etterem modell = new Etterem();
        SzamlaConsole nezet = new SzamlaConsole();

        for (int i = 0; i < modell.getEtelek().size(); i++) {
            System.out.println(modell.getEtelek().get(i));
        }
        modell.getEtelek();
    }

}
