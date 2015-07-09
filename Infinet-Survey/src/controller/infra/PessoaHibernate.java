package controller.infra;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Order;

import controller.repositorio.Pessoa;

public class PessoaHibernate implements Pessoa {
	
	private Session session;
	
	

	public PessoaHibernate(Session session) {
		super();
		this.session = session;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pessoa> todos() {
		
		return session.createCriteria(Pessoa.class).addOrder(Order.asc("id")).list();
	}

	@Override
	public Pessoa guardar(Pessoa pessoa) {
		
		return (Pessoa) session.merge(pessoa);
	}

	@Override
	public void remover(Pessoa pessoa) {
		this.session.delete(pessoa);

	}

}
