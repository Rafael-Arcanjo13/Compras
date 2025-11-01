public class Compra implements Comparable<Compra> {
    private String compra;
    private int valorDaCompra;

    public Compra(String compra, int valorDaCompra) {
        this.compra = compra;
        this.valorDaCompra = valorDaCompra;
    }

    public int getValorDaCompra() {
        return valorDaCompra;
    }

    @Override
    public String toString() {
        return this.compra + " - " + this.valorDaCompra;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Integer.compare(this.valorDaCompra, outraCompra.valorDaCompra);
    }
}
