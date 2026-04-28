package MiJuego;

public class Especie {
	private String Nombre;
	
	public Especie() {
		this.Nombre="";
	}
	
	public Especie (String Nombre) {
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
	
	public enum Especies {
	    Animal,
	    Mágico,
	    Espectro,
	    Estatua,
	    Marino,
	    Chupasangre,
	    Robot,
	    Extraterrestre,
	    Kaiju,
	    Dinosaurio,
	    Yokai,
	    Monstruo,
	    Dracónido;
	}

}
