package aia.api_ex.services;

import aia.api_ex.controller.VolsDB;
import aia.api_ex.model.Vol;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@Path("/vols")
@Produces({MediaType.APPLICATION_JSON})
public class VolRessource {

    public VolRessource() {

    }

    @GET
    public List<Vol> getVols() {

        return VolsDB.getVols();
    }

    @GET
    @Path("/numVol-{id}")
    public Vol getVol(@PathParam("id") String id) {
        Optional<Vol> vol = VolsDB.getVolById(id);

        if (vol.isPresent()) {
            return vol.get();
        } else {
            throw new NotFoundException();
        }
    }

    @GET
    @Path("/search")
    public Response searchVols(@QueryParam("departure") String departure, @QueryParam("arrival") String arrival, @QueryParam("departureTime") int departureTime) {
        return Response.ok().header("departure", departure).header("arrival", arrival).header("departureTime", departureTime).entity(VolsDB.getVols().subList(0, 2)).build();
    }
}