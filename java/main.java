public static void main(String[] args) {
    /* "Gandalf",5, "Mago",5,80.0, 120 */
    PersonajeBase p1 = new PersonajeBase("gandalf", 1, 80, 80, true,
            "mago", 0, 10, 80);
    System.out.println(p1.nombre);
    System.out.println(p1.clase);
    System.out.println(p1.nivel);
    System.out.println(p1.vida);
    System.out.println(p1.puntosMana);

    PersonajeBase p = new PersonajeBase("aragon", 1, 100, 100,
            true, "guerrero", 15, 10, 0);
    System.out.println(p.nombre);
    System.out.println(p.nivel);
    System.out.println(p.vida);

    PersonajeBase goblin = new PersonajeBase("goblin", 40, true, 8);
    PersonajeBase orco = new PersonajeBase("orco", 70, true, 14);
    PersonajeBase dragon = new PersonajeBase("dragon", 120, true, 25);


    while ((sumarVidaParty(p1,p)>0) && sumarVidaParty(goblin,orco,dragon)>0 ) {
        
    }

    p.toString();



}

static int  sumarVidaParty (PersonajeBase... personajes){
    int vida =0;
    for (PersonajeBase personajeBase : personajes) {
        vida += personajeBase.getVida();
    }

    return vida;
}