package com.sample.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.code.gson;

import com.sample.pojo.Team;

@Path("/json/metallica")
public class TeamService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Team> getTeamInJSON() {

		
		List<Team> team = new ArrayList<Team>();
		Gson gson = new Gson();
		String json = gson.toJson(team);
		System.out.println(json);

		return team;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Team team) {

		String result = "Track saved : " + team;
		return Response.status(201).entity(result).build();
		
	}
	
}