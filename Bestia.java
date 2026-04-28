package MiJuego;
import java.util.List;
import java.util.ArrayList;
public class Bestia {
	private int ID;
	private String Nombre;
	private Tipo Tipo1;
	private Tipo Tipo2;
	private Especie Especie;
	private Rango Rango;
	private int Vida;
	private int VidaMaxima;
	private int Ataque;
	private int AtaqueEspecial;
	private int Defensa;
	private int DefensaEspecial;
	private int Velocidad;
	private int Evasión;
	private int StatsTotales;
	private int Nivel;
	private int Experiencia;
	private int Mana;
	private int costeMana;
	private List<Movimientos> movimientos;
	private Estado estadoActual;
	private Integer evolucionaA;
	private Integer NvEvo;
	private Habilidad Habilidad;

	
	public Bestia () {
		this.ID=0;
		this.Nombre="";
		this.Tipo1=null;
		this.Tipo2=null;
		this.Especie=null;
		this.Rango=null;
		this.Vida=0;
		this.VidaMaxima=0;
		this.Ataque=0;
		this.AtaqueEspecial=0;
		this.Defensa=0;
		this.DefensaEspecial=0;
		this.Velocidad=0;
		this.Evasión=0;
		this.StatsTotales=0;
		this.Nivel=0;
		this.Experiencia=0;
		this.Mana=0;
		this.costeMana=0;
		this.movimientos= new ArrayList <>();
		this.estadoActual=null;
		this.evolucionaA=null;
		this.NvEvo=null;
		this.Habilidad=null;

	}
	
	public Bestia (int ID, String Nombre, Tipo Tipo1, Tipo Tipo2, Especie Especie, Rango Rango,
				   int Vida, int VidaMaxima, int Ataque, int AtaqueEspecial, int Defensa, int DefensaEspecial,
				   int Velocidad, int Evasión, int StatsTotales, int Nivel, int Experiencia, int Mana, int costeMana,
				   List<Movimientos> movimientos, Estado estadoActual, Integer evolucionaA,
				   Integer NvEvo, Habilidad Habilidad) {
		this.ID=ID;
		this.Nombre=Nombre;
		this.Tipo1=Tipo1;
		this.Tipo2=Tipo2;
		this.Especie=Especie;
		this.Rango=Rango;
		this.Vida=Vida;
		this.VidaMaxima=VidaMaxima;
		this.Ataque=Ataque;
		this.AtaqueEspecial=AtaqueEspecial;
		this.Defensa=Defensa;
		this.DefensaEspecial=DefensaEspecial;
		this.Velocidad=Velocidad;
		this.Evasión=Evasión;
		this.StatsTotales=StatsTotales;
		this.Nivel=Nivel;
		this.Experiencia=Experiencia;
		this.Mana=Mana;
		this.costeMana=costeMana;
		this.movimientos=movimientos;
		this.estadoActual=estadoActual;
		this.evolucionaA=evolucionaA;
		this.NvEvo=NvEvo;
		this.Habilidad=Habilidad;

	}
	
	// GETTERS Y SETTERS COMPLETOS

	public void setID(int ID) {
	    this.ID = ID;
	}

	public int getID() {
	    return this.ID;
	}

	public void setNombre(String Nombre) {
	    this.Nombre = Nombre;
	}

	public String getNombre() {
	    return this.Nombre;
	}

	public void setTipo1(Tipo Tipo1) {
	    this.Tipo1 = Tipo1;
	}

	public Tipo getTipo1() {
	    return this.Tipo1;
	}

	public void setTipo2(Tipo Tipo2) {
	    this.Tipo2 = Tipo2;
	}

	public Tipo getTipo2() {
	    return this.Tipo2;
	}

	public void setEspecie(Especie Especie) {
	    this.Especie = Especie;
	}

	public Especie getEspecie() {
	    return this.Especie;
	}

	public void setRango(Rango Rango) {
	    this.Rango = Rango;
	}

	public Rango getRango() {
	    return this.Rango;
	}

	public void setVida(int Vida) {
	    this.Vida = Vida;
	}

	public int getVida() {
	    return this.Vida;
	}
	
	public void setVidaMaxima(int VidaMaxima) {
	    this.VidaMaxima = VidaMaxima;
	}

	public int getVidaMaxima() {
	    return this.VidaMaxima;
	}

	public void setAtaque(int Ataque) {
	    this.Ataque = Ataque;
	}

	public int getAtaque() {
	    return this.Ataque;
	}

	public void setAtaqueEspecial(int AtaqueEspecial) {
	    this.AtaqueEspecial = AtaqueEspecial;
	}

