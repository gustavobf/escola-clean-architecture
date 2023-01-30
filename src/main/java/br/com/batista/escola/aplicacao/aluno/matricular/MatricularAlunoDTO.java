package br.com.batista.escola.aplicacao.aluno.matricular;

import br.com.batista.escola.dominio.aluno.Aluno;
import br.com.batista.escola.dominio.aluno.CPF;
import br.com.batista.escola.dominio.aluno.Email;

public class MatricularAlunoDTO {

	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;

	public MatricularAlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) {
		super();
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}

	public Aluno criarAluno() {
		return new Aluno( //
				new CPF(cpfAluno), //
				nomeAluno, //
				new Email(emailAluno));
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public String getCpfAluno() {
		return cpfAluno;
	}

	public String getEmailAluno() {
		return emailAluno;
	}

}
