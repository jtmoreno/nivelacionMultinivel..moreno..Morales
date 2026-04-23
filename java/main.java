public static void main(String[] args) {
    PersonajeBase p = new PersonajeBase("aragon", 1, 100, 100,
     true, "guerrero", 15, 10,0);
    System.out.println(p.nombre);
    System.out.println(p.nivel);
    System.out.println(p.vida);


    p.toString();
}