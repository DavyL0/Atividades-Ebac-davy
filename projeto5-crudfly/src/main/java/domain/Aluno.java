package domain;

import jakarta.persistence.*;

/**
 * Project: projeto5-crudfly
 * Package: domain
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 09/04/2025
 * Time: 20:11
 * <p>
 */
@Entity
@Table(name = "TB_ALUNO")
public class Aluno implements Persistente {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="aluno_seq")
    @SequenceGenerator(name="aluno_seq", sequenceName="sq_aluno", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NOME", nullable = false, length = 50)
    private String nome;

    @Column(name = "CPF", nullable = false, length = 11)
    private String cpf;

    @Column(name = "TELE", length = 50)
    private String telefone;

    @Column(name = "DAT_NASC", length = 50)
    private String dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
