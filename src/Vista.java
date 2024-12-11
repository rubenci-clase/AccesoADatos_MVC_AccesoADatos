import java.util.Scanner;

public class Vista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int opcionSeleccionada = 20;
		Controlador controlador = new Controlador();
		
		
		while (opcionSeleccionada != 0) {
			System.out.println(
				"1. Añadir habitacion al sistema\n" +
				"2. Listar todas las habitaciones disponibles\n" +
				"3. Eliminar habitación\n" +
				"4. Registrar cliente\n" +
				"5. Listar clientes registrados\n" +
				"6. Eliminar cliente\n" +
				"7. Crear reserva\n" +
				"8. Listar reserva\n" +
				"9. Cancelar reserva\n" +
				"10. Buscar reserva por cliente\n" +
				"11. Buscar reserva por habitación\n" +
				"12. Ver ingresos totales\n" +
				"0. Salir\n");
			
			opcionSeleccionada = entrada.nextInt();
			
			switch (opcionSeleccionada) {
			case 1: {
				System.out.println("Introduce el tipo de habitación (Individual, Doble o Suite)");
				String tipoHabitacion = entrada.nextLine();
				
				System.out.println("Introduce el precio por noche");
				float precioDia = entrada.nextFloat();
				
				controlador.añadirHabitacion(tipoHabitacion, precioDia);
				break;
			}
			case 2: {
				controlador.listarHabitaciones();
				break;
			}
			case 3: {
				System.out.println("Introduce el id de la habitación a eliminar");
				int idHabitacion = entrada.nextInt();
				
				controlador.eliminarHabitacion(idHabitacion);
				break;
			}
			case 4: {
				System.out.println("Introduce el nombre del cliente");
				String nombreCliente = entrada.nextLine();
				
				System.out.println("Introduce el dni del cliente");
				String dniCliente = entrada.next();
				
				controlador.registrarCliente(nombreCliente, dniCliente);
				break;
			}
			case 5: {
				controlador.listarClientes();
				break;
			}
			case 6: {
				System.out.println("Introduce el id del cliente");
				int idCliente = entrada.nextInt();
				
				controlador.eliminarCliente(idCliente);
				break;
			}
			case 7: {
				System.out.println("Introduce el id de la habitacion a Reservar");
				int idHabitacionAReservar = entrada.nextInt();
				
				System.out.println("Introduce el id del cliente");
				int idCliente = entrada.nextInt();
					
				System.out.println("Introduce la fecha de entrada FORMATO DD/MM/YYYY");
				String fechaDeEntrada = entrada.next();

				System.out.println("Introduce la fecha de salida FORMATO DD/MM/YYYY");
				String fechaDeSalida = entrada.next();
					
				controlador.crearReserva(idHabitacionAReservar, idCliente, fechaDeEntrada, fechaDeSalida);
					
				break;
			}
			case 8: {
				controlador.listarReservas();
				break;
			}
			case 9: {
				System.out.println("Introduce la id de la reserva a borrar");
				int idReservaABorrar = entrada.nextInt();
				
				controlador.borrarReserva(idReservaABorrar);
				break;
			}
			case 10: {
				System.out.println("Introduce el id del cliente");
				int idCliente = entrada.nextInt();
				controlador.buscarReservaPorCliente(idCliente);
				break;
			}
			case 11: {
				System.out.println("Introduce el id de la habitacion");
				int idHabitacion = entrada.nextInt();
				controlador.buscarReservaPorHabitacion(idHabitacion);
				break;
			}
			case 12: {
				System.out.println("El beneficio total es: " + controlador.obtenerIngresosTotales());
				break;
			}
		}
		
	}

}
}
