package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor {
	
	@Id
	private int inscricao;
	private String nome;
	private String materia;
	
	public int getInscricao() {
		return inscricao;
	}
	public void setInscricao(int inscricao) {
		this.inscricao = inscricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	

}
