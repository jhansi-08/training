package com.ey.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;
import com.ey.entity.Book;

public class BookDao {

	private EntityManagerFactory factory;

	public BookDao() {

		factory = Persistence.createEntityManagerFactory("MyJPA");

	}

	public void save(Book bk) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(bk);
		txn.commit();
		em.close();

	}

	public List<Book> list() {

		EntityManager em = factory.createEntityManager();

		Query query = em.createQuery("FROM Book");

		return query.getResultList();

	}

	public Book findByIsbn(int isbn) {

 

		EntityManager em = factory.createEntityManager();

		return em.find(Book.class, isbn);

	}
	public void update(Book b) {
		

		EntityManager em = factory.createEntityManager();

		EntityTransaction txn = em.getTransaction();

		txn.begin();

		em.merge(b);

		txn.commit();

		em.close();
	}
	public void delete(int isbn) {
		

		EntityManager em = factory.createEntityManager();

		EntityTransaction txn = em.getTransaction();

		txn.begin();
		Book b = em.find(Book.class, isbn);

		em.merge(b);

		txn.commit();

		em.close();
	}
}