package modell;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Etterem {

    private List<Etel> etlap = new ArrayList<>();
    private ArrayList<Asztal> asztalok = new ArrayList<>();

    public Etterem() throws IOException {
        asztalok.add(new Asztal("Piros"));
        asztalok.add(new Asztal("Sárga"));
        asztalok.add(new Asztal("Kék"));
        asztalok.add(new Asztal("Fehér"));
        etlapFajbolFeltolt();
        rendelesekFajlbolFeltolt();
    }

    public void etlapFajbolFeltolt() throws IOException {
        Path path = Path.of("etelek.txt");
        List<String> sorok = Files.readAllLines(path);

        for (String sor : sorok) {
            //when you want to split by the "|" character, you need to use "\\|" as the argument to the split() method. 
            //This is because "|" has a special meaning in regular expressions (it means "or"),
            //so you need to escape it to treat it as a literal character.
            String[] splitSor = sor.split("\\|");
            String etelNev = splitSor[0];
            int etelAr = Integer.parseInt(splitSor[1]);
            Etel etel = new Etel(etelNev, etelAr);
            etlap.add(etel);
        }
    }

    public List<Etel> getEtelek() {
        List<Etel> nemMosodosithatoEtelek = etlap;
        return nemMosodosithatoEtelek;
    }

    public void rendelesekFajlbolFeltolt() throws IOException {
        /*https://www.codeproject.com/Questions/876758/How-to-read-from-a-txt-file-but-between-two-points*/
        Path path = Path.of("rendeles.txt");
        List<String> sorok = Files.readAllLines(path);
        boolean kezdes = false;
        for (String sor : sorok) {
            //https://stackoverflow.com/questions/8755029/windows-notepad-not-supporting-newline-character-n
            //if (sor.equals("\n") || sor.equals("\r") || sor.equals("\r\n")) { --> felesleges  az isBlank() működik
            if (sor.isBlank()) {
                kezdes = false;
            }
            if (kezdes) {
                System.out.println(sor);
                // rendelesek.add(sor);
            }
            if (asztalok.equals(sor)) {
                kezdes = true;
                System.out.println(sor);

            }
        }
    }

    private Etel etelKivlaszt(String etelNeve) {

        return new Etel("étel", 10);
    }
}
