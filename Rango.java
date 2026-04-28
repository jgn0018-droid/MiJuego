package MiJuego;

public class Rango {
private String Nombre;
	
	public Rango() {
		this.Nombre="";
	}
	
	public Rango (String Nombre) {
		this.Nombre=Nombre;
	}
	
	public void setNombre (String Nombre) {
		this.Nombre=Nombre;
	}
	
	public String getNombre() {
		return this.Nombre;
	}
	
	public String toString () {
		return this.Nombre;
	}
	
	
	public enum Rangos {
	    Común,
	    Especial,
	    Épico,
	    Inusual,
	    Legendario,
	    Mítico;
	}

}
