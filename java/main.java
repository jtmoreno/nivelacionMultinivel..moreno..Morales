public class main {
    public static void main(String[] args) {
        // --- 5.1: Configuración del Escenario ---
        // Héroe protagonista
        PersonajeBase heroe = new PersonajeBase("Aragorn", 2, 80.0, 80.0, true, "Guerrero", 18, 10, 0);

        // Array de enemigos (Requisito 5.1)
        PersonajeBase[] hordaEnemiga = {
            new PersonajeBase("Goblin", 40, true, 8),
            new PersonajeBase("Orco", 70, true, 14),
            new PersonajeBase("Dragon", 120, true, 25)
        };

        int derrotados = 0;

        System.out.println("--- INICIO DE LA AVENTURA ---");

        // --- 5.3: Ciclo de Combate en Secuencia ---
        for (PersonajeBase enemigo : hordaEnemiga) {
            System.out.println("\n¡Aparece un " + enemigo.getNombre() + "!");
            
            // 5.2: Llamada a la función de combate
            boolean victoria = combatir(heroe, enemigo);

            if (victoria) {
                derrotados++;
                System.out.println("Venciste al " + enemigo.getNombre());
                
                // 5.5: Curación automática tras ganar (+20 HP)
                heroe.setVida(20, false);
                System.out.println("Curación post-combate. HP actual: " + heroe.getVida());
            } else {
                // 5.4: Condicional de derrota[cite: 1]
                System.out.println("El héroe ha caído... GAME OVER.");
                break; 
            }
        }

        // --- 5.5: Reporte Final ---
        System.out.println("\n=== RESULTADOS FINALES ===");
        System.out.println("Enemigos derrotados: " + derrotados + "/3");
        System.out.println("Vida restante del héroe: " + heroe.getVida());
        if (derrotados == 3) System.out.println("¡Eres una leyenda!");
    }

    // --- 5.2: Función Modular de Combate (Integrador) ---
    public static boolean combatir(PersonajeBase h, PersonajeBase e) {
        // Mientras ambos sigan vivos (Ciclo del Bloque 3)[cite: 1]
        while (h.getVida() > 0 && e.getVida() > 0) {
            // Héroe ataca
            e.setVida(h.getPuntosAtaque(), true);
            
            // Enemigo contraataca si no ha muerto
            if (e.getVida() > 0) {
                h.setVida(e.getPuntosAtaque(), true);
            }
        }
        return h.getVida() > 0; // Retorna true si el héroe ganó
    }

    // Método extra que ya tenías
    public static int sumarVidaParty(PersonajeBase... personajes) {
        int vidaTotal = 0;
        for (PersonajeBase p : personajes) {
            vidaTotal += (int) p.getVida();
        }
        return vidaTotal;
    }
}