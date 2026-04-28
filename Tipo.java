package MiJuego;
import java.util.List;
import java.util.ArrayList;

public class Tipo {
	private String Nombre;
	
	public Tipo() {
		this.Nombre="";
	}
	
	public Tipo (String Nombre) {
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
	
	public enum Tipos {
	    FUEGO,
	    AGUA,
	    BOSQUE,
	    MONTAÑA,
	    ELECTRICO,
	    VIENTO,
	    HIELO,
	    ESPECTRO,
	    ARTIFICIAL,
	    MAGIA,
	    SOLAR,
	    LUNAR,
	    Nada;
	}
	
	private static final int N = Tipos.values().length;

    // matriz de multiplicadores (fila = atacante, columna = defensor)
    private static final double[][] MULT = new double[N][N];

    // matriz de strings editable (fila = atacante, columna = defensor)
    private static final String[][] MATRIX = {
        /* FUEGO    AGUA    BOSQUE  MONTAÑA ELECTRICO VIENTO  HIELO   ESPECTRO ARTIFICIAL MAGIA   SOLAR   LUNAR */
        { "1/2",    "2",    "2",    "1/2",   "1",       "1",    "3/2",  "1",      "3/2",      "1",    "1/2",  "1"    }, // FUEGO
        { "2",      "1/2",  "1/2",  "1",     "1",       "1",    "1",    "1",      "1",        "1",    "1",    "1/2"  }, // AGUA
        { "1/2",    "2",    "1/2",  "2",     "1",       "1",    "1/2",  "1",      "1/2",      "1",    "1/2",  "1"    }, // BOSQUE
        { "2",      "1/2",  "1/2",  "1",     "1",       "1",    "1",    "1/2",    "1",        "1",    "1",    "1/2"  }, // MONTAÑA
        { "1",      "2",    "1/2",  "1",     "1/2",     "1",    "1",    "1",      "1/2",      "1",    "1",    "2/3"  }, // ELECTRICO
        { "1",      "1",    "2",    "1/2",   "1/2",     "1",    "1/2",  "1",      "1/2",      "1",    "2",    "2/3"  }, // VIENTO
        { "1/2",    "1/2",  "2",    "1",     "1",       "1",    "1",    "1/2",    "1/2",      "1",    "1",    "1"    }, // HIELO
        { "1/2",    "1/2",  "3/2",  "3/2",   "3/2",     "3/2",  "1/2",  "1/2",    "1/2",      "1/2",  "1",    "1/2"  }, // ESPECTRO  (usas 3/2 donde corresponda)
        { "1/2",    "1/2",  "1/2",  "1/2",   "1/2",     "1/2",  "1/2",  "1/2",    "1/2",      "1/2",  "2",    "3/2"  }, // ARTIFICIAL
        { "1",      "1/2",  "1",    "1",     "1",       "1",    "1",    "1",      "1/2",      "1/2",  "2",    "1"    }, // MAGIA
        { "2",      "1/2",  "2",    "2",     "2",       "1",    "1",    "1",      "1/2",      "1",    "1",    "1"    }, // SOLAR
        { "3/2",    "1/2",  "1/2",  "3/2",   "1/2",     "1/2",  "1/2",  "1/2",    "1/2",      "1/2",  "1",    "1/2"  }  // LUNAR
    };

    static {
        // parse MATRIX a MULT
        if (MATRIX.length != N) throw new RuntimeException("MATRIX debe tener " + N + " filas.");
        for (int i = 0; i < N; i++) {
            if (MATRIX[i].length != N) throw new RuntimeException("Fila " + i + " debe tener " + N + " columnas.");
            for (int j = 0; j < N; j++) {
                MULT[i][j] = parseMultiplier(MATRIX[i][j]);
            }
        }
    }

    private static double parseMultiplier(String s) {
        if (s == null) return 1.0;
        s = s.trim();
        if (s.isEmpty()) return 1.0;
        s = s.replace("x", "").replace("X", "");

        if (s.contains("/")) {
            String[] p = s.split("/");
            try {
                double num = Double.parseDouble(p[0]);
                double den = Double.parseDouble(p[1]);
                return num / den;
            } catch (NumberFormatException ex) {
                return 1.0;
            }
        } else {
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException ex) {
                return 1.0;
            }
        }
    }

    /** multiplicador cuando atacante (fila) ataca a defensor (columna) */
    public static double getMultiplicador(Tipos atacante, Tipos defensor) {
        if (atacante == null || defensor == null) return 1.0;
        int i = atacante.ordinal();
        int j = defensor.ordinal();
        return MULT[i][j];
    }

    // util para depuración
    public static void imprimirMatriz() {
        System.out.print("\t");
        for (Tipos t : Tipos.values()) System.out.print(t + "\t");
        System.out.println();
        for (int i = 0; i < N; i++) {
            System.out.print(Tipos.values()[i] + "\t");
            for (int j = 0; j < N; j++) {
                System.out.print(MULT[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
