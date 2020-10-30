package com.notepad.tests;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.notepad.model.Bookmark;
import com.notepad.model.Item;
import com.notepad.model.Note;

public class RelationshipTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Writingpad");
		EntityManager em = emf.createEntityManager();
		
		Bookmark bookmark1 = new Bookmark("Futebol", "Assuntos relacionados aos jogos do brasileirão");
		Bookmark bookmark2 = new Bookmark("Esportes", "Assuntos relacionados a qualquer esporte");
		
		Note note1 = new Note(true, "O que o Flamengo precisa para ser campeão?", Arrays.asList(bookmark1, bookmark2));
		Note note2 = new Note(true, "Vasco vai para a segunda divisão?", Arrays.asList(bookmark1, bookmark2));
		
		Item item1 = new Item(false, "Vencer o vasco", note1);
		Item item2 = new Item(true, "Jogar no maracanã", note1);
		
		Item item3 = new Item(false, "não precisa nem de itens pra definir, vai sim!", note2);
		
		em.getTransaction().begin();
		
		em.persist(bookmark1);
		em.persist(bookmark2);
		em.persist(note1);
		em.persist(note2);
		em.persist(item1);
		em.persist(item2);
		em.persist(item3);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
