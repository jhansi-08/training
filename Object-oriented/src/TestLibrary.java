import com.ey.lib.Book;
import com.ey.lib.Member;

public class TestLibrary {

	public static void main(String[] args) {
		
		Book bk =  new Book(" The Alchemist");
		
		Member mr = new Member("Phunsuk ");
		Member m2 = new Member("Ganapath");
		
		bk.status();
		mr.status();
		
		bk.issueBook(mr);
		bk.status();
		mr.status();

		bk.returnBook(mr);
		bk.status();
		mr.status();
		
		
		bk.returnBook(m2);
		
	}
}
