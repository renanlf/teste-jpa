import br.ufrpe.uag.web.testejpa.dao.PessoaDAO;
import br.ufrpe.uag.web.testejpa.model.Pessoa;
import br.ufrpe.uag.web.testejpa.util.HibernateUtil;

public class Teste {
	
	public static void main(String[] args) {		
		Pessoa pessoa = new Pessoa("Renan Leandro Fernandes", "99999999999", "123456");
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa);
		
		HibernateUtil.getSessionFactory().close();
		
		
	}

}