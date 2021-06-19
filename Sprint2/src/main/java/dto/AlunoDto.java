package dto;

import java.time.LocalDate;

import model.Aluno;

public class AlunoDto {
	
	private String nome;
	private String sexo;
	private String matricula;
	private LocalDate dataNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Aluno toAluno() {
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setSexo(sexo);
		aluno.setMatricula(matricula);
		aluno.setDataNascimento(dataNascimento);
		return aluno;
		
	}
}
