import java.util.ArrayList;

public class GestionDeClientes {

	ArrayList<Cliente> listaClientes;

	public GestionDeClientes() {
		this.listaClientes = new ArrayList<Cliente>();
	}
	
	public void añadirCliente(Cliente c) {
		listaClientes.add(c);
	}
	
	public void borrarCliente(int idCliente) {
		
		for(Cliente c : listaClientes) {
			if(c.getId() == idCliente) listaClientes.remove(c);
		}
	}
	
	public void listarClientes() {
		for (Cliente c : listaClientes) {
			System.out.println(c.toString());
		}
	}
	
	
	
}
