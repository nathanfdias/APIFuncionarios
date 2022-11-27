package br.org.serratec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository <Funcionario, Long> {
    List<Funcionario> findByNome(String nome);

    Funcionario findByLogin(String email);
}
