package demo.customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource
public interface CustomerRepository extends MongoRepository<Customer, String> {
    List<Customer> findByFirstName(@Param("firstname") final String firstName);
    List<Customer> findByLastName(final String lastName);
}
