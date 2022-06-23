//Rafael Duarte Daltio - 2266539
public class Pessoa {
    private int dataN;
    private String nome;
    private String email;
    
    public Pessoa(){
        this.nome = "";
        this.email = "";
        this.dataN = 0;
    }
    
    public Pessoa(int dataN, String nome, int idade){
        this.dataN = dataN;
        this.nome = nome;
        this.email = email;
    }

    public int getDataN() {
        return dataN;
    }

    public void setDataN(int dataN) {
        this.dataN = dataN;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
