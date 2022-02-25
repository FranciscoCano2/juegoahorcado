package guia6_ejercicioextra6.Service;

import guia6_ejercicioextra6.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author franc
 *
 **/

public class juego {

    public void juego() {

        AhorcadoService gameseService = new AhorcadoService();
        Ahorcado game = gameseService.CrearJuego();
        Scanner leer = new Scanner(System.in);

        String buscaletra;

        do {

            gameseService.longitud(game.getTamaño());

            System.out.println("Ingrese una letra");
            buscaletra = leer.next();

            System.out.println("Se encontraron " + gameseService.BuscarEncontrar(game, buscaletra) + " letras");
            System.out.println("Letras encontradas: " + game.getLetrasencoontradas() + " Letras Faltantes: " + (game.getTamaño() - game.getLetrasencoontradas()));

        } while (game.getVidas() > 0 && (game.getTamaño() != game.getLetrasencoontradas()) );

        if (game.getVidas() == 0) {
            System.out.println("Perdiste");
        } else {
            System.out.println("Ganaste");
        }
    }

}
