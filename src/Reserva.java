import java.time.LocalDate;

public class Reserva {

	static int idReservaAnterior = 0;
	
	int idReserva;
	int idHabitacion;
	int idCliente;
	LocalDate fechaEntrada;
	LocalDate fechaSalida;
	float precioTotal;
	
	public Reserva(int idHabitacion, int idCliente, LocalDate fechaSalida,
			LocalDate fechaEntrada, float precioTotal) {
		
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

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
	
}
