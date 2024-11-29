import java.util.Scanner;

public class Controlador {

	GestionDeHabitaciones habitaciones; 
	GestionDeClientes clientes;
	GestionDeReservas reservas;
	
	public Controlador() {
		this.habitaciones = new GestionDeHabitaciones();
		this.clientes = new GestionDeClientes();
		this.reservas = new GestionDeReservas();
	}
	
	public void añadirHabitacion() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el tipo de habitación (Individual, Doble o Suite)");
		String tipoHabitacion = entrada.nextLine();
		
		System.out.println("Introduce el precio por noche");
		float precioDia = entrada.nextFloat();
		
		habitaciones.añadirHabitacion(new Habitacion(tipoHabitacion, precioDia));
	}
	
	public void listarHabitaciones() {
		habitaciones.listarHabitaciones();
	}
	
	public void eliminarHabitacion() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el id de la habitación a eliminar");
		int idHabitacion = entrada.nextInt();
		
		if (!reservas.buscarSiHayUnaReserva(idHabitacion)) {
			habitaciones.quitarHabitacion(idHabitacion);
		}
		else {
			System.out.println("Ese id de habitación no existe");
		}
	}
	
	public void registrarCliente() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del cliente");
		String nombreCliente = entrada.nextLine();
		
		System.out.println("Introduce el dni del cliente");
		String dniCliente = entrada.next();
		
		clientes.añadirCliente(new Cliente(nombreCliente, dniCliente));
	}
	
	public void listarClientes() {
		clientes.listarClientes();
	}
	
	public void eliminarCliente() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el id del cliente");
		int idCliente = entrada.nextInt();
		
		clientes.borrarCliente(idCliente);
	}
	
	public void crearReserva() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el id de la habitacion a Reservar");
		int idHabitacionAReservar = entrada.nextInt();
		
		if(!reservas.buscarSiHayUnaReserva(idHabitacionAReservar)) {
			System.out.println("Introduce el id del cliente");
			int idCliente = entrada.nextInt();
			
			System.out.println("Introduce la fecha de entrada");
			String introduceLaFechaDeEntrada = entrada.next();
			
			System.out.println("Introduce la fecha de salida");
			String introduceLaFechaDeSalida = entrada.next();
			
			reservas.añadirReserva(new Reserva(0, idCliente, null, null, 0));
		}
		else {
			System.out.println("Ya hay una reserva para esa habitacion");
		}
	}
}
