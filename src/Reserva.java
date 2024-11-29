import java.time.LocalDate;

public class Reserva {

	static int idReservaAnterior = 0;
	
	int idReserva;
	int idHabitacion;
	int idCliente;
	String fechaEntrada;
	String fechaSalida;
	int precioTotal;
	
	public Reserva(int idHabitacion, int idCliente, String fechaEntrada, String fechaSalida,
			int precioTotal) {
		
		this.idReserva = idReservaAnterior;
		this.idHabitacion = idHabitacion;
		this.idCliente = idCliente;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.precioTotal = precioTotal;
		idReservaAnterior++;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getIdHabitacion() {
		return idHabitacion;
	}

	public void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
	
}
