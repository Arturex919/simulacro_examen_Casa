import java.util.Scanner;

public class Ejercicio_1 {
    public static void showMenu() {
        System.out.println("(a). Aprobados y suspendidos");
        System.out.println("(b). Billetes a Madrid");
        System.out.println("(c). Salir");
    }

    public static void aprobadosSupendidos() {
        Scanner in = new Scanner(System.in);
        int aprobados = 0;
        int supendidos = 0;
        boolean entrada = true;
        System.out.println("0 cierra");
        while (entrada) {
            System.out.println("notas");
            double notas = in.nextDouble();
            if (notas < 0) {
                entrada = false;
            } else if (notas >= 5 || notas <= 10) {
                aprobados++;
            } else if (notas > 0 || notas < 4.99) {
                supendidos++;
            }
        }
        System.out.println("numero de aprobado" + aprobados);
        System.out.println("numero de aprobado" + supendidos);

        if (aprobados > supendidos) {
            System.out.println("mas aprobados");
        } else if (supendidos > aprobados) {
            System.out.println("suspendido");
        } else {
            System.out.println("igual");
        }
    }
    public static void boletos(){
        Scanner in=new Scanner(System.in);;
        int pasajeros, edad;
        double tarifa = 32, total = 0,suma=0;
        String nombre;
        System.out.println("numero total de pasajero");
        pasajeros = in.nextInt();
        for (int i = 1; i <= pasajeros; i++) {
            in.nextLine(); //
            System.out.println("Ingresa el nombre del pasajero " + i + ":");
            nombre = in.nextLine();
            System.out.println("ingresa tu edad");
            edad = in.nextInt();
            if (edad >= 65) {
                total = tarifa - (tarifa * 0.10);
            } else if (edad >= 12 && edad <= 15) {
                total = tarifa - (tarifa * 0.08);
            } else if (edad >= 4 && edad <= 11) {
                total = tarifa - (tarifa * 0.35);
            } else if (edad <= 4) {
                total = 0.0;
            } else if (edad >= 16 && edad <= 64) {
                total = tarifa;
            }
            suma += total;
            System.out.println("el precio de "+nombre+""+total);
        }
        System.out.println("el total" + suma);


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char opcion;
        do {
            showMenu();
            opcion = in.next().toLowerCase().charAt(0);
            switch (opcion) {
                case 'a' -> {
                    aprobadosSupendidos();
                }
                case 'b'->{
                    boletos();
                }
                case 'c'-> System.out.println("adiosss");
            }
        }while (opcion !='c');
    }
}
