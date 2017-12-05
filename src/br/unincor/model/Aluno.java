package br.unincor.model;


public class Aluno {

	private int matricula;
	private String nome;
	private String cpf;
	
	
	public Aluno(int matricula, String nome, String cpf) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
	}


	public int getmatricula() {
		return matricula;
	}


	public void setmatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getnome() {
		return nome;
	}


	public void setnome(String nome) {
		this.nome = nome;
	}


	public String getcpf() {
		return cpf;
	}


	public void setcpf(String cpf) {
		this.cpf = cpf;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	

}
