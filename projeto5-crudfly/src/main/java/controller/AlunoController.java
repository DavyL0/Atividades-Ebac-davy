package controller;

import domain.Aluno;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import service.IAlunoService;
import utils.ReplaceUtils;

import java.io.Serializable;
import java.util.Collection;

/**
 * Project: projeto5-crudfly
 * Package: controller
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 11/04/2025
 * Time: 13:49
 * <p>
 */
public class AlunoController implements Serializable {
    private static final long serialVersionUID = 1L;

    private Aluno aluno;

    private Collection<Aluno> alunos;

    private IAlunoService alunoService;

    private Boolean isUpdate;

    private String cpfMask;

    private String telMask;

    public void init() {
        try {
            this.isUpdate = false;
            this.aluno = new Aluno();
            this.aluno = (Aluno) alunoService.buscarTodos();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar listar os clientes"));
        }
    }

    public void cancel() {
        try {
            this.isUpdate = false;
            this.aluno = new Aluno();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar cancelar ação"));
        }

    }

    public void edit(Aluno aluno) {
        try {
            this.isUpdate = true;
            this.aluno = aluno;
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar excluir o cliente"));
        }

    }

    public void delete(Aluno aluno) {
        try {
            alunoService.excluir(aluno);
            alunos.remove(aluno);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar excluir o cliente"));
        }

    }

    public void add() {
        try {
            removerCaracteresInvalidos();
            limparCampos();
            alunoService.cadastrar(aluno);
            this.alunos = alunoService.buscarTodos();
            this.aluno = new Aluno();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar criar o cliente"));
        }


    }

    private void removerCaracteresInvalidos() {
        Long cpf = Long.valueOf(ReplaceUtils.replace(getCpfMask(), ".", "-"));
        this.aluno.setCpf(String.valueOf(cpf));

        Long tel = Long.valueOf(ReplaceUtils.replace(getTelMask(), "(", ")", " ", "-"));
        this.aluno.setTel(tel);
    }

    private void limparCampos() {
        setCpfMask(null);
        setTelMask(null);
    }

    public void update() {
        try {
            removerCaracteresInvalidos();
            alunoService.alterar(this.aluno);
            cancel();
            FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Cliente Atualiado com sucesso"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao tentar atualizar o cliente"));
        }

    }

    public String voltarTelaInicial() {
        return "/index.xhtml";
    }

    public Aluno getAluno() {return aluno;}

    public void setAluno(Aluno aluno) {this.aluno = aluno;}

    public Collection<Aluno> getAlunos() {return alunos;}

    public void setAlunos(Collection<Aluno> alunos) {this.alunos = alunos;}

    public IAlunoService getAlunoService() {return alunoService;}

    public void setAlunoService(IAlunoService alunoService) {this.alunoService = alunoService;}

    public Boolean getUpdate() {return isUpdate;}

    public void setUpdate(Boolean update) {isUpdate = update;}

    public String getCpfMask() {
        return cpfMask;
    }

    public void setCpfMask(String cpfMask) {
        this.cpfMask = cpfMask;
    }

    public String getTelMask() {
        return telMask;
    }

    public void setTelMask(String telMask) {
        this.telMask = telMask;
    }

}
