package service;

import dao.IAlunoDAO;
import dao.generic.IGenericDAO;
import domain.Aluno;
import services.generic.GenericService;

import java.util.List;

/**
 * Project: projeto5-crudfly
 * Package: service
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 11/04/2025
 * Time: 14:04
 * <p>
 */
public class AlunoService extends GenericService<Aluno, Long> implements IAlunoService {

    private IAlunoDAO alunoDAO;

    public AlunoService(IAlunoDAO alunoDAO) {
        super(alunoDAO);
        this.alunoDAO = alunoDAO;
    }

    @Override
    public Aluno findByNome(String nome) {
        return null;
    }

    @Override
    public List<Aluno> filtrarAluno(String nome) {
        return List.of();
    }
}
