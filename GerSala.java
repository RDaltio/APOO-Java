//Rafael Duarte Daltio - 2266539

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerSala{

	private Sala sal = new Sala();
	private List<Sala> bdSal = new ArrayList<Sala>();

	public List<Sala> getBdSal(){
            return bdSal;
        }

	public Sala cadSal(Sala sal){

		if(consSalSnome(sal) == null){
			bdSal.add(sal);
			return sal;
		}
		else{
			return null;
		}
		
	}// fim do cadAlu
	
	public Sala consSalSnome(Sala sal){
		for(int i = 0; i < bdSal.size(); i++){
			if(sal.getSnome() == bdSal.get(i).getSnome()){
				return bdSal.get(i);	
			} 
		}

		return null;	
	}//fim consAluCpf

}//fim da classe