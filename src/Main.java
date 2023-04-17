public class Main {
    public static void main(String[] args){
        var NovoBanco = new Bank();
        NovoBanco.nome = "Itaú Paulista";


        var NovaConta = new Account();
        NovaConta.setNumero("0001");
        NovaConta.setSaldo(0.0);
    }



}