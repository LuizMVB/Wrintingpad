package com.notepad.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/Note")
public class NoteResource {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Writingpafd");
    EntityManager em = emf.createEntityManager();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Note> get{

    }


}
