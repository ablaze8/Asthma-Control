/**
 *
 */
package edu.gatech.epidemics.dao;

import edu.gatech.epidemics.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author atalati
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer>
{

}