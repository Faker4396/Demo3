package com.fw.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fw.pojo.Mobile;

public interface MobileService {
	@GET
	@Path("/find/{tel}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Mobile findBytel(@PathParam("tel") String tel);
	
	@GET
	@Path("/find2/{tel}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Mobile findBytel2(@PathParam("tel") String tel);
}
