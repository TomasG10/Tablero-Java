import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

public class Tablero {
    
    private ArrayList<Ficha> lista_jugadores;

    private int casillas;

    public Tablero(){

        lista_jugadores = new ArrayList<Ficha>();

        Ficha jug1 = new Ficha("azul");

        Ficha jug2 = new Ficha("verde");

        Ficha jug3 = new Ficha("rojo");

        lista_jugadores.add(jug1);
        lista_jugadores.add(jug2);
        lista_jugadores.add(jug3);

        casillas = 18;

    }

    public void juego(){

        boolean victoria = false;

        while (!victoria){

            for (int i = 0; i < lista_jugadores.size(); i++){

                lista_jugadores.get(i).avanzar();

                if (lista_jugadores.get(i).getPosicion() >= casillas){
                    System.out.println("El jugador " + lista_jugadores.get(i).getColor()+ " ganó");
                    victoria = true;
                    break;
                }
            }
        }
    }
}
