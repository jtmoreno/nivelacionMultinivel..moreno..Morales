public class FuncionesRPG {

    // Retorna el dano real (min 1)
    public static int calcularDano(int ataque, int defensa) {
        int dano = ataque - defensa;
        return dano > 0 ? dano : 1;
    }

    // Cura sin pasar del maximo
    public static double aplicarCuracion(double vida, double cur, double max) {
        double nueva = vida + cur;
        return nueva > max ? max : nueva;
    }

    // Sin retorno: solo imprime
    public static void mostrarEstado(String n, double vida, int niv) {
        System.out.printf("%s [Nv%d] HP: %.0f%n", n, niv, vida);
    }

    // Sube nivel si xp es suficiente
    public static int subirNivel(int xpActual, int xpNecesario, int nivelActual) {
        if (xpActual >= xpNecesario) {
            int nuevoNivel = nivelActual + 1;
            System.out.println("¡Nivel alcanzado! Ahora eres nivel " + nuevoNivel);
            return nuevoNivel;
        }
        return nivelActual;
    }

    public static void main(String[] args) {
        int d = calcularDano(20, 8);
        System.out.println("Dano: " + d);

        double v = aplicarCuracion(40, 80, 100);
        mostrarEstado("Frodo", v, 3);

        // Pruebas de subirNivel()
        System.out.println("\n--- PRUEBAS subirNivel() ---");
        
        // Prueba 1: xp=110, xpNecesario=100, nivel=3 -> debe retornar 4
        int nivel1 = subirNivel(110, 100, 3);
        System.out.println("Prueba 1: Nivel retornado = " + nivel1 + " (esperado: 4)");

        // Prueba 2: xp=80, xpNecesario=100, nivel=3 -> debe retornar 3 (no sube)
        int nivel2 = subirNivel(80, 100, 3);
        System.out.println("Prueba 2: Nivel retornado = " + nivel2 + " (esperado: 3)");
    }
}
