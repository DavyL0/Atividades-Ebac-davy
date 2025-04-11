package dao;

import dao.generic.GenericDAO;
import domain.Aluno;
import jakarta.persistence.TypedQuery;

import java.util.List;

/**
 * Project: projeto5-crudfly
 * Package: dao
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 10/04/2025
 * Time: 09:10
 * <p>
 */
public class AlunoDAO extends GenericDAO<Aluno, Long> implements IAlunoDAO{

    public AlunoDAO() {
        super(Aluno.class);
    }
    @Override
    public List<Aluno> filtrarAlunos(String query) {
        TypedQuery<Aluno> tpQuery =
                this.em.createNamedQuery("Aluno.findByNome", this.persistentClass);
        tpQuery.setParameter("nome", "%" + query + "%");
        return tpQuery.getResultList();
    }
}
