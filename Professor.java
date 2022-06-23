//Rafael Duarte Daltio - 2266539
public class Professor extends Pessoa{
    private String disciplina = "";	
    private int siape = 0;
    
    public Professor(){
        this.disciplina = "";
        this.siape = 0;
    }
    
     public Professor(String disciplina, int siape){
        this.siape = 0;
        this.disciplina = "";
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }
}
