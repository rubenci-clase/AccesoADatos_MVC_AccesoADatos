import java.time.LocalDate;

public class Controlador {

	GestionDeHabitaciones habitaciones; 
	GestionDeClientes clientes;
	GestionDeReservas reservas;
	
	public Controlador() {
		this.habitaciones = new GestionDeHabitaciones();
		this.clientes = new GestionDeClientes();
		this.reservas = new GestionDeReservas();
	}
	
	public void añadirHabitacion(String tipoHabitacion, float precioDia) {
		habitaciones.añadirHabitacion(new Habitacion(tipoHabitacion, precioDia));
	}
	
	public void listarHabitaciones() {
		habitaciones.listarHabitaciones();
	}
	
	public void eliminarHabitacion(int idHabitacion) {
		
		if (!reservas.buscarSiHayUnaReserva(idHabitacion)) {
			habitaciones.quitarHabitacion(idHabitacion);
		}
		else {
			System.out.println("Ese id de habitación no existe");
		}
	}
	
	public void registrarCliente(String nombreCliente, String dniCliente) {
		clientes.añadirCliente(new Cliente(nombreCliente, dniCliente));
	}
	
	public void listarClientes() {
		clientes.listarClientes();
	}
	
	public void eliminarCliente(int idCliente) {
		clientes.borrarCliente(idCliente);
	}
	
	public void crearReserva(int idHabitacionAReservar,int idCliente,String fechaDeEntrada, String fechaDeSalida) {
		
		if(!reservas.buscarSiHayUnaReserva(idHabitacionAReservar)) {
			
			//Comprobación de si las fechas tienen el formato correcto
			if (ExpresionesRegulares.validarFecha(fechaDeEntrada) && ExpresionesRegulares.validarFecha(fechaDeSalida)) {
				
				//Formateo de la fecha para poder hacerla localDate
				String fechaDeEntradaSeparada [] = fechaDeEntrada.split("/");
				LocalDate fechaEntradaFormateada = LocalDate.of(Integer.parseInt(fechaDeEntradaSeparada[0]), Integer.parseInt(fechaDeEntradaSeparada[1]), Integer.parseInt(fechaDeEntradaSeparada[2]));
				
				String fechaDeSalidaSeparada [] = fechaDeSalida.split("/");
				LocalDate fechaSalidaFormateada = LocalDate.of(Integer.parseInt(fechaDeSalidaSeparada[0]), Integer.parseInt(fechaDeSalidaSeparada[1]), Integer.parseInt(fechaDeSalidaSeparada[2]));
				
				//Precio de la habitación * los días
				float precioTotal = habitaciones.getHabitacion(idHabitacionAReservar).getPrecioNoche() * fechaEntradaFormateada.until(fechaSalidaFormateada).getDays();
				
				reservas.añadirReserva(new Reserva(idHabitacionAReservar, idCliente, fechaSalidaFormateada, fechaEntradaFormateada, precioTotal));
				
			}
			else System.out.println("Fecha introducida incorrectamente");
		}
		else System.out.println("Ya hay una reserva para esa habitacion");

	}
	
	public void listarReservas() {
		reservas.listarReservas();
	}
	
	public void borrarReserva(int idReserva) {
		reservas.borrarReserva(idReserva);
	}
	
	public void buscarReservaPorCliente(int idCliente) {
		reservas.imprimirReservasPorIdCliente(idCliente);
	}
	
	public void buscarReservaPorHabitacion(int idHabitacion) {
		reservas.imprimirReservasPorIdHabitacion(idHabitacion);
	}
	
	public float obtenerIngresosTotales() {
		
		return reservas.obtenerBeneficioTotal();
	}
}
