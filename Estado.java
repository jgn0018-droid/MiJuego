package MiJuego;

public class Estado {
	private String Nombre;
	private String Efecto;
	
	public Estado () {
		this.Nombre="";
		this.Efecto="";
	}
	
	public Estado (String Nombre, String Efecto) {
		this.Nombre=Nombre;
		this.Efecto=Efecto;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre=Nombre;
	}
	
	public void setEfecto(String Efecto) {
		this.Efecto=Efecto;
	}
	
	public String getNombre() {
		return this.Nombre;
	}
	
	public String getEfecto() {
		return this.Efecto;
	}
	
	public String toString () {
		return this.Nombre + "(" + this.Efecto + ")";
	}
	
	public enum Estados {
	    Quemadura,
	    Congelado,
	    Parálisis,
	    Sueño,
	    Hemorragia,
	    Veneno,
	    Confusión,
	    Nada;
	}

}
