import java.time.LocalTime;
public class Vuelo{
    int idVuelos;
    String destino;
    LocalTime horaLocalTime;
    float precio;

    public Vuelo(int idVuelos, String destino, LocalTime horaLocalTime, float precio) {
        this.idVuelos = idVuelos;
        this.destino = destino;
        this.horaLocalTime = horaLocalTime;
        this.precio = precio;
    }

    void obtenerVuelo(){
        System.out.println("----- INFORMACIÓN DEL VUELO -----");
        System.out.println("Informacion del vuelo - ID: " + idVuelos + 
        " Destino: " + destino + 
        " Hora: " + horaLocalTime + 
        " Precio: $" + precio);
    }

    void aplicarDescuentoPorHorario() {
        int hora = horaLocalTime.getHour();

        if (hora < 6) {
            precio *= 0.8;
            System.out.println("Descuento del 20% por vuelo muy temprano");
        } else if (hora >= 22) {
            precio *= 0.85;
            System.out.println("Descuento del 15% por vuelo nocturno");
        } else {
            System.out.println("Este vuelo no tiene descuento");
        }
    }
}
