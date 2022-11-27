package br.org.serratec.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.model.Funcionario;
import br.org.serratec.service.FuncionarioService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    
    @Autowired
    public FuncionarioService funcionarioService;

    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<Funcionario>> findByNome(@PathVariable String nome){
        HttpHeaders headers = new HttpHeaders();

        return new ResponseEntity<>(funcionarioService.findByNome(nome), headers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable Long id){
        HttpHeaders headers = new HttpHeaders();

		return new ResponseEntity<>(funcionarioService.findById(id), headers, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Funcionario>> findAll(){
        return ResponseEntity.ok(funcionarioService.findAll());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Funcionario> insert(@Valid @RequestBody Funcionario funcionario){
        HttpHeaders headers = new HttpHeaders();
		Funcionario funcionarios = funcionarioService.insert(funcionario);

        if(null != funcionarios){
            return new ResponseEntity<>(funcionarios, headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(funcionarios, headers, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Funcionario update(@PathVariable Long id, @Valid @RequestBody Funcionario funcionario){
        
        return funcionarioService.update(id, funcionario);
    }

    @GetMapping("/login")
    public String login(@Valid @RequestParam String email, @RequestParam String senha){
        return funcionarioService.emailApp(email, senha);
    }
}
