package br.unincor.control;

import java.util.ArrayList;
import java.util.List;
import br.unincor.dao.GenericDAO;
import br.unincor.model.Aluno;

public class Main {	

	public static void main(String[] args) throws Exception {
		
		GenericDAO gd = new GenericDAO();		
		List<Aluno> alunos = new ArrayList<Aluno>();

		gd.updateAluno("Valentina", "000.000.000-01");
		
		alunos = gd.selectAllAlunos("SELECT * FROM aluno");
		
		for(int i = 0; i < alunos.size(); i++){
			System.out.println(alunos.get(i).toString());
		}
		
	}	
}


