package pl.delukesoft.solrtrial.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SolrDocument(collection = "Products")
public class Image {

    @Id
    @Field
    private String id;

    @Field
    private String productId;

    @Field
    private String color;

}
