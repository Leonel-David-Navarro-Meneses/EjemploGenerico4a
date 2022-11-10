package genericos;
//clase que crea y utiliza objetos tipo ClaseGenerica
public class TestingClaseGenerica {
    

    public static void main(String[] args) {
        
//declara un objeto de la clase generica
        ClaseGenerica <String> objeto1;
        ClaseGenerica<Integer> objeto2;
//declara un objeto de la clase genetica tipo cancion
       ClaseGenerica<Cancion> objeto3;

        //construir el objeto1
        objeto1 = new ClaseGenerica<>("Ginger");
        System.out.println("el contenido del objeto1 es: " + objeto1.getObjeto().toString());
        objeto1.getType();

          //usar el objeto2
        objeto2 = new ClaseGenerica<Integer>(100);
        System.out.println("el contenido del objeto 1 es: " + objeto2.getObjeto());
        objeto2.getType();

        //
        Cancion unaCancion  = new Cancion("in the end", "Linkin park");
        objeto3 = new ClaseGenerica<>(unaCancion);
        System.out.println("el contenid del objeto 3 es : " + objeto3.getObjeto());
        objeto3.getType();


        //recuperacion del contenido del objeto3 
        Cancion otroObjeto = objeto3.getObjeto();
        System.out.println("informacion de otro objeto: ");
        System.out.println(otroObjeto.getNombre() + "" + otroObjeto.getInterprete());
    }
}