	public int getAtaqueEspecial() {
	    return this.AtaqueEspecial;
	}

	public void setDefensa(int Defensa) {
	    this.Defensa = Defensa;
	}

	public int getDefensa() {
	    return this.Defensa;
	}

	public void setDefensaEspecial(int DefensaEspecial) {
	    this.DefensaEspecial = DefensaEspecial;
	}

	public int getDefensaEspecial() {
	    return this.DefensaEspecial;
	}

	public void setVelocidad(int Velocidad) {
	    this.Velocidad = Velocidad;
	}

	public int getVelocidad() {
	    return this.Velocidad;
	}

	public void setEvasión(int Evasión) {
	    this.Evasión = Evasión;
	}

	public int getEvasión() {
	    return this.Evasión;
	}

	public void setStatsTotales(int StatsTotales) {
	    this.StatsTotales = StatsTotales;
	}

	public int getStatsTotales() {
	    return this.StatsTotales;
	}

	public void setNivel(int Nivel) {
	    this.Nivel = Nivel;
	}

	public int getNivel() {
	    return this.Nivel;
	}

	public void setExperiencia(int Experiencia) {
	    this.Experiencia = Experiencia;
	}

	public int getExperiencia() {
	    return this.Experiencia;
	}
	
	public void setMana(int Mana) {
	    this.Mana = Mana;
	}

	public int getMana() {
	    return this.Mana;
	}
	
	public void setcosteMana(int costeMana) {
	    this.costeMana = costeMana;
	}

	public int getcosteMana() {
	    return this.costeMana;
	}

	public void setMovimientos(List<Movimientos> movimientos) {
	    this.movimientos = movimientos;
	}

	public List<Movimientos> getMovimientos() {
	    return this.movimientos;
	}

	public void setEstadoActual(Estado estadoActual) {
	    this.estadoActual = estadoActual;
	}

	public Estado getEstadoActual() {
	    return this.estadoActual;
	}

	public void setEvolucionaA(Integer evolucionaA) {
	    this.evolucionaA = evolucionaA;
	}

	public Integer getEvolucionaA() {
	    return this.evolucionaA;
	}

	public void setNvEvo(Integer NvEvo) {
	    this.NvEvo = NvEvo;
	}

	public Integer getNvEvo() {
	    return this.NvEvo;
	}

	public void setHabilidad(Habilidad Habilidad) {
	    this.Habilidad = Habilidad;
	}

	public Habilidad getHabilidad() {
	    return this.Habilidad;
	}
	
	public String toString() {
		return "Criatura Nº" + this.ID + "\n Nombre: " + this.Nombre + "\n Primer tipo: " + this.Tipo1 + "\n Segundo tipo: " + this.Tipo2 + "\n Especie: " + this.Especie + "\n Rango: " + this.Rango + "\n Habilidad: " + this.Habilidad + "\n Vida: " + this.Vida + "\n Vida máxima: " + this.VidaMaxima + "\n Ataque: " + this.Ataque + "\n Defensa: " + this.Defensa + "\n Ataque especial: " + this.AtaqueEspecial + "\n Defensa especial: " + this.DefensaEspecial + "\n Velocidad: " + this.Velocidad + "\n Evasión: " + this.Evasión + "\n Estadísticas totales: " + this.StatsTotales + "\n Nivel: " + this.Nivel + "\n Experiencia: " + this.Experiencia + "\n Lista de movimientos: " + this.movimientos + "\n Estado: " + this.estadoActual + "\n Evolución: " + this.evolucionaA + "\n Nivel para evolucionar: " +  this.NvEvo + "\n";
	}
	
	public void mostrarInfo() {
		System.out.println("===============INFORMACIÓN SOBRE " + this.Nombre + "===============");
		System.out.println(this.toString());
		System.out.println("=============================================================");
	}
	
	public void recibirDaño(int Daño) {
		this.Vida-=Daño;
		
		if (this.Vida <0) {
			this.Vida=0;
		}
	}
	
	public void curarVida (int Cura) {
		this.Vida+=Cura;
		
		if (this.Vida > this.VidaMaxima) {
			this.Vida=this.VidaMaxima;
		}
	}
	
