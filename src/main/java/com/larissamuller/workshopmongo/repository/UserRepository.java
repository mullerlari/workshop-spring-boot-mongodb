package src.main.java.com.larissamuller.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.larissamuller.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
