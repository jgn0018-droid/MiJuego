package MiJuego;

public class Movimientos {
	private String nombre;
    private Tipo tipo;
    private int poder;
    private int precision;
    private int costeMana;

    public Movimientos(String nombre, Tipo tipo, int poder, int precision, int costeMana) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.poder = poder;
        this.precision = precision;
        this.costeMana=costeMana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }
    
    public int getcosteMana() {
        return costeMana;
    }

    public void setcosteMana(int costeMana) {
        this.costeMana = costeMana;
    }

    // Método ejemplo para calcular daño
    public int calcularDaño(Bestia atacante, Bestia objetivo) {
        // fórmula simple: poder + diferencia de ataque/defensa
        int daño = this.poder + (atacante.getAtaque() - objetivo.getDefensa());
        if(daño < 0) daño = 0;
        return daño;
    }

    @Override
    public String toString() {
        return this.nombre + " (" + (tipo != null ? tipo : "Neutral") + ")" + "\n Poder: " + this.poder + "\n Precisión: " + this.precision + "\n Maná: " + this.costeMana + "\n";
    }
}


