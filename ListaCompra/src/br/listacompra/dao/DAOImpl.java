package br.listacompra.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

public abstract class DAOImpl<T, I extends Serializable> implements DAO<T, I> {

	@PersistenceContext(unitName = "listaCompras")
	EntityManager em;

	@Override
	public T save(T entity) {

		T saved = null;
		saved = em.merge(entity);

		return saved;
	}

	@Override
	public void remove(T entity) {
		em.getTransaction().begin();
		em.remove(entity);
		em.getTransaction().commit();

	}

	@Override
	public T getById(Class<T> classe, I pk) {

		try {
			return em.find(classe, pk);
		} catch (NoResultException e) {
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll(Class<T> classe) {

		return em.createQuery("select o from " + classe.getSimpleName() + " o")
				.getResultList();
	}

}
