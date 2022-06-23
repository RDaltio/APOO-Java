//Rafael Duarte Daltio - 2266539
public class Sala{
    private int snome = 0;	
    private int capacidade = 0;
    private String presenca = "";
    private String endereco = "";
    
    public Sala(){
        this.snome = 0;
        this.capacidade = 0;
        this.presenca = "";
        this.endereco = "";
    }
    
     public Sala(int snome, int capacidade, String presenca, String endereco){
        this.capacidade = 0;
        this.snome = 0;
        this.presenca = "";
        this.endereco = "";
    }

    public int getSnome() {
        return snome;
    }

    public void setSnome(int snome) {
        this.snome = snome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public String getPresenca() {
        return presenca;
    }

    public void setPresenca(String presenca) {
        this.presenca = presenca;
    }
    
     public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
