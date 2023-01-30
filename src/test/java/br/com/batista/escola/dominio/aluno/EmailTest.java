package br.com.batista.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.batista.escola.dominio.aluno.Email;

class EmailTest {

	@Test
	public void naoDeveCriarEmailInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
		assertThrows(IllegalArgumentException.class, () -> new Email("emailInvalido"));
	}

}
