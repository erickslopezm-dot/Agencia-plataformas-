import java.util.Scanner;
import java.util.Random;

class Reserva {
    int numeroReserva;
    String estado = "En espera";
    String nombreHotel;
    int numeroVuelo;

    public void crearReserva(Scanner scanner) {
        Random r = new Random();
        numeroReserva = r.nextInt(1000);
        numeroVuelo = r.nextInt(500);

        System.out.print("Digite el nombre del hotel: ");
        nombreHotel = scanner.nextLine();

        System.out.println("Reserva creada con numero: " + numeroReserva);
    }

    public void confirmarReserva(Scanner scanner) {
        System.out.print("Desea confirmar la reserva? (si/no): ");
        String respuesta = scanner.nextLine().toLowerCase();

        if (respuesta.equals("si")) {
            estado = "Confirmado";
        } else if (respuesta.equals("no")) {
            estado = "Cancelado";
        } else {
            System.out.println("Respuesta invalida");
        }
    }

    public void mostrarReserva() {
        System.out.println("Numero reserva: " + numeroReserva);
        System.out.println("Numero vuelo: " + numeroVuelo);
        System.out.println("Hotel: " + nombreHotel);
        System.out.println("Estado: " + estado);
    }
}

class Vuelo {
    String fecha;
    String hora;
    String estadoVuelo = "A tiempo";

    public void mostrarVuelo() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Estado vuelo: " + estadoVuelo);
    }
}

class Hotel {
    String nombre;
    String direccion;

    public void mostrarHotel() {
        System.out.println("Hotel: " + nombre);
        System.out.println("Direccion: " + direccion);
    }
}