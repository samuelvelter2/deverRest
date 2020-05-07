package br.upis.wsrest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("inches2feet")
public class InchestoFeet {
	@Path("{i}")
	@GET
	@Produces
	public Response getFeet(@PathParam("i") Double i) {
		Double feet = i * 0.08333;
		JSONObject json = new JSONObject();
		json.put("Pés", feet);
		return Response.status(200).entity(json).build();
	}
}
