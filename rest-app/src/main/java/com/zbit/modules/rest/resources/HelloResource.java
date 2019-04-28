package com.zbit.modules.rest.resources;

import com.zbit.strings.util.StringCreator;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.xml.XMLConstants;

@Path("/")
public class HelloResource {

  @GET
  @Path("/hello")
  public String sayHello() {
    return "Hello. 'The XML_NS_URI' is: " + XMLConstants.XML_NS_URI;
  }

  @GET
  @Path("/random")
  public String getRandom() {
    return new StringCreator().generateRandomString();
  }
}