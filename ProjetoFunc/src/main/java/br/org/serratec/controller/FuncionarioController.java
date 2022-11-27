package br.org.serratec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.service.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    
    @Autowired
    public FuncionarioService funcionarioService;

}
