import java.util.ArrayList;

public class GestionDeReservas {

	ArrayList<Reserva> listaReservas;
	
	public GestionDeReservas() {
		this.listaReservas = new ArrayList<Reserva>();
	}
	
	public void añadirReserva(Reserva r) {
		listaReservas.add(r);
	}
	
	public void listarReservas() {
		for (Reserva r : listaReservas) {
			System.out.println(r.toString());
		}
	}
	
	public void borrarReserva(Reserva r) {
		listaReservas.remove(r);
	}
	
	public boolean buscarSiHayUnaReserva(int idHabitacion) {
		
		for (Reserva r: listaReservas) {
			if(r.getIdHabitacion() == idHabitacion) return true;
		}
		
		return false;
	}
}
