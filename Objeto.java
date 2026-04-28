package MiJuego;

import java.util.List;

public class Objeto {
	private String Nombre;
	private String Descripción;
	private String tipoEfecto;
	private int valorEfecto;
	
	public Objeto () {
		this.Nombre="";
		this.Descripción="";
		this.tipoEfecto="";
		this.valorEfecto=0;
	}
	
	public Objeto (String Nombre, String Descripción, String tipoEfecto, int valorEfecto) {
		this.Nombre=Nombre;
		this.Descripción=Descripción;
		this.tipoEfecto=tipoEfecto;
		this.valorEfecto=valorEfecto;
	}
	
	public void setNombre (String Nombre) {
		this.Nombre=Nombre;
	}
	
	public String getNombre() {
		return this.Nombre;
	}
	
	public void setDescripción (String Descripción) {
		this.Descripción=Descripción;
	}
	
	public String getDescripción() {
		return this.Descripción;
	}
	
	public void settipoEfecto (String tipoEfecto) {
		this.tipoEfecto=tipoEfecto;
	}
	
	public String gettipoEfecto() {
		return this.tipoEfecto;
	}
	
	public void setvalorEfecto (int valorEfecto) {
		this.valorEfecto=valorEfecto;
	}
	
	public int getvalorEfecto() {
		return this.valorEfecto;
	}
	
	public String toString() {
        return this.Nombre + ": " + Descripción + " (Tipo efecto: " + this.tipoEfecto + ", Valor: " + this.valorEfecto + ")";
    }

}
