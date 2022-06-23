//Rafael Duarte Daltio - 2266539
public class Matricula extends Aluno{
    private String dinicio = "";	
    private String dfim = "";
    
    public Matricula(){
        this.dinicio = "";
        this.dfim = "";
    }
    
     public Matricula(String dinicio, String dfim){
        this.dinicio = "";
        this.dfim = "";
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
