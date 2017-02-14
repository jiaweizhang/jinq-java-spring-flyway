package jinq.repository;

import jinq.model.Account;

import java.util.Collection;

/**
 * Created by jiaweizhang on 2/14/2017.
 */

public interface AdditionalAccountQueries {

	Collection<Account> findAccountsWithShortFirstName();

}
