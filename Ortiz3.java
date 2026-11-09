import java.util.Scanner;

public class Ortiz3 {


    public static boolean buscarReferencia(String[] arreglo, String nombreBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].equals(nombreBuscado)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

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
            System.out.println("1.Listar Referencias");
            System.out.println("2.Buscar Referencia");
            System.out.println("3.Agregar Referencia");
            System.out.println("4.Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.println("REFERENCIAS DISPONIBLES:");

                    for (int i = 0; i < referencias.length; i++) {
                        if (referencias[i] != null) {
                            System.out.println("- " + referencias[i]);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Ingrese la referencia a buscar: ");
                    String nombreBuscado = teclado.nextLine();

                    if (buscarReferencia(referencias, nombreBuscado)) {
                        System.out.println("La referencia SI existe en el inventario.");
                    } else {
                        System.out.println("La referencia NO existe en el inventario.");
                         }
                    break;

                case 3:
                    System.out.print("Ingrese la nueva referencia: ");
                    String nuevaReferencia = teclado.nextLine();

                    boolean agregada = false;

                    for (int i = 0; i < referencias.length; i++) {
                        if (referencias[i] == null) {
                            referencias[i] = nuevaReferencia;
                            agregada = true;
                            System.out.println("Referencia agregada correctamente.");
                            break;
                        }
                    }

                    if (!agregada) {
                        System.out.println("No hay espacios disponibles en el arreglo.");
                    }
                    break;

                case 4:
                    System.out.println("Aplicación finalizada.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        teclado.close();
    }
}

            