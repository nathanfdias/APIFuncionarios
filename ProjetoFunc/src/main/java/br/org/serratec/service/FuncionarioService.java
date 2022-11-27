package br.org.serratec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.exceptions.FuncNotFoundException;
import br.org.serratec.model.Funcionario;
import br.org.serratec.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
    
    @Autowired
    public FuncionarioRepository funcionarioRepository;

    public List<Funcionario> findAll(){
        return funcionarioRepository.findAll();
    }
    
    public Funcionario findById(Long id){
        final Optional <Funcionario> funcionario = funcionarioRepository.findById(id);
        return funcionario.orElseThrow(() -> new FuncNotFoundException(id));
    }
    
    public List<Funcionario> findByNome(String nome){
        return funcionarioRepository.findByNome(nome);
    }

    public Funcionario insert(Funcionario funcionario){
        Funcionario funcionarios = funcionarioRepository.save(funcionario);
        return funcionarios;
    }

    public Funcionario update(Long id ,Funcionario funcionario){
        funcionario.setId(id);
        return funcionarioRepository.save(funcionario);
    }

    public String emailApp(String email, String senha){
        Funcionario funcionario = funcionarioRepository.findByEmail(email);

        if(funcionarioRepository.findByEmail(email) != null){
            if(funcionario.getSenha().equals(senha)){
                return "Logado com Sucesso";
            } else {
                return "Login e/ou senha inválidos.";
            }
        } else {
            return "Login e/ou senha inválidos.";
        }
    }
}
