package br.ufrpe.uag.web.testejpa.dao;

import org.hibernate.Session;

import br.ufrpe.uag.web.testejpa.util.HibernateUtil;

public abstract class AbstractDAO<Entity> implements DAO<Entity> {

	@Override
	public void salvar(Entity entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void deletar(Entity entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.delete(entity);
		session.getTransaction().commit();
		session.close();		
	}

	@Override
	public void atualizar(Entity entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.update(entity);
		session.getTransaction().commit();
		session.close();
	}
	
}
