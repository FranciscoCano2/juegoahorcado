package guia6_ejercicioextra6;

/**
 *
 * @author franc
 */
public class Ahorcado {

    private int vidas;
    private int tamaño;
    private int letrasencoontradas;
    private String[] abuscar = {};

//constructor
    public Ahorcado() {
    }

    public Ahorcado(int vidas, int tamaño, int letrasencoontradas, String[] abuscar) {
        this.vidas = vidas;
        this.tamaño = tamaño;
        this.letrasencoontradas = letrasencoontradas;
        this.abuscar = abuscar;
    }


//getter
    public int getVidas() {
        return vidas;
    }
    public int getTamaño() {
        return tamaño;
    }
    public int getLetrasencoontradas() {
        return letrasencoontradas;
    }
    public String[] getAbuscar() {
        return abuscar;
    }

//seeter
    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public void setLetrasencoontradas(int letrasencoontradas) {
        this.letrasencoontradas = letrasencoontradas;
    }
    public void setAbuscar(String[] abuscar) {
        this.abuscar = abuscar;
    }
}
