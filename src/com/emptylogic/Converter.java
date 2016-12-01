package com.emptylogic;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/convert")
public class Converter {
	/*
	 * PATH www.xxxxxxx.elasticbeanstalk/api/convert/ftoc
	 */
	@Path("/ftoc")
	@GET
	@Produces("application/json")
	public Response convertFahrenheitToCelsius() throws JSONException {
		JSONObject json = new JSONObject();
		float celsius;
		float fahrenheit = 0f;
		celsius = (fahrenheit - 32) * 5/9;
		
		json.put("fahrenhiet", fahrenheit);
		json.put("celsius", celsius);
		
		String result = "@Produces(\"application/json\") Output: \n\n Fahrenheit to Celsius conversion: \n\n " + json;
		
		return Response.status(200).entity(result).build();
	}
	
	/*
	 * PATH www.xxxxxxx.elasticbeanstalk/api/convert/ftoc
	 */
	@Path("/ftoc/{f}")
	@GET
	@Produces("application/json")
	public Response convertFahrenheitToCelsius(@PathParam("f") float f) throws JSONException {
		JSONObject json = new JSONObject();
		float celsius;
		celsius = (f - 32) * 5/9;
		
		json.put("fahrenhiet", f);
		json.put("celsius", celsius);
		
		String result = "@Produces(\"application/json\") Output: \n\n Fahrenheit to Celsius conversion: \n\n " + json;
		
		return Response.status(200).entity(result).build();
	}
	
	/*
	 * PATH www.xxxxxxx.elasticbeanstalk/api/convert/ctof
	 */
	@Path("/ctof")
	@GET
	@Produces("application/json")
	public Response convertCelsiusToFahrenheit() throws JSONException {
		JSONObject json = new JSONObject();
		float celsius = 0f;
		float fahrenheit;
		fahrenheit = celsius * (9/5) + 32;
		
		json.put("fahrenhiet", fahrenheit);
		json.put("celsius", celsius);
		
		String result = "@Produces(\"application/json\") Output: \n\n Celsius to Fahrenheit conversion: \n\n " + json;
		
		return Response.status(200).entity(result).build();
	}
	
	/*
	 * PATH www.xxxxxxx.elasticbeanstalk/api/convert/ctof
	 */
	@Path("/ctof/{c}")
	@GET
	@Produces("application/json")
	public Response convertCelsiusToFahrenheit(@PathParam("c") float c) throws JSONException {
		JSONObject json = new JSONObject();
		float fahrenheit;
		fahrenheit = c * (9/5) + 32;
		
		json.put("fahrenhiet", fahrenheit);
		json.put("celsius", c);
		
		String result = "@Produces(\"application/json\") Output: \n\n Celsius to Fahrenheit conversion: \n\n " + json;
		
		return Response.status(200).entity(result).build();
	}
}
