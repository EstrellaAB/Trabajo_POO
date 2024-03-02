package gestionHoteles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creo seis hoteles con información diferente
        Hotel hotel1 = new Hotel("Santa Cruz", 100, new String[]{"Individual", "Doble", "Triple", "Cuádruple"}, new double[]{50.0, 80.0, 110.0, 140.0});
        // Crear habitaciones para el hotel1
        hotel1.addHabitacion(new Habitacion("Individual", 50.0, true));
        hotel1.addHabitacion(new Habitacion("Doble", 80.0, true));
        hotel1.addHabitacion(new Habitacion("Triple", 110.0, true));
        hotel1.addHabitacion(new Habitacion("Cuádruple", 140.0, true));

        Hotel hotel2 = new Hotel("El Arenal", 150, new String[]{"Individual", "Doble", "Triple", "Cuádruple"}, new double[]{50.0, 80.0, 110.0, 140.0});
        // Creo habitaciones para el hotel2
        hotel2.addHabitacion(new Habitacion("Individual", 50.0, true));
        hotel2.addHabitacion(new Habitacion("Doble", 80.0, true));
        hotel2.addHabitacion(new Habitacion("Triple", 110.0, true));
        hotel2.addHabitacion(new Habitacion("Cuádruple", 140.0, true));

        Hotel hotel3 = new Hotel("Feria", 400, new String[]{"Individual", "Doble", "Triple", "Cuádruple"}, new double[]{50.0, 80.0, 110.0, 140.0});
        // Creo habitaciones para el hotel3
        hotel3.addHabitacion(new Habitacion("Individual", 50.0, true));
        hotel3.addHabitacion(new Habitacion("Doble", 80.0, true));
        hotel3.addHabitacion(new Habitacion("Triple", 110.0, true));
        hotel3.addHabitacion(new Habitacion("Cuádruple", 140.0, true));

        Hotel hotel4 = new Hotel("Alfalfa", 300, new String[]{"Individual", "Doble", "Triple", "Cuádruple"}, new double[]{50.0, 80.0, 110.0, 140.0});
        // Creo habitaciones para el hotel4
        hotel4.addHabitacion(new Habitacion("Individual", 50.0, true));
        hotel4.addHabitacion(new Habitacion("Doble", 80.0, true));
        hotel4.addHabitacion(new Habitacion("Triple", 110.0, true));
        hotel4.addHabitacion(new Habitacion("Cuádruple", 140.0, true));

        Hotel hotel5 = new Hotel("San Gil", 250, new String[]{"Individual", "Doble", "Triple", "Cuádruple"}, new double[]{50.0, 80.0, 110.0, 140.0});
        // Creo habitaciones para el hotel5
        hotel5.addHabitacion(new Habitacion("Individual", 50.0, true));
        hotel5.addHabitacion(new Habitacion("Doble", 80.0, true));
        hotel5.addHabitacion(new Habitacion("Triple", 110.0, true));
        hotel5.addHabitacion(new Habitacion("Cuádruple", 140.0, true));

     
        boolean continuar = true;

        while (continuar) {
            // Muestro información de los hoteles
            hotel1.mostrarInformacion();
            hotel2.mostrarInformacion();
            hotel3.mostrarInformacion();
            hotel4.mostrarInformacion();
            hotel5.mostrarInformacion();
            
            
            //Implemento la lógica de las reservas.

            System.out.println("Seleccione un hotel para realizar una acción (1-6): ");
            int numHotel = scanner.nextInt();

            if (numHotel >= 1 && numHotel <= 6) {
                Hotel hotel;
                switch (numHotel) {
                    case 1:
                        hotel = hotel1;
                        break;
                    case 2:
                        hotel = hotel2;
                        break;
                    case 3:
                        hotel = hotel3;
                        break;
                    case 4:
                        hotel = hotel4;
                        break;
                    case 5:
                        hotel = hotel5;
                        break;
                   
                    default:
                        hotel = null;
                        break;
                }
                
                if (hotel != null) {
                    System.out.println("Seleccione una acción:");
                    System.out.println("1. Abrir hotel");
                    System.out.println("2. Cerrar hotel");
                    int accion = scanner.nextInt();

                    switch (accion) {
                        case 1:
                            hotel.abrirHotel();
                            break;
                        case 2:
                            hotel.cerrarHotel();
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }

                    System.out.println("¿Desea realizar otra acción? (S/N)");
                    String continuarStr = scanner.next();
                    continuar = continuarStr.equalsIgnoreCase("S");
                } else {
                    System.out.println("El número de hotel seleccionado no es válido.");
                }
            } else {
                System.out.println("El número de hotel seleccionado no es válido.");
            }
        }
    }  
}


