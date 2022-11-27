package br.org.serratec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "funcionario")
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "func_cd_id")
    private Long id;

    @Column(name = "func_tx_nome")
    private String nome;

    @Column(name = "func_tx_email")
    private String email;

    @Column(name = "func_tx_senha")
    private String senha;

    @Column(name = "func_tx_cpf")
    private String cpf;

    @Column(name = "func_tx_apelido")
    private String apelido;

    @ManyToOne
    @JoinColumn(name = "fk_tim_cd_id", referencedColumnName = "tim_cd_id")
    private Time time;
}
