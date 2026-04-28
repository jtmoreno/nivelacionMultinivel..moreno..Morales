import java.util.*;

public class Inventario {
    ArrayList<String> armas = new ArrayList<>();
    ArrayList<String> pociones = new ArrayList<>();
    ArrayList<String> escudo = new ArrayList<>();
    ArrayList<String> objetos = new ArrayList<>();

    Inventario(String arma, String pocion, String escudo, String objeto) {
        this.armas.add(arma);
        this.pociones.add(pocion);
        this.escudo.add(escudo);
        this.objetos.add(objeto);
    }

    String borrarObjeto(String objeto) {

        int seleccionador = (armas.contains(objeto)) ? 1
                : (pociones.contains(objeto)) ? 2 : (escudo.contains(objeto)) ? 3 : (objetos.contains(objeto)) ? 4 : 0;


        int bandera =0;

        switch (seleccionador) {
            case 1:
                boolean seguir = true;
                while(seguir){
                    
                }
                return "arma borrada";

            case 2:
                return "pocion borrada";

            case 3:
                return "escudo borrado";

            case 4:
                return "objeto borrado";

            default:
                return "objeto no encontrado";

        }

    }

}
