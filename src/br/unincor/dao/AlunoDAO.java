package br.unincor.dao;

import java.util.ArrayList;
import java.util.List;

import br.unincor.connection.DBConnection;
import br.unincor.model.Aluno;

public class AlunoDAO extends GenericDAO {
	
	private Aluno aluno;
	private DBConnection dbConnection;
	
	public AlunoDAO() {
		aluno = null;
		dbConnection = new DBConnection();
	}	

	public void selectAluno() {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		String sql = "SELECT * FROM aluno";
		alunos = super.selectAllAlunos(sql);
		
		System.out.println(alunos.size());		
		
		for (Aluno aluno : alunos) {			
			System.out.println(aluno.getmatricula() + " " +
					aluno.getnome() + " " +
					aluno.getcpf());
		}
		
	}
}

