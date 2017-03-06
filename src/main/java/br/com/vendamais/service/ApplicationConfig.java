package br.com.vendamais.service;

import io.swagger.jaxrs.config.BeanConfig;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class ApplicationConfig extends Application {

    public ApplicationConfig() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setBasePath("/vendamais/api");
        beanConfig.setResourcePackage("br.com.vendamais.service");
        beanConfig.setVersion("1.0.0");
        
        beanConfig.setContact("DSX Consultoria");
        beanConfig.setDescription("Máxime sua vendas.");
        beanConfig.setTitle("Venda Mais");

        beanConfig.setScan(true);
    }
}
