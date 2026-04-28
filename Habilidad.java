package MiJuego;

public class Habilidad {
	private String Nombre;
	private String Descripción;
	
	public Habilidad() {
		this.Nombre="";
		this.Descripción="";
	}
	
	public Habilidad (String Nombre, String Descripción) {
		this.Nombre=Nombre;
		this.Descripción=Descripción;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre=Nombre;
	}
	
	public void setDescripción(String Descripción) {
		this.Descripción=Descripción;
	}
	
	public String getNombre() {
		return this.Nombre;
	}
	
	public String getDescripción() {
		return this.Descripción;
	}
	
	public String toString () {
		return this.Nombre + ": " + this.Descripción;
	}

}
