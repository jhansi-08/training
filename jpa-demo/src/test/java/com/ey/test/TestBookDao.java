package com.ey.test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.ey.dao.BookDao;
import com.ey.entity.Book;
public class TestBookDao {

	private static BookDao dao;

	@BeforeAll
	public static void init() {

		dao = new BookDao();

	}

	@Test
	public void testSave() {

		Book b = new Book(12343, "The Alchemist", "Paulo Coelho", 249);
		dao.save(b);

	}

	@Test
	public void testList() {

		List<Book> books = dao.list();
		assertNotNull(books);
		books.forEach(System.out::println);

	}
	@Test
	public void testFindByIsbn() {

		Book b = dao.findByIsbn(12343);
		assertNotNull(b);
		System.out.println(b);

	}
	
	@Test
	public void testUpdate() {

		Book b = new Book(12343, "The Alchemist", "Paulo Coelho", 249);
		dao.save(b);

	}
	
}