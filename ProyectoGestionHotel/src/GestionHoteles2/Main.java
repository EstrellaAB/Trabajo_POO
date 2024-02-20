package GestionHoteles2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear seis hoteles con información diferente
        Hotel hotel1 = new Hotel("Santa Cruz",4, new String[]{"Individual", "Doble", "Triple", "Cuádruple"}, new double[]{50.0, 80.0, 110.0, 140.0});
        Hotel hotel2 = new Hotel("El Arenal", 4, new String[]{"Individual", "Doble", "Triple", "Cuádruple"}, new double[]{50.0, 80.0, 110.0, 140.0});
        Hotel hotel3 = new Hotel("Feria", 4, new String[]{"Individual", "Doble", "Triple", "Cuádruple"}, new double[]{50.0, 80.0, 110.0, 140.0});
        Hotel hotel4 = new Hotel("Alfalfa", 4, new String[]{"Individual", "Doble", "Triple", "Cuádruple"}, new double[]{50.0, 80.0, 110.0, 140.0});
        Hotel hotel5 = new Hotel("San Gil", 4, new String[]{"Individual", "Doble", "Triple", "Cuádruple"}, new double[]{50.0, 80.0, 110.0, 140.0});
        Hotel hotel6 = new Hotel("Hotel Macarena", 4, new String[]{"Individual", "Doble", "Triple", "Cuádruple"}, new double[]{50.0, 80.0, 110.0, 140.0});

        boolean continuar = true;

        while (continuar) {
            // Mostrar información de los hoteles
            hotel1.mostrarInformacion();
            hotel2.mostrarInformacion();
            hotel3.mostrarInformacion();
            hotel4.mostrarInformacion();
            hotel5.mostrarInformacion();
            hotel6.mostrarInformacion();

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
                    case 6:
                        hotel = hotel6;
                        break;
                    default:
                        hotel = null;
                        break;
                }

                if (hotel != null) {
                    System.out.println("Seleccione una acción:");
                    System.out.println("1. Reservar una habitación");
                    System.out.println("2. Cancelar la reserva de una habitación");
                    int accion = scanner.nextInt();

                    switch (accion) {
                        case 1:
                            System.out.println("Seleccione una habitación para reservar (1-4): ");
                            int numHabitacion = scanner.nextInt();
                            hotel.habitaciones.get(numHabitacion - 1).reservar();
                            break;
                        case 2:
                            System.out.println("Seleccione una habitación para cancelar la reserva (1-4): ");
                            int numHabitacionCancelar = scanner.nextInt();
                            hotel.habitaciones.get(numHabitacionCancelar - 1).cancelarReserva();
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

	