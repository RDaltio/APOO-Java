//Rafael Duarte Daltio - 2266539

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerPessoa{

	private Atleta pes = new Atleta();
	private List<Atleta> bdPes = new ArrayList<Atleta>();

	public List<Atleta> getBdPes(){
            return bdPes;
        }

	public Atleta cadPes(Atleta pes){

		if(consPesCod(pes) == null){
			bdPes.add(pes);
			return pes;
		}
		else{
			return null;
		}
		
	}// fim do cadPes
	
	public Atleta consPesCod(Atleta pes){
		for(int i = 0; i < bdPes.size(); i++){
			if(pes.getCod() == bdPes.get(i).getCod()){
				return bdPes.get(i);	
			} 
		}

		return null;	
	}//fim consPesCod

	public Atleta removePesCod(Atleta pes){
		pes = consPesCod(pes);
                if(pes != null){
                    bdPes.remove(pes);
                }
		return pes;
	}//fim removePesCod

	public Atleta atualizaPesCod(Atleta pes){
		for(int i = 0; i < bdPes.size(); i++){
			if(pes.getCod() == bdPes.get(i).getCod()){
                                pes.setNome(JOptionPane.showInputDialog(null, "Digite o NOVO nome", "Atualização",0));
				pes.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a NOVA idade", "Atualização",0)));
				pes.setNacionalidade(JOptionPane.showInputDialog(null, "Digite a NOVA nacionalidade", "Atualização",0));
				pes.setPosicao(JOptionPane.showInputDialog(null, "Digite a NOVA posição", "Atualização",0));
				pes.setNum(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o NOVO número", "Atualização",0)));
				pes.setTime(JOptionPane.showInputDialog(null, "Digite o NOVO time", "Atualização",0));
				pes.setPedominante(JOptionPane.showInputDialog(null, "Digite o NOVO pé dominante", "Atualização",0));
				bdPes.set(i, pes);
                                return pes;
			}
		}
                return null;
	}

}//fim da classe