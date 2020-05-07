package br.upis.wsrest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("meter2feet")
public class MetertoFoot {
	@Path("{m}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response convert(@PathParam("m") Double m) {
		Double feet = m / 0.3048;
		JSONObject json = new JSONObject();
		json.put("pés", feet);
		return Response.status(200).entity(json).build();
	}
}
