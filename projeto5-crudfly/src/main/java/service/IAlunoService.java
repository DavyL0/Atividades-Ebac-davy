package service;

import dao.generic.IGenericDAO;
import domain.Aluno;

import java.util.List;

/**
 * Project: projeto5-crudfly
 * Package: service
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 11/04/2025
 * Time: 14:11
 * <p>
 */
public interface IAlunoService extends IGenericDAO<Aluno, Long> {

    Aluno findByNome(String nome);

    List<Aluno> filtrarAluno(String nome);
}
