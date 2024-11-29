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
				"0. Salir\n");
			
			opcionSeleccionada = entrada.nextInt();
			
			switch (opcionSeleccionada) {
			case 1: {
				controlador.añadirHabitacion();
				break;
			}
			case 2: {
				controlador.listarHabitaciones();
				break;
			}
			case 3: {
				controlador.eliminarHabitacion();
				break;
			}
			case 4: {
				controlador.registrarCliente();
				break;
			}
			case 5: {
				controlador.listarClientes();
				break;
			}
			case 6: {
				controlador.eliminarCliente();
				break;
			}
			case 7: {
				
				break;
			}
			case 8: {
				
				break;
			}
			case 9: {
				
				break;
			}
			case 10: {
				
				break;
			}
			case 11: {
				
				break;
			}
		}
		
	}

}
}
