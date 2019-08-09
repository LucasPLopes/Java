package src.model;

public class Convidado {
	private String nome;
	private Integer nroConvidados;
	public Convidado(String nome, Integer nroConvidados) {
		super();
		this.nome = nome;
		this.nroConvidados = nroConvidados;
	}
	public Convidado() {
		nome = "";
		nroConvidados = 0;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNroConvidados() {
		return nroConvidados;
	}
	public void setNroConvidados(Integer nroConvidados) {
		this.nroConvidados = nroConvidados;
	}
	
}
