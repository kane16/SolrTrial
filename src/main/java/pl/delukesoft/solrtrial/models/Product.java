package pl.delukesoft.solrtrial.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.ChildDocument;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SolrDocument(collection = "Products")
public class Product {

    @Id
    @Field
    private String id;

    @Field
    private String name;

    @Field
    private int page;

    @Field(child = true)
    private List<Image> images;

}
