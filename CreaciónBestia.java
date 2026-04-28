package MiJuego;

import MiJuego.Especie.Especies;
import MiJuego.Estado.Estados;
import MiJuego.Rango.Rangos;
import MiJuego.Tipo.Tipos;

public class CreaciónBestia {

	public static void main(String[] args) {
		Bestias B1 =new Bestias(1, "Lobo", Tipos.BOSQUE, Tipos.Nada, Especies.Animal, Rangos.Común, 50, 50, 85, 20, 40, 40, 80, 20, 330, 5, 0, 100, 100, "Sin movimientos", Estados.Nada, "Hombre Lobo", 30, "Furia Nocturna");
		
		B1.mostrarInfo();

	}

}
