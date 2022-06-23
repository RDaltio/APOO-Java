//Rafael Duarte Daltio - 2266539

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerAluno{

	private Aluno alu = new Aluno();
	private List<Aluno> bdAlu = new ArrayList<Aluno>();

	public List<Aluno> getBdAlu(){
            return bdAlu;
        }

	public Aluno cadAlu(Aluno alu){

		if(consAluCpf(alu) == null){
			bdAlu.add(alu);
			return alu;
		}
		else{
			return null;
		}
		
	}// fim do cadAlu
	
	public Aluno consAluCpf(Aluno alu){
		for(int i = 0; i < bdAlu.size(); i++){
			if(alu.getCpf() == bdAlu.get(i).getCpf()){
				return bdAlu.get(i);	
			} 
		}

		return null;	
	}//fim consAluCpf

}//fim da classe