package com.notepad.models.repositories;

import com.notepad.models.entities.Note;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class NoteRepository {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Writingpad");
    private static final EntityManager em = emf.createEntityManager();

    public List<Note> getAll(){
        String jpql = "select n from Note n";
        Query query = em.createQuery(jpql);
        List <Note> resultList = query.getResultList();
        return resultList;
    }
}
