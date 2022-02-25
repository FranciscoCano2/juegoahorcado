package guia6_ejercicioextra6.Service;

import guia6_ejercicioextra6.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author franc
 *
 *
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in);

    public Ahorcado CrearJuego() {

        Ahorcado juego = new Ahorcado();
        String palabra;

        System.out.println("Ingrese una palabra");
        palabra = leer.next();

        juego.setTamaño(palabra.length());
        juego.setAbuscar(new String[juego.getTamaño()]);

        for (int i = 0; i < juego.getTamaño(); i++) {
            juego.getAbuscar()[i] = palabra.substring(i, i + 1);
        }

        System.out.println("Ingrese Cantidad de Vidas Maximas");
        juego.setVidas(leer.nextInt());

        juego.setLetrasencoontradas(0);

        return juego;
    }

    public void longitud(int longitud) {
        System.out.println("La palabra tiene " + longitud + " letras");

        for (int i = 0; i < longitud; i++) {
            System.out.print(" _ ");
        }
        System.out.println("");
    }

    public int BuscarEncontrar(Ahorcado juego, String busca) {
        int letras = 0;

        for (int i = 0; i < juego.getTamaño(); i++) {
            if (juego.getAbuscar()[i].equals(busca)) {
                letras++;
                juego.setLetrasencoontradas(letras + juego.getLetrasencoontradas());
            }
        }

        juego.setVidas(Intentos(juego.getVidas(), letras));

        return letras;
    }

    public int Intentos(int vidas, int letras) {

        if (letras == 0) {
            return vidas - 1;
        } else {
            return vidas;
        }
    }
}
