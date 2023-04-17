public class Account {
    private String numero;
    private double saldo;


    public Account(String numero, double saldo) {
        this.numero = numero;
        if (this.saldo + saldo < 0) {
            System.out.println("Saldo inicial errado.");
            this.saldo = this.saldo;

        } else
            this.saldo = saldo;
    }
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
        validarSaldo(saldo);
    }

    private void validarSaldo(double saldo){
        if (this.saldo + saldo < 0) {
        System.out.println("Saldo insuficiente.");
        this.saldo = this.saldo;
    } else
            this.saldo = saldo;
}
}
