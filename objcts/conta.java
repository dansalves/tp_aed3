package objcts;

public class conta {

    /*
     * variaveis padroes da conta
     */
    private int idConta;
    private String login;
    private String senha;
    private String nome;
    private int quantityEmail;
    private String[] email;
    private String CPF;
    private int numTransfsRealizadas;
    private double saldo;
    public int setIDConta; 

    /*
     * gets
     */
    public int getIDConta(){
        return this.idConta;
    }
    public String getEmail(int emailPosition){
        return email[emailPosition];
    }
    public String[] getArrayEmail(){
        return email;
    }
    public String getnome(){
        return nome;
    }
    public String getCPFString(){
        return CPF;
    }
    private String getSenha(){
        return senha;
    }
    public String getLogin(){
        return login;
    }
    public double getSaldo(){
        return saldo;
    }
    public int getTransf(){
        return numTransfsRealizadas;
    }
    public int getQuantityEmail(){
        return quantityEmail;
    }

    /**
     * sets
     */
    public void setIDConta(int idConta){
        this.idConta=idConta;
    }

    public void setNome(String newNome){
        this.nome=newNome;
    }
    public void setEmail(String[] newEmail){          
        this.email=newEmail;
    }

    public void setLogin(String newLogin){          
        this.login=newLogin;     
    }

    public static void setSenha(String newSenha){          
        this.senha=newSenha;     
    }

    /*
    * funcao toString para padronizar exibicao da conta do usuario
    */
    public String toString(){
        return "\nNome Titular: " + nome +
            "\nEmail: " + email +
            "\nCPF: " + CPF +
            "Saldo: " + saldo;      
    }



}
