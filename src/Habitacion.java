
public class Habitacion {

	static int idAnterior = 0;
	int id;
	String tipo;
	float precioNoche;
	
	public Habitacion (String tipo, float precioNoche){
		this.id = idAnterior;
		this.tipo = tipo;
		this.precioNoche = precioNoche;
		idAnterior++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPrecioNoche() {
		return precioNoche;
	}

	public void setPrecioNoche(float precioNoche) {
		this.precioNoche = precioNoche;
	}

	@Override
	public String toString() {
		return "Habitacion [id=" + id + ", tipo=" + tipo + ", precioNoche=" + precioNoche + "]";
	}
	
	
	
	
}
