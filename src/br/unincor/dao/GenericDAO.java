package br.unincor.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import br.unincor.connection.DBConnection;
import br.unincor.model.Aluno;

public class GenericDAO {

	private DBConnection dbConnection = new DBConnection();
	private PreparedStatement pStatement;
	
	public void deleteAluno(String nome) {
		String sql = "DELETE FROM aluno WHERE nome = '" + nome + "'";
		
		try {
			dbConnection.openDBConnection();
			PreparedStatement pStatement;
			pStatement = dbConnection.CON.prepareStatement(sql);
			
			pStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateAluno(String nome, String cpf) {
		String sql = "UPDATE aluno SET cpf = '" + cpf +
				"' WHERE nome = '" + nome + "'";
		try {
			dbConnection.openDBConnection();
			PreparedStatement pStatement;
			pStatement = dbConnection.CON.prepareStatement(sql);
			
			pStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertAluno(Aluno p){
		String sql = "INSERT INTO Aluno VALUES("
				+ "default, '"
				+ p.getnome() + "')";
		
		PreparedStatement pStatement;
		
		try {
			dbConnection.openDBConnection();
			pStatement = dbConnection.CON.prepareStatement(sql);
			pStatement.executeUpdate();
			
			dbConnection.closeDBConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Aluno> selectAllAlunos(String sql){
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		try {
			dbConnection.openDBConnection();
			pStatement = dbConnection.CON.prepareStatement(sql);
			ResultSet rs = pStatement.executeQuery();			
			
			while(rs.next()){
				Aluno aluno = new Aluno(
					rs.getInt("matricula"),
				 	rs.getString("nome"),
					rs.getString("cpf")
				);
				
				alunos.add(aluno);
			}
			
			dbConnection.closeDBConnection();
			
		} catch (Exception e){
		
		}
		
		return alunos;
			
	}
}

