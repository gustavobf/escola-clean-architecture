package br.com.batista.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.batista.escola.dominio.aluno.Aluno;
import br.com.batista.escola.dominio.aluno.CPF;
import br.com.batista.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorio);

		MatricularAlunoDTO dados = new MatricularAlunoDTO("Fulano", "123.456.789-00", "foo.bar@gmail.com");
		useCase.executa(dados);

		Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));

		assertEquals(dados.getNomeAluno(), encontrado.getNome());
		assertEquals(dados.getCpfAluno(), encontrado.getCpf());
		assertEquals(dados.getEmailAluno(), encontrado.getEmail());

	}

}
