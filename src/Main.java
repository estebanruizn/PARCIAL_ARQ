import java.util.Scanner;

//ESTEBAN ANDRES RUIZ NOVOA
public class Main {
    public static void main(String[] args) {

        Linea1 l1 = new Linea1();

        Lineas ll = new Lineas();

        Linea2 l2 = new Linea2();

        Linea3 l3 = new Linea3();

        Scanner teclado = new Scanner(System.in);

        for (int i=1;i<=60;i++){
            System.out.println("1. llamar linea 1");
            System.out.println("2. llamar linea 2");
            System.out.println("3. llamar linea 3");
            System.out.println("4. Mostrar informacion por linea");
            System.out.println("5. Mostrar consolidado total de las lineas");
            System.out.println("6. Reiniciar uso de lineas");
            System.out.println("Que opcion escoges: ");
            int opc = teclado.nextInt();

        if (opc ==1){
            for (int ii=1;ii<=1;ii++) {
                System.out.println("1. Hacer una llamada local");
                System.out.println("2. Hacer una llamada larga distancia");
                System.out.println("3. Hacer una llamada a celular");
                System.out.println("Que opcion escoges: ");
                int opc1 = teclado.nextInt();

                if (opc1==1){
                    l1.registrarLlamadaLocal();
                } else if (opc1==2) {
                    l1.registrarLlamadaLargaDistancia();
                } else if (opc1==3) {
                    l1.registrarLlamadaCelular();
                }else{
                    System.out.println("Escoja una opcion valida");
                }

            }
        }else if (opc==2){
            for (int ii=1;ii<=1;ii++) {
                System.out.println("1. Hacer una llamada local");
                System.out.println("2. Hacer una llamada larga distancia");
                System.out.println("3. Hacer una llamada a celular");
                System.out.println("Que opcion escoges: ");
                int opc1 = teclado.nextInt();

                if (opc1==1){
                    l2.registrarLlamadaLocal();
                } else if (opc1==2) {
                    l2.registrarLlamadaLargaDistancia();
                } else if (opc1==3) {
                    l2.registrarLlamadaCelular();
                }else{
                    System.out.println("Escoja una opcion valida");
                }

            }
        } else if (opc==3) {
            for (int ii=1;ii<=1;ii++) {
                System.out.println("1. Hacer una llamada local");
                System.out.println("2. Hacer una llamada larga distancia");
                System.out.println("3. Hacer una llamada a celular");
                System.out.println("Que opcion escoges: ");
                int opc1 = teclado.nextInt();

                if (opc1==1){
                    l3.registrarLlamadaLocal();
                } else if (opc1==2) {
                    l3.registrarLlamadaLargaDistancia();
                } else if (opc1==3) {
                    l3.registrarLlamadaCelular();
                }else{
                    System.out.println("Escoja una opcion valida");
                }

            }
        } else if (opc==4) {
            for (int ii=1;ii<=1;ii++) {
                System.out.println("1. linea 1");
                System.out.println("2. linea 2");
                System.out.println("3. linea 3");
                System.out.println("Que opcion escoges: ");
                int opc1 = teclado.nextInt();

                if (opc1==1){
                    l1.mostrarDetalle();
                } else if (opc1==2) {
                    l1.mostrarDetalle();
                } else if (opc1==3) {
                    l1.mostrarDetalle();
                }else{
                    System.out.println("Opcion invalida");
                }

            }
        } else if (opc==5) {
            ll.mostrarDetalle();
        } else if (opc==6) {
            ll.reiniciarValores();
        }else {
            System.out.println("Seleccione una opcion correcta");
        }
        }



    }
}