	public void SubirNivel () {
		this.Nivel++;
		this.Experiencia=0;
		
		
		int vidaSubida = (int)(Math.random() * 3) + 3;          // +3 a 5
	    int ataqueSubida = (int)(Math.random() * 2) + 1;        // +1 a 2
	    int ataqueEspSubida = (int)(Math.random() * 2) + 1;     // +1 a 2
	    int defensaSubida = (int)(Math.random() * 2) + 1;       // +1 a 2
	    int defensaEspSubida = (int)(Math.random() * 2) + 1;    // +1 a 2
	    int velocidadSubida = (int)(Math.random() * 2) + 1;     // +1 a 2
	    int evasionSubida = (int)(Math.random() * 1) + 0;       // +0 a 1
	    int manaSubida = (int)(Math.random() * 2) + 2;       // +0 a 1

	    // Aplicar aumentos
	    this.VidaMaxima += vidaSubida;
	    this.Vida += vidaSubida; // la vida actual sube también
	    this.Ataque += ataqueSubida;
	    this.AtaqueEspecial += ataqueEspSubida;
	    this.Defensa += defensaSubida;
	    this.DefensaEspecial += defensaEspSubida;
	    this.Velocidad += velocidadSubida;
	    this.Evasión += evasionSubida;
	    this.Mana +=manaSubida;
	    
	    System.out.println("¡" + this.Nombre + " subió de nivel!");
	    
	    if(this.Nivel >= this.NvEvo && this.evolucionaA != null) {
	        evolucionar();
	    }


	}
	
	private int calcularExpNecesaria() {
	    return (int)(Math.pow(this.Nivel, 2) * 10);
	}
	
	public void ganarExperiencia(int exp) {
	    this.Experiencia += exp;

	    // mientras tengas suficiente experiencia, sube de nivel
	    while (this.Experiencia >= calcularExpNecesaria()) {
	        this.Experiencia -= calcularExpNecesaria(); // resta la experiencia usada
	        SubirNivel(); // sube 1 nivel y ajusta stats
	    }
	}
	
	public void evolucionar() {
	    // Comprobamos si hay una evolución definida y si la criatura alcanzó el nivel requerido
	    if(this.evolucionaA != null && this.Nivel >= this.NvEvo) {
	        
	        // Aquí puedes cambiar la especie o el nombre según tu sistema
	        System.out.println(this.Nombre + " está evolucionando!");

	        // Ejemplo: actualizar ID y nombre de la criatura
	        this.ID = this.evolucionaA;  // asumimos que evolucionaA es el ID de la nueva criatura
	        this.Nombre = "NuevoNombre"; // aquí pondrías el nombre real de la evolución

	        // Puedes ajustar stats base de la nueva forma si quieres
	        this.VidaMaxima += 10; // ejemplo, aumenta la vida máxima
	        this.Vida = this.VidaMaxima; // vida actual llena

	        // Limpiar la evolución para que no evolucione otra vez
	        this.evolucionaA = null;
	        this.NvEvo = null;

	        System.out.println(this.Nombre + " ha evolucionado!");
	    }
	}
	
	public void aprenderMovimiento(Movimientos mov) {
	    if(!movimientos.contains(mov)) {
	        movimientos.add(mov);
	        System.out.println(this.Nombre + " aprendió " + mov.getNombre() + "!");
	    } else {
	        System.out.println(this.Nombre + " ya conoce " + mov.getNombre() + ".");
	    }
	}
	
	public void olvidarMovimiento(Movimientos mov) {
	    if(movimientos.contains(mov)) {
	        movimientos.remove(mov);
	        System.out.println(this.Nombre + " olvidó " + mov.getNombre() + ".");
	    } else {
	        System.out.println(this.Nombre + " no conoce " + mov.getNombre() + ".");
	    }
	}
	
	public void usarMovimiento(Bestia objetivo, Movimientos mov) {
	    if(!movimientos.contains(mov)) {
	        System.out.println(this.Nombre + " no conoce " + mov.getNombre() + ".");
	        return;
	    }

	    if(mov.getcosteMana() > this.Mana) {
	        System.out.println(this.Nombre + " no tiene suficiente maná para " + mov.getNombre() + "!");
	        return;
	    }

	    // Restamos maná
	    this.Mana -= mov.getcosteMana();

	    // Calculamos daño y lo aplicamos
	    int daño = mov.calcularDaño(this, objetivo);
	    objetivo.recibirDaño(daño);

	    System.out.println(this.Nombre + " usó " + mov.getNombre() + " y causó " + daño + " de daño a " + objetivo.getNombre() + "!");
	}
	
	public void cambiarEstado(Estado nuevoEstado) {
	    this.estadoActual = nuevoEstado;
	    System.out.println(this.Nombre + " ahora está " + nuevoEstado + "!");
	}
	
	public void resetearEstado() {
	    this.estadoActual = null;
	    System.out.println(this.Nombre + " ya no tiene ningún estado alterado.");
	}
	
	

}
