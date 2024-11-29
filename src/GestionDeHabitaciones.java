import java.util.ArrayList;

public class GestionDeHabitaciones {

	ArrayList<Habitacion> listaHabitaciones;
	
	public GestionDeHabitaciones () {
		this.listaHabitaciones = new ArrayList<Habitacion>();
	}
	
	public void añadirHabitacion(Habitacion h) {
		
		listaHabitaciones.add(h);
	}
	
	public void quitarHabitacion (int idHabitacion) {
		for (Habitacion h : listaHabitaciones) {
			if (h.getId() == idHabitacion) listaHabitaciones.remove(h);
		}
		
		
	}
	
	public void listarHabitaciones () {
		for (Habitacion h : listaHabitaciones) {
			System.out.println(h.toString());
		}
	}
	

}
