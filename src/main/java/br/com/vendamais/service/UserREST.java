package br.com.vendamais.service;

import io.swagger.annotations.Api;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.demoiselle.jee.core.api.crud.Result;
import org.demoiselle.jee.crud.AbstractREST;
import org.demoiselle.jee.security.annotation.Authenticated;

import br.com.vendamais.entity.User;

@Api("v1/Users")
@Path("v1/users")
@Authenticated
public class UserREST extends AbstractREST<User, String> {
    
    @GET
    @Override
    @Transactional
    public Result find() {
        return bc.find();
    }

}
