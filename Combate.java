package MiJuego;

public class Combate {
	public static void iniciarCombate(Bestia b1, Bestia b2) {
        System.out.println("¡Comienza el combate entre " + b1.getNombre() + " y " + b2.getNombre() + "!");

        while(b1.getVida() > 0 && b2.getVida() > 0) {
            // Determinar quién ataca primero según velocidad
            Bestia atacantes, defensores;
            if(b1.getVelocidad() >= b2.getVelocidad()) {
                atacantes = b1;
                defensores = b2;
            } else {
                atacantes = b2;
                defensores = b1;
            }

            // Ataque del primero
            Movimientos movAtacante = atacantes.getMovimientos().get(0); // ejemplo: primer movimiento
            atacantes.usarMovimiento(defensores, movAtacante);

            if(defensores.getVida() <= 0) {
                System.out.println(defensores.getNombre() + " ha sido derrotado!");
                break;
            }

            // Ataque del segundo
            Movimientos movDefensor = defensores.getMovimientos().get(0); // ejemplo: primer movimiento
            defensores.usarMovimiento(atacantes, movDefensor);

            if(atacantes.getVida() <= 0) {
                System.out.println(atacantes.getNombre() + " ha sido derrotado!");
                break;
            }
        }

        System.out.println("¡Combate finalizado!");
    }
}


