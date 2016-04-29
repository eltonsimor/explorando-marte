package br.com.elo7.explorando.marte.rest;

import br.com.elo7.explorando.marte.model.SondasModel;
import br.com.elo7.explorando.marte.rest.converter.SondasRQConverter;
import br.com.elo7.explorando.marte.rest.converter.SondasRSConverter;
import br.com.elo7.explorando.marte.rest.request.SondasRQ;
import br.com.elo7.explorando.marte.rest.response.ErrorRS;
import br.com.elo7.explorando.marte.rest.response.SondasRS;
import br.com.elo7.explorando.marte.service.ExplorarMarteService;
import org.apache.log4j.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by eltonmoraes on 27/04/16.
 */
@Path("/explorarMarte")
@RequestScoped
public class ExplorarMarteRestService {

    private static final Logger LOG = Logger.getLogger(ExplorarMarteRestService.class);

    @Inject
    private ExplorarMarteService explorarMarteService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response explorarMarte(@Valid SondasRQ sondasRQ){
        Response response;
        try {
            SondasModel sondasModel = SondasRQConverter.converter(sondasRQ);
            explorarMarteService.explorarMarte(sondasModel);
            SondasRS sondasRS = SondasRSConverter.converter(sondasModel);
            response = Response.ok().entity(sondasRS).build();
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
            response = Response.serverError().entity(new ErrorRS(99999, e.getMessage())).build();
        }

        return response;
    }
}
