public class Account {
    private String numero;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (this.saldo + saldo < 0) {
            System.out.println("Saldo insuficiente.");
            this.saldo = this.saldo;
        }
        this.saldo = saldo;
    }

}
