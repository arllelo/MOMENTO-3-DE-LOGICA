import java.util.Scanner;

public class Ortiz3 {


    public static boolean buscarReferencia(String[] arreglo, String nombreBuscado)
     {
        for (int contador = 0; contador < arreglo.length; contador++) 
            {
            if (arreglo[contador] != null && arreglo[contador].equals(nombreBuscado)) {
                
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        String[] referencias = {
            "Chaqueta Cuero icon",
            "Jean Slim fit",
            "Camiseta Poolo leather",
            null,
            null
        };

        int opcion = 0;

        while (opcion != 4) {

            System.out.println("InventarioChevignon");
            System.out.println("1.Lista de  Referencias");
            System.out.println("2.Buscar una Referencia");
            System.out.println("3.Agregar una Referencia");
            System.out.println("4.Salir de la consola");
            System.out.print("Seleccione una opcion: ");
            opcion = consola.nextInt();
            consola.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.println("REFERENCIAS DISPONIBLES:");

                    for (int contador = 0; contador < referencias.length; contador++) {
                        if (referencias[contador] != null) {
                            System.out.println("- " + referencias[contador]);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Ingrese la referencia  a buscar: ");
                    String nombreBuscado = consola.nextLine();
                   

                    if (buscarReferencia(referencias, nombreBuscado)) {
                        System.out.println("La referencia SI se encuentra disponible en el inventario.");
                    } else {
                        System.out.println("La referencia NO se ecnuentra disponible en el inventario.");
                         }
                    break;

                case 3:
                    System.out.print("Ingrese la referencia nueva a agregar: ");
                    String nuevaReferencia = consola.nextLine();

                    boolean agregada = false;

                    for (int contador = 0; contador < referencias.length; contador++) {
                        if (referencias[contador] == null) {
                            referencias[contador    ] = nuevaReferencia;
                            agregada = true;
                            System.out.println("La referencia ha sido agregada correctamente.");
                            break;
                        }
                    }

                    if (!agregada) {
                        System.out.println("Sin espacio disponible.");
                    }
                    break;

                case 4:
                    System.out.println("Consola cerrada correctamente.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        }

        consola.close();
    }
}

            