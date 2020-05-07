package br.upis.wsrest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("inches2meter")
public class InchestoMeter {
	@Path("{i}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMeter(@PathParam("i") Double i) {
		double meters = i * 0.0254;
		JSONObject json = new JSONObject();
		json.put("metros", meters);
		return Response.status(200).entity(json).build();
	}
}
