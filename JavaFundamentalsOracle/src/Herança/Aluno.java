package Herança;

import java.util.Date;

public class Aluno extends Person{

	private int idAluno;
	private double mediaGeral;
	private String curso;
	private Date anoFormatura;
	
	public Aluno(String firstName, String middleName, String lastName, Date dateOfBirth, int idAluno, double mediaGeral,
			String curso, Date anoFormatura) {
		super(firstName, middleName, lastName, dateOfBirth);
		this.idAluno = idAluno;
		this.mediaGeral = mediaGeral;
		this.curso = curso;
		this.anoFormatura = anoFormatura;
	}//constructor

	public String mediaAlfabetica(double[] array) {
		double soma = 0;	
		double media = 0;
		double contador = 0;
		for (int i = 0; i < array.length; i++) {
			soma += array[i];
			contador++;
		}//for
		
		media = soma / contador;
		
		if (media >= 4) {
			return "A";
		} else if (media >= 3.67) {
			return "A-";
		} else if (media >= 3.33) {
			return "B+";
		} else if (media >= 3) {
			return "B";
		} else if (media >= 2.67) {
			return "B-";
		} else if (media >= 2.33) {
			return "C+";
		} else if (media >= 2) {
			return "C";
		} else if (media >= 1) {
			return "D";
		} else {
			return "F";
		}		
		  
	}//mediaTotal	
	
	//getters and setters
	public int getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	public double getMediaGeral() {
		return mediaGeral;
	}
	public void setMediaGeral(double[] array) {
		double soma = 0;	
		double media = 0;
		double contador = 0;
		for (int i = 0; i < array.length; i++) {
			soma += array[i];
			contador++;
		}//for
		
		media = soma / contador;
		this.mediaGeral = media;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Date getAnoFormatura() {
		return anoFormatura;
	}
	public void setAnoFormatura(Date anoFormatura) {
		this.anoFormatura = anoFormatura;
	}
	//getters and setters	
	
}//class
