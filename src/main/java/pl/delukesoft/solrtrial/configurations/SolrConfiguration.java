package pl.delukesoft.solrtrial.configurations;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.convert.SolrJConverter;

@Configuration
public class SolrConfiguration {

    @Value("${spring.data.solr.host}")
    private String solrHost;

    @Value("${spring.data.solr.core}")
    private String solrCore;

    @Bean
    public SolrTemplate solrTemplate(){
        SolrClient client = new HttpSolrClient.Builder(solrHost).build();
        SolrTemplate solrTemplate = new SolrTemplate(client);
        solrTemplate.setSolrConverter(new SolrJConverter());
        return solrTemplate;
    }

}
