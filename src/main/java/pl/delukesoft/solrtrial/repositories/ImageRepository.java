package pl.delukesoft.solrtrial.repositories;

import org.springframework.data.solr.repository.SolrCrudRepository;
import pl.delukesoft.solrtrial.models.Image;
import pl.delukesoft.solrtrial.models.Product;

import java.util.List;

public interface ImageRepository extends SolrCrudRepository<Image, String> {

    List<Image> findByColor(String color);

    List<Image> findByProductId(String productId);

}
