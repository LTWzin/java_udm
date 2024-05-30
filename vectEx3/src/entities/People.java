package entities;

public class People {
	
	private int idade;
	private String nome;
	private double altura;
	
	public People(String nome, int idade, double altura) {
		this.idade = idade;
		this.nome = nome;
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public static double rot(double percentage, int quantia) {
		return (percentage * 100) / quantia;
	}
	
}
