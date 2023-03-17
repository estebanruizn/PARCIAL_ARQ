public class Linea3 extends Lineas {

    private int numeroDeLlamadas;
    private int duracionTotal;
    private int costoTotal;

    public Linea3() {
    }

    public Linea3(int numeroDeLlamadas, int duracionTotal, int costoTotal) {
        this.numeroDeLlamadas = numeroDeLlamadas;
        this.duracionTotal = duracionTotal;
        this.costoTotal = costoTotal;
    }

    public int getNumeroDeLlamadas() {
        return numeroDeLlamadas;
    }

    public void setNumeroDeLlamadas(int numeroDeLlamadas) {
        this.numeroDeLlamadas = numeroDeLlamadas;
    }

    public int getDuracionTotal() {
        return duracionTotal;
    }

    public void setDuracionTotal(int duracionTotal) {
        this.duracionTotal = duracionTotal;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
        return "Linea3{" +
                "numeroDeLlamadas=" + numeroDeLlamadas +
                ", duracionTotal=" + duracionTotal +
                ", costoTotal=" + costoTotal +
                '}';
    }

    public void registrarLlamadaLocal() {
        int duracion = (int) (Math.random() * 500 + 1);
        System.out.println("La llamada tuvo una duracion de: "+duracion+" segundos");
        numeroDeLlamadas++;
        duracionTotal += duracion;
        costoTotal += duracion * 850.0;
    }
    public void registrarLlamadaLargaDistancia() {
        int duracion = (int) (Math.random() * 500 + 1);
        System.out.println("La llamada tuvo una duracion de: "+duracion+" segundos");
        numeroDeLlamadas++;
        duracionTotal += duracion;
        costoTotal += duracion * 850.0;
    }
    public void registrarLlamadaCelular() {
        int duracion = (int) (Math.random() * 500 + 1);
        System.out.println("La llamada tuvo una duracion de: "+duracion+" segundos");
        numeroDeLlamadas++;
        duracionTotal += duracion;
        costoTotal += duracion * 850.0;
    }

}
