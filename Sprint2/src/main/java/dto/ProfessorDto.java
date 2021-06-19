package dto;


import model.Professor;

public class ProfessorDto {
	
	private String nome;
	private String sexo;
	private String registro;
	
	
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
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	public Professor toProfessor() {
		Professor professor = new Professor();
		professor.setNome(nome);
		professor.setSexo(sexo);
		professor.setRegistro(registro);
		return professor;
		
	}
	
}
