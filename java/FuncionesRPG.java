public class FuncionesRPG {
    // Función para subir nivel (Ejercicio 4A)[cite: 1]
    public static int subirNivel(int xpActual, int xpNecesario, int nivelActual) {
        if (xpActual >= xpNecesario) {
            System.out.println("¡Nivel alcanzado!");
            return nivelActual + 1;
        }
        return nivelActual;
    }

    public static void main(String[] args) {
        // Prueba 1: Debe subir a 4[cite: 1]
        int nivel1 = subirNivel(110, 100, 3);
        System.out.println("Resultado 1: " + nivel1);

        // Prueba 2: No debe subir[cite: 1]
        int nivel2 = subirNivel(80, 100, 3);
        System.out.println("Resultado 2: " + nivel2);
    }
}