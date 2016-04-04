package br.ufrpe.uag.web.testejpa.dao;

public interface DAO<Entity> {
	public void salvar(Entity entity);
	public void deletar(Entity entity);
	public void atualizar(Entity entity);
}
