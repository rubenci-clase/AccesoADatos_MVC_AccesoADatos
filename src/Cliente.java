
public class Cliente {

	static int idAnterior = 0;
	
	int id;
	String nombre;
	String dni;
	
	public Cliente(String nombre, String dni) {
		this.id = idAnterior;
		this.nombre = nombre;
		this.dni = dni;
		idAnterior++;
	}

	public static int getIdAnterior() {
		return idAnterior;
	}

	public static void setIdAnterior(int idAnterior) {
		Cliente.idAnterior = idAnterior;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
	
}
