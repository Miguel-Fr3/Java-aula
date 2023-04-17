public class Email {

    private String Remetente;
   private String Destinatario;
   private String Assunto;
   private String Mensagem;

    public Email(){

    }
    public Email(String remetente, String destinatario, String assunto, String mensagem) {
        Remetente = remetente;
        Destinatario = destinatario;
        Assunto = assunto;
        Mensagem = mensagem;
        ValidarEmail(Remetente);
        ValidarEmail(Destinatario);
    }

    public Email(String remetente, String destinatario) {
        Remetente = remetente;
        Destinatario = destinatario;
        ValidarEmail(Remetente);
        ValidarEmail(Destinatario);
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String destinatario) {
        Destinatario = destinatario;
        ValidarEmail(Destinatario);
    }

    public String getAssunto() {
        return Assunto;
    }

    public void setAssunto(String assunto) {
        Assunto = assunto;
    }

    public String getMensagem() {
        return Mensagem;
    }

    public void setMensagem(String mensagem) {
        Mensagem = mensagem;
    }

    public String getRemetente() {
        return Remetente;
    }

    public void setRemetente(String remetente) {
        Remetente = remetente;
        ValidarEmail(Remetente);
    }
    private void ValidarEmail(String Email) {
        if (!Email.contains("@")) ;
        System.out.println("Email invalido!");
    }
}

