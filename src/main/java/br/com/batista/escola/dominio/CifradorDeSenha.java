package br.com.batista.escola.dominio;

public interface CifradorDeSenha {

	String cifrarSenha(String senha);

	boolean validarSenhaCifrada(String senhaCifrada, String senha);

}
