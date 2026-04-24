public class PersonajeBase {

    // Atributos del personaje

    String nombre;
    int nivel;
    double vida;
    double vidaMaxima;
    boolean estaVivo;
    String clase;
    int puntosAtaque;
    int puntosDefensa;
    int puntosMana;

    PersonajeBase(String nombre, int nivel, double vida,
            double vidaMaxima, boolean estaVivo, String clase, int puntosAtaque, int puntosDefensa
        ,int puntosMana) {
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


    public String getNombre(){
        return this.nombre;
    }
    public int getNivel(){
        return this.nivel;
    }
    public double getVida(){
        return this.vida;
    }
    public double getVidaMAx(){
        return this.vidaMaxima;
    }
    public boolean getEstaVivo(){
        return this.estaVivo;
    }
    public String getClase(){
        return this.clase;
    }
    public int  getPuntosAtaque(){
        return this.puntosAtaque;
    }
    public int  getPuntosDefensa(){
        return this.puntosDefensa;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString("nombre" +this.nombre + "nivel" );
    }
}

//f