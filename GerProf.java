//Rafael Duarte Daltio - 2266539

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerProf{

	private Professor prof = new Professor();
	private List<Professor> bdProf = new ArrayList<Professor>();

	public List<Professor> getBdProf(){
            return bdProf;
        }

	public Professor cadProf(Professor prof){

		if(consProfSiape(prof) == null){
			bdProf.add(prof);
			return prof;
		}
		else{
			return null;
		}
		
	}// fim do cadProf
	
	public Professor consProfSiape(Professor prof){
		for(int i = 0; i < bdProf.size(); i++){
			if(prof.getSiape() == bdProf.get(i).getSiape()){
				return bdProf.get(i);	
			} 
		}

		return null;	
	}//fim consProfSiape

}//fim da classe