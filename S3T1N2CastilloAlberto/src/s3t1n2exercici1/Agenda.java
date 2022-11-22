package s3t1n2exercici1;

public class Agenda {

	private String direccion;
	private String telefono;

	public Agenda(String direccion, String telefono) {

		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Agenda [direccion=" + direccion + ", telefono=" + telefono + "]";
	}

}
