package com.notepad.models.resources;

import com.notepad.models.entities.Note;
import com.notepad.models.repositories.NoteRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/Note")
public class NoteResource {

    private NoteRepository noteRepository = new NoteRepository();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Note> get() {
        return noteRepository.getAll();
    }

}