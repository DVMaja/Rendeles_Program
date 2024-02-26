package modell;

import java.io.IOException;
import java.util.ArrayList;

public class Asztal {

    private String szin;
    private ArrayList<Etel> rendelesek;

    public Asztal(String szin) throws IOException {
        this.szin = szin;
        
    }

    public String getSzin() {
        return szin;
    }

    public ArrayList<Etel> getRendelesek() {
        return rendelesek;
    }

    public int getOsszAr() {
        /*végigmenni a rendelt ételek listáján 
        madj az áraikat összeadni
        végűl a végösszeget kell visszaadnia*/
        return 1;
    }

    

    public void ujEtel(Etel etel) {
        
        
    }
/*Új rendelés felvétele:
    
    */
}
