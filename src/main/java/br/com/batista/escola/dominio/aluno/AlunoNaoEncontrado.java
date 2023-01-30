package br.com.batista.escola.dominio.aluno;

public class AlunoNaoEncontrado extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AlunoNaoEncontrado(CPF cpf) {
		super("Aluno n�o encontrado com CPF: " + cpf.getNumero());
	}

}
