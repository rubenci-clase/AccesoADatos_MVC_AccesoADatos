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
	
	public void borrarReserva(int idReserva) {
		for (Reserva r : listaReservas) {
			if (r.getIdHabitacion() == idReserva) {
				listaReservas.remove(r);
				break;
			}
		}
	}
	
	public boolean buscarSiHayUnaReserva(int idHabitacion) {
		
		for (Reserva r: listaReservas) {
			if(r.getIdHabitacion() == idHabitacion) return true;
		}
		
		return false;
	}
	
	public void imprimirReservasPorIdCliente(int idCliente) {
		for (Reserva r : listaReservas) {
			if(r.getIdCliente() == idCliente) System.out.println(r.toString());
		}
	}
	
	public void imprimirReservasPorIdHabitacion(int idHabitacion) {
		for (Reserva r : listaReservas) {
			if(r.getIdHabitacion() == idHabitacion) System.out.println(r.toString());
		}
	}
	
	public float obtenerBeneficioTotal() {
		float cantidadTotal = 0;
		for (Reserva r : listaReservas) {
			cantidadTotal += r.getPrecioTotal();
		}
		
		return cantidadTotal;
	}
}
