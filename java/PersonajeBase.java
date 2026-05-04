public class PersonajeBase {
    String nombre;
    int nivel;
    double vida;
    double vidaMaxima;
    boolean estaVivo;
    String clase;
    int puntosAtaque;
    int puntosDefensa;
    int puntosMana;

    // Constructor completo (Héroe)
    public PersonajeBase(String nombre, int nivel, double vida, double vidaMaxima, 
                         boolean estaVivo, String clase, int puntosAtaque, 
                         int puntosDefensa, int puntosMana) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.vidaMaxima = vidaMaxima;
        this.estaVivo = estaVivo;
        this.clase = clase;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
        this.puntosMana = puntosMana;
    }

    // Constructor simplificado (Enemigos)
    public PersonajeBase(String nombre, double vida, boolean estaVivo, int puntosAtaque) {
        this.nombre = nombre;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.estaVivo = estaVivo;
        this.puntosAtaque = puntosAtaque;
        this.nivel = 1;
        this.clase = "Enemigo";
    }

    // --- MÉTODOS NECESARIOS PARA EL BLOQUE 5 ---
    public double getVida() { return vida; }
    public String getNombre() { return nombre; }
    public int getPuntosAtaque() { return puntosAtaque; }

    // Método para manejar daño (esDano = true) o curación (esDano = false)
    public void setVida(int cantidad, boolean esDano) {
        if (esDano) {
            this.vida -= cantidad;
            if (this.vida < 0) this.vida = 0;
        } else {
            this.vida += cantidad;
            if (this.vida > this.vidaMaxima) this.vida = this.vidaMaxima;
        }
    }

    @Override
    public String toString() {
        return String.format("%s [Nv.%d] | Vida: %.1f | Mana: %d", 
                             nombre, nivel, vida, puntosMana);
    }
}