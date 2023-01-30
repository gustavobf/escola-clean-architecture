package br.com.batista.escola.infra.aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.batista.escola.dominio.aluno.Aluno;
import br.com.batista.escola.dominio.aluno.CPF;
import br.com.batista.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.batista.escola.dominio.aluno.Telefone;

public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {

	private final Connection conn;

	public RepositorioDeAlunosComJDBC(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public void matricular(Aluno aluno) {
		try {
			String sql = "INSERT INTO ALUNO VALUES(?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, aluno.getCpf());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getEmail());
			ps.execute();

			sql = "INSERT INTO TELEFONE VALUES(?, ?)";
			ps = conn.prepareStatement(sql);

			for (Telefone telefone : aluno.getTelefones()) {
				ps.setString(1, telefone.getDdd());
				ps.setString(2, telefone.getNumero());
				ps.execute();
			}

		} catch (SQLException e) {
			throw new RuntimeException();
		}

	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		// TODO Auto-generated method stub
		return null;
	}

}
