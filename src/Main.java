public class Main {
    public static void main(String[] args){
        var NovoBanco = new Bank();
        var NovoEmail = new Email();



        var NovaConta = new Account("0001",-50.0);


        System.out.println(NovaConta.getSaldo());
    }



}