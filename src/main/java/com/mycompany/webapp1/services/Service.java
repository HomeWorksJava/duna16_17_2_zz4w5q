/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webapp1.services;


import com.mycompany.webapp1.model.Szemely;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author Nagy2
 */
@Path("service")
public class Service {
    private static Map<Integer, Szemely> szemelyek = new HashMap<Integer, Szemely>();
    static{
            for (int i = 0; i < 10; i++) {
                Szemely szemely = new Szemely();
                int id = i + 1;
                szemely.setId(id);
                szemely.setNev(id + ". szemely");
                szemely.setKor(new Random().nextInt(40)+1);
            
                szemelyek.put(id, szemely);
                }
            }
    @GET
    @Path("/SzemelyIdXML/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Szemely SzemelyIdXML(@PathParam("id")int id) {
        return szemelyek.get(id);
        
    }
    @GET
    @Path("/SzemelyIdJSON/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Szemely SzemelyIdJSON(@PathParam("id")int id) {
        return szemelyek.get(id);
    }
    @GET
    @Path("/OsszSzemelyXML/")
    @Produces(MediaType.APPLICATION_XML)
    public List<Szemely> OsszSzemelyXML() {
        return new ArrayList<Szemely>(szemelyek.values());
        
    }
}
