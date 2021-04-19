package day24;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
@Path("/hello")
public class HelloRestService {
	
	@GET
	public void sayHello() {
		System.out.println("Welcome to REST............");
	}
	
	//http://localhost:8080/RestFrameworkProject/rest/hello/hello2
	@GET
	@Path("/hello2")
	public void sayHello2() {
		System.out.println("Welcome to REST...2222222222222222222.........");
	}
	
	//http://localhost:8080/RestFrameworkProject/rest/hello/hello3
	@GET
	@Path("/hello3")
	public Response sayHello3() {
		System.out.println("Welcome to REST...3333333333333333.........");
		return Response.status(200).entity("<h1>Welcome to REST...33333.....").build();
	}
	
	//http://localhost:8080/RestFrameworkProject/rest/hello/hello4/codapresedio/sharan
	@GET
	@Path("/hello4/{uname}/{ceo}")
	public Response sayHello4(@PathParam("uname") String n,@PathParam("ceo") String ceo) {
		System.out.println("Welcome to REST...4444444........."+n+": and ceo is"+ceo);
		return Response.status(200).entity("<h1>Welcome to REST...444444....."+n+": and ceo is"+ceo).build();
	}
	
	//http://localhost:8080/RestFrameworkProject/rest/hello/hello5/?uname=codapresedio&&ceo=sharan
	@GET
	@Path("/hello5")
	public Response sayHello5(@QueryParam("uname") String n,@QueryParam("ceo") String ceo) {
		System.out.println("Welcome to REST...55555........."+n+": and ceo is"+ceo);
		return Response.status(200).entity("<h1>Welcome to REST...5555....."+n+": and ceo is"+ceo).build();
	}
	
	//http://localhost:8080/RestFrameworkProject/rest/hello/hello6/?uname=codapresedio&&ceo=sharan
	@GET
	@Path("/hello6")
	public Response sayHello6(@Context UriInfo uriInfo) {
		String n=uriInfo.getQueryParameters().getFirst("uname");
		String ceo=uriInfo.getQueryParameters().getFirst("ceo");
		System.out.println("Welcome to REST...6666........."+n+": and ceo is"+ceo);
		return Response.status(200).entity("<h1>Welcome to REST...666....."+n+": and ceo is"+ceo).build();
	}
	
	//http://localhost:8080/RestFrameworkProject/rest/hello/hello7;sid=890
	@GET
	@Path("/hello7")
	public Response sayHello7(@MatrixParam("sid") String sid) {
		System.out.println("Welcome to REST...777........."+sid);
		return Response.status(200).entity("<h1>Welcome to REST...7....."+sid).build();
	}
	
	
	//1.run index.html...then next step....
	//http://localhost:8080/RestFrameworkProject/rest/hello/hello8
	@POST
	@Path("/hello8")
	public Response sayHello8(@FormParam("uname") String uname,@FormParam("upass") String upass) {
		System.out.println("Welcome to REST...8888........."+uname+":"+upass);
		return Response.status(200).entity("<h1>Welcome to REST...8888....."+uname+":"+upass).build();
	}
	
	
}