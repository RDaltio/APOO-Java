//Rafael Duarte Daltio - 2266539
public class Aluno extends Pessoa{
    private String escolaridade = "";	
    private int cpf = 0;
    private String dinicio = "";	
    private String dfim = "";
    
    public Aluno(){
        this.escolaridade = "";
        this.cpf = 0;
        this.dinicio = "";
        this.dfim = "";
    }
    
     public Aluno(String escolaridade, int cpf){
        this.escolaridade = "";
        this.cpf = 0;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public String getDinicio() {
        return dinicio;
    }

    public void setDinicio(String dinicio) {
        this.dinicio = dinicio;
    }
   
    public String getDfim() {
        return dfim;
    }

    public void setDfim(String dfim) {
        this.dfim = dfim;
    }
}

