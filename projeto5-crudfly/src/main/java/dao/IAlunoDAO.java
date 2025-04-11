package dao;

import dao.generic.IGenericDAO;
import domain.Aluno;

import java.util.List;

/**
 * Project: projeto5-crudfly
 * Package: dao
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 10/04/2025
 * Time: 09:11
 * <p>
 */
public interface IAlunoDAO extends IGenericDAO<Aluno, Long> {

    List<Aluno> filtrarAlunos(String query);
}
