package pl.delukesoft.solrtrial.controllers;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.delukesoft.solrtrial.models.Image;
import pl.delukesoft.solrtrial.models.Product;
import pl.delukesoft.solrtrial.repositories.ImageRepository;
import pl.delukesoft.solrtrial.repositories.ProductRepository;

import java.util.Collections;
import java.util.List;

@RestController
public class DataController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ImageRepository imageRepository;

    @GetMapping("/getSolrDataSumPage")
    public List<Product> getData(){
        List<Product> products =  productRepository.findByName("nowy");
        products.forEach(product -> product.setImages(imageRepository.findByProductId(product.getId())));
        return products;
    }

    @GetMapping("/putSolrData")
    public boolean setData(){
        Image image = new Image("1", "1", "red");
        Product product = new Product("1", "nowy", 3, Collections.singletonList(image));
        productRepository.save(product);
        return true;
    }

}
