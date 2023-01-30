package br.com.batista.escola;

import br.com.batista.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.batista.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import br.com.batista.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {

	public static void main(String[] args) {
		String nome = "Teste da Silva";
		String cpf = "123.456.789-00";
		String email = "teste@email.com";

		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
		matricular.executa(new MatricularAlunoDTO(nome, cpf, email));

	}

}
