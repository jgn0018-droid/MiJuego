package MiJuego;

public class Combate {
	public static void iniciarCombate(Bestia b1, Bestia b2) {
        System.out.println("¡Comienza el combate entre " + b1.getNombre() + " y " + b2.getNombre() + "!");

        while(b1.getVida() > 0 && b2.getVida() > 0) {
            // Determinar quién ataca primero según velocidad
            Bestia atacante, defensor;
            if(b1.getVelocidad() >= b2.getVelocidad()) {
                atacante = b1;
                defensor = b2;
            } else {
                atacante = b2;
                defensor = b1;
            }

            // Ataque del primero
            Movimiento movAtacante = atacante.getMovimientos().get(0); // ejemplo: primer movimiento
            atacante.usarMovimiento(defensor, movAtacante);

            if(defensor.getVida() <= 0) {
                System.out.println(defensor.getNombre() + " ha sido derrotado!");
                break;
            }

            // Ataque del segundo
            Movimiento movDefensor = defensor.getMovimientos().get(0); // ejemplo: primer movimiento
            defensor.usarMovimiento(atacante, movDefensor);

            if(atacante.getVida() <= 0) {
                System.out.println(atacante.getNombre() + " ha sido derrotado!");
                break;
            }
        }

        System.out.println("¡Combate finalizado!");
    }
}


