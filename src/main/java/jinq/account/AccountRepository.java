package jinq.repository;

import jinq.model.Account;
import org.springframework.data.repository.Repository;

import java.util.Collection;

/**
 * Created by jiaweizhang on 2/14/2017.
 */

public interface AccountRepository extends Repository<Account, Long>, AdditionalAccountQueries {

	void save(Account account);

	Collection<Account> findByLastName(String lastName);

	Collection<Account> findAll();
}
