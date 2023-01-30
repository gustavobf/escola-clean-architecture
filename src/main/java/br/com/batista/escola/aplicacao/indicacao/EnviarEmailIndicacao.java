package br.com.batista.escola.aplicacao.indicacao;

import br.com.batista.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

	void enviarPara(Aluno indicado);
	
}
