import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Introduce el país de origen (1España o 2Japón):");
            int paisOrigen = in.nextInt();
            System.out.println("Introduce la hora");
            int horas = in.nextInt();
            System.out.println("Introduce los minutos");

            int minutos = in.nextInt();
            in.nextLine(); // Limpiar el buffer

            System.out.println("Introduce el día de la semana:");
            String diaSemana = in.nextLine();

            if (esHoraValida(horas, minutos)) {
                if (paisOrigen == 1) {
                    convertirHoraEspañaAJapón(horas, minutos, diaSemana);
                } else if (paisOrigen == 2) {
                    convertirHoraJapónAEspaña(horas, minutos, diaSemana);
                } else {
                    System.out.println("País de origen no válido.");
                }
            } else {
                System.out.println("Hora no válida.");
            }

            System.out.println("¿Deseas continuar? (1 para sí, 2 para no):");
            int respuesta = in.nextInt();
            if (respuesta != 1) {
                continuar = false;
            }
        }

        }

        public static boolean esHoraValida ( int horas, int minutos){
            return horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60;
        }

        public static void convertirHoraEspañaAJapón ( int horas, int minutos, String diaSemana){
            int horasJapón = (horas + 8) % 24;
            String nuevoDia = diaSemana;

            if (horasJapón < horas) {
                nuevoDia = obtenerDiaSiguiente(diaSemana);
            }

            System.out.println("Japón son : " + horasJapón + ":" + minutos + ":" + nuevoDia);
        }

        public static void convertirHoraJapónAEspaña ( int horas, int minutos, String diaSemana){
            int horasEspaña = (horas - 8 + 24) % 24;
            String nuevoDia = diaSemana;

            if (horasEspaña > horas) {
                nuevoDia = obtenerDiaAnterior(diaSemana);
            }
            System.out.println("España son : " + horasEspaña + ":" + minutos + ":" + nuevoDia);
        }

        public static String obtenerDiaSiguiente (String dia){
            switch (dia) {
                case "lunes":
                    return "martes";
                case "martes":
                    return "miércoles";
                case "miércoles":
                    return "jueves";
                case "jueves":
                    return "viernes";
                case "viernes":
                    return "sábado";
                case "sábado":
                    return "domingo";
                case "domingo":
                    return "lunes";
                default:
                    return "día no válido";
            }
        }
        public static String obtenerDiaAnterior (String dia){
            switch (dia) {
                case "lunes":
                    return "domingo";
                case "martes":
                    return "lunes";
                case "miércoles":
                    return "martes";
                case "jueves":
                    return "miércoles";
                case "viernes":
                    return "jueves";
                case "sábado":
                    return "viernes";
                case "domingo":
                    return "sábado";
                default:
                    return "día no válido";
            }
        }
    }
