import java.util.ArrayList;

public class Inventario {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Espada de hierro");
        items.add("Pocion de vida");
        items.add("Escudo de madera");

        System.out.println("=== INVENTARIO ===");
        // Ciclo for para recorrer la lista[cite: 1]
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }
}