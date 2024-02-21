package modell;

import java.util.Arrays;
import java.util.List;

public class Menu {

    private Etel[] etelek;

    public Menu() {
        Etel e1 = new Etel("Babgulyás", 1700);
        Etel e2 = new Etel("Rántott sajt", 1700);
        Etel e3 = new Etel("Gyümölcsleves", 1700);
        Etel e4 = new Etel("Bécsi szelet", 1700);
        Etel e5 = new Etel("Somlói galuska", 1700);

        etelek[0] = e1;
        etelek[1] = e2;
        etelek[2] = e3;
        etelek[3] = e4;
        etelek[4] = e5;

    }

    public List<Etel> getEtelek() {
        List<Etel> nemMosódosithatoLadak = Arrays.asList(etelek);

        return nemMosódosithatoLadak;
    }
}
