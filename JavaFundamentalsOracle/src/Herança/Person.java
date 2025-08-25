package Herança;

import java.util.Date;

public class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	private Date dateOfBirth;

	public Person(String firstName, String middleName, String lastName, Date dateOfBirth) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * Retorna uma String com o nome
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Retorna uma string com o nome do meio
	 * @return middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Retorna uma String com o sobrenome
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Retorna uma string concatenada do nome da Pessoa
	 * @return o primeiro, o do meio e o último nome da Pessoa.
	 */
	public String getName() {
		return firstName + " " + middleName + " " + lastName;
	}

	/**
	 * Retorna a data de nascimento da Pessoa como um tipo de data
	 * @return um tipo de Data da data de nascimento da Pessoa.
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
}
