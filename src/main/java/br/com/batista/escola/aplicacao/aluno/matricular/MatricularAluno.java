package br.com.batista.escola.aplicacao.aluno.matricular;

import br.com.batista.escola.dominio.aluno.Aluno;
import br.com.batista.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

	private final RepositorioDeAlunos repositorio;

	public MatricularAluno(RepositorioDeAlunos repositorio) {
		this.repositorio = repositorio;
	}

	public void executa(MatricularAlunoDTO dto) {
		Aluno alunoNovo = dto.criarAluno();
		repositorio.matricular(alunoNovo);
	}

}
