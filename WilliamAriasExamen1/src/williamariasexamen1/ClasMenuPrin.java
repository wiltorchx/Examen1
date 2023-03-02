public class ClasMenuPrin {
    static Scanner sc = new Scanner(System.in);

    static String[] Nfactura = new String[10];
    static String[] CedulaCliente = new String[10];
    static String[] NombreCliente = new String[10];
    static String[] Localidad = new String[10];
    static double[] Subtotal = new double[10];
    static double[] CargoServi = new double[10];
    static double[] Total = new double[10];
    static int Cantcliente = 0;
    static int totalEntradasVendidas = 0;
    static int opcion = 0;

    public static void main(String[] args) {
        Menuprin();
    }

    public static void Menuprin() {

        while (opcion != 4) {
            System.out.println("------- Federacion Costarricense de Futbol-------\n");
            System.out.println("1. Inicializar Vectores.");
            System.out.println("2. Incluir Cliente");
            System.out.println("3. Compra de entradas.");
            System.out.println("4. Salir.");
            System.out.print("Seleccione una opcion: ");

            // Validar entrada para que sea un número del 1 al 4
            while (!sc.hasNextInt()) {
                System.out.println("La opcion marcada es invalida.");
                System.out.print("Digite una opcion: ");
                sc.next();
            }

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    inicializarVec();
                    break;
                case 2:
                    IncluirCliente();
                    break;
                case 3:
                    System.out.println("Seleccione una localidad:");
                    System.out.println("1. Sol Norte/Sur (10500 colones).");
                    System.out.println("2. Sombra Este/Oeste (20500 colones).");
                    System.out.println("3. Preferencial (25500 colones).");
                    System.out.print("Digite una opcion: ");
                    int localidad = sc.nextInt();

                    System.out.println("Cuantas entradas desea comprar?");
                    int cantEntradas = sc.nextInt();

                    if (totalEntradasVendidas + cantEntradas > 10) {
                        System.out.println("No se pueden vender más de 10 entradas por cliente.");
                        break;
                    }

                    switch (localidad) {
                        case 1:
                            System.out.println("Usted ha seleccionado Sol Norte/Sur.");
                            System.out.println("El total a pagar es: " + cantEntradas * 10500 + " colones.");
                            totalEntradasVendidas += cantEntradas;
                            break;
                        case 2:
                            System.out.println("Usted ha seleccionado Sombra Este/Oeste.");
                            System.out.println("El total a pagar es: " + cantEntradas * 20500 + " colones.");
                            totalEntradasVendidas += cantEntradas;
                            break;
                        case 3:
                            System.out.println("Usted ha seleccionado Preferencial.");
                            System.out.println("El total a pagar es: " + cantEntradas * 25500 + " colones.");
                            totalEntradasVendidas += cantEntradas;
                            break;
                        default:
                            System.out.println("La opcion marcada es invalida.");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el programa.");
                    break;
                default:
                    System.out.println("\n La opcion marcada es invalida.");
              }      