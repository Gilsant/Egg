package firstproject;

import java.util.Scanner; // Este es el importe de la clase Scanner



    public class FirstProject {
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer1 = new Scanner(System.in);
   
        System.out.println("Cual es tu nombre?");
        String nombre = leer1.nextLine();
         System.out.println("Bienvenid@ " +nombre+ ", cuantos años tenes?");
    Scanner leer2 = new Scanner(System.in);
        int edad = leer2.nextInt();
        System.out.println("Wow! "+edad+ " años");
        System.out.println("Este es el ultimo paso quiero ver si subo los cambios");
    
    }

}