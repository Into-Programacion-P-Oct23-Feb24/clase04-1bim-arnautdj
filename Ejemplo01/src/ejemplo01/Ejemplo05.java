/*
René Rolando

Elizalde Solano

1983
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {
    public static void main(String[] args) {
        // Secuencia de escape \n y \t
        String nombreEstudiante = "Santiago Fernando";
        String apellidoEstudiante = "Rosales Vivanco";
        int nacimiento = 2005;
        
        /*System.out.println(nombreEstudiante+"\n"+apellidoEstudiante+ "\n"+ 
                nacimiento);
        
        System.out.println(nombreEstudiante+"\n\n"+apellidoEstudiante+ "\n\n"+ 
                nacimiento);
        
        System.out.println(nombreEstudiante+"\n"+"\n"+apellidoEstudiante+ "\n"+
                "\n"+ nacimiento); */
        System.out.println(nombreEstudiante+"\t"+apellidoEstudiante);   
        System.out.println(nombreEstudiante+"\n"+apellidoEstudiante);
        /*
        El separador "\t" sirve para dar un espacio de tabulador, mientras que
        el separador "\n" sirve para dar un espacio de linea.
        */
    }
}
