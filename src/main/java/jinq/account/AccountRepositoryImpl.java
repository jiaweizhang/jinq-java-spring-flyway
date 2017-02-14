package jinq.repository;

import jinq.config.JinqSource;
import jinq.model.Account;
import org.jinq.orm.stream.JinqStream;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

/**
 * Created by jiaweizhang on 2/14/2017.
 */

public class AccountRepositoryImpl implements AdditionalAccountQueries {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private JinqSource source;

	public Collection<Account> findAccountsWithShortFirstName() {

		JinqStream<Account> customers = source.users(em);

		return customers.where(c -> c.getFirstName().length() <= 3).toList();
	}
}
