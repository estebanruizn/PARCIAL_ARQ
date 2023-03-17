public class Lineas {

    private int llamadasLocales;
    private int llamadasLargaDistancia;
    private int llamadasCelulares;


    public Lineas() {
    }

    public Lineas(int llamadasLocales, int llamadasLargaDistancia, int llamadasCelulares) {
        this.llamadasLocales = llamadasLocales;
        this.llamadasLargaDistancia = llamadasLargaDistancia;
        this.llamadasCelulares = llamadasCelulares;
    }

    public int getLlamadasLocales() {
        return llamadasLocales;
    }

    public void setLlamadasLocales(int llamadasLocales) {
        this.llamadasLocales = llamadasLocales;
    }

    public int getLlamadasLargaDistancia() {
        return llamadasLargaDistancia;
    }

    public void setLlamadasLargaDistancia(int llamadasLargaDistancia) {
        this.llamadasLargaDistancia = llamadasLargaDistancia;
    }

    public int getLlamadasCelulares() {
        return llamadasCelulares;
    }

    public void setLlamadasCelulares(int llamadasCelulares) {
        this.llamadasCelulares = llamadasCelulares;
    }

    @Override
    public String toString() {
        return "Lineas{" +
                "llamadasLocales=" + llamadasLocales +
                ", llamadasLargaDistancia=" + llamadasLargaDistancia +
                ", llamadasCelulares=" + llamadasCelulares +
                '}';
    }

    public void mostrarDetalle() {
        System.out.println("Llamadas Locales: " + llamadasLocales);
        System.out.println("Llamadas Larga Distancia: " + llamadasLargaDistancia);
        System.out.println("Llamadas Celulares: " + llamadasCelulares);
    }

    public void reiniciarValores() {
        llamadasLocales = 0;
        llamadasLargaDistancia = 0;
        llamadasCelulares = 0;
    }
}
