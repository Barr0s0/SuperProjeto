package projetopoo;

public class Pagamento {
    private double valorPago;
    private double troco;

    public Pagamento(double valorPago) {
        this.valorPago = valorPago;
    }

    public double calcularTroco(double valorTotal) {
        troco = valorPago - valorTotal;
        return troco;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getTroco() {
        return troco;
    }
}

