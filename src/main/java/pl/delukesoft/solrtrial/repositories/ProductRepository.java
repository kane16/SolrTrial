package pl.delukesoft.solrtrial.repositories;

import org.springframework.data.solr.repository.SolrCrudRepository;
import pl.delukesoft.solrtrial.models.Product;

import java.util.List;

public interface ProductRepository extends SolrCrudRepository<Product, String> {

    public List<Product> findByName(String name);

}
