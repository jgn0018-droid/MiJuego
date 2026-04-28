package MiJuego;

import java.util.List;

public class Jugador {
	private String Nombre;
	private List<Bestias> Equipo;
	private List<Objeto> Inventario;
	private int Monedas;
	
	public Jugador () {
		this.Nombre="";
		this.Equipo=null;
		this.Inventario=null;
		this.Monedas=0;
	}
	
	public Jugador (String Nombre, List<Bestias> Equipo, List<Objeto> Inventario, int Monedas) {
		this.Nombre=Nombre;
		this.Equipo=Equipo;
		this.Inventario=Inventario;
		this.Monedas=Monedas;
	}
	
	public void setNombre (String Nombre) {
		this.Nombre=Nombre;
	}
	
	public String getNombre() {
		return this.Nombre;
	}
	
	public void setEquipo (List<Bestias> Equipo) {
		this.Equipo=Equipo;
	}
	
	public List<Bestias> getEquipo() {
		return this.Equipo;
	}
	
	public void setInventario (List<Objeto> Inventario) {
		this.Inventario=Inventario;
	}
	
	public List<Objeto> getInventario() {
		return this.Inventario;
	}
	
	public void setMonedas (int Monedas) {
		this.Monedas=Monedas;
	}
	
	public int getMonedas() {
		return this.Monedas;
	}
	
	 public void agregarBestia(Bestias b) {
	        if(Equipo.size() < 6) { // límite tipo Pokémon
	            Equipo.add(b);
	            System.out.println(b.getNombre() + " se ha unido a tu equipo!");
	        } else {
	            System.out.println("El equipo está lleno, no puedes agregar más bestias.");
	        }
	    }

	    // Añadir objeto al inventario
	    public void agregarObjeto(Objeto objeto) {
	        Inventario.add(objeto);
	        System.out.println(objeto + " agregado al inventario.");
	    }

	    // Usar objeto (ejemplo simple)
	    public void usarObjeto(Objeto obj, Bestias b) {
	        if(!Inventario.contains(obj)) {
	            System.out.println("No tienes " + obj.getNombre() + " en tu inventario.");
	            return;
	        }

	        switch(obj.gettipoEfecto()) {
	            case "vida":
	                b.curarVida(obj.getvalorEfecto());
	                System.out.println(b.getNombre() + " ha recuperado " + obj.getvalorEfecto() + " de vida!");
	                break;
	            case "mana":
	                b.setMana(b.getMana() + obj.getvalorEfecto());
	                System.out.println(b.getNombre() + " ha recuperado " + obj.getvalorEfecto() + " de maná!");
	                break;
	            // aquí puedes añadir más tipos, como "ataque", "defensa", etc.
	            default:
	                System.out.println("El objeto no tiene efecto conocido.");
	        }

	        Inventario.remove(obj); // se consume
	    }


	    // Mostrar equipo
	    public void mostrarEquipo() {
	        System.out.println("Equipo de " + Nombre + ":");
	        for(Bestias b : Equipo) {
	            System.out.println("- " + b.getNombre() + " (Nivel " + b.getNivel() + ")");
	        }
	    }

}
