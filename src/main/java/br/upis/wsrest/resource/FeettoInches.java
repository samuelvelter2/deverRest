package br.upis.wsrest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("feet2inches")
public class FeettoInches {
	@GET
	@Path("{f}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInches(@PathParam("f")Double f) {
		Double feet = f/0.08333;
		JSONObject json = new JSONObject();
		json.put("pés", feet);
		return Response.status(200).entity(json).build();
	}
}
