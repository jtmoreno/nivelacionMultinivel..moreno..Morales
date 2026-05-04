public class LogicaCombate {
    public static void main(String[] args) {
        double vida = 25.0;
        double vidaMax = 100.0;
        double pct = (vida / vidaMax) * 100;
        String estado;

        // Determinar estado de salud[cite: 1]
        if (pct <= 0) estado = "MUERTO";
        else if (pct <= 25) estado = "CRITICO";
        else if (pct <= 50) estado = "HERIDO";
        else if (pct <= 75) estado = "ESTABLE";
        else estado = "SALUDABLE";

        System.out.println("Estado: " + estado);

        // Lógica de ataque según clase[cite: 1]
        String clase = "Mago";
        int nivelHabilidad = 3;
        String tipoAtaque = switch (clase) {
            case "Guerrero" -> "Espada";
            case "Mago" -> "Hechizo";
            case "Arquero" -> "Flecha";
            default -> "Puño";
        };

        if (clase.equals("Mago") && nivelHabilidad >= 3) {
            System.out.println("¡Bola de fuego!");
        } else {
            System.out.println(tipoAtaque + " basico");
        }
    }
}