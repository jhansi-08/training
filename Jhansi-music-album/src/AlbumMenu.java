import java.util.Scanner;

public class AlbumMenu {


	private static AlbumDaoImpl dao;
	static {
		try {
			dao = new AlbumDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		while (true) {
			System.out.println("Main Menu");
			System.out.println(
					"1- Add Album \n2- Find by title \n3- List Albums \n4- Find by artist \n5- Find by genre \n6- Update Album \n7- Delete Album \n8- Exit");
			System.out.println("Enter Choice: ");
			int choice = console.nextInt();
			switch (choice) {

			case 1:
				persistAlbum();
				break;
			case 2:
				findTitle();
				break;
				
			case 3: 
				listAlbum();
				break;
			case 4:
				findArtist();
				break;
			case 5:
				findGenre();
				break;
			case 6:
				updateAlbum();
				break;
			case 7:
				deleteAlbum();
				break;
			case 8:
				System.exit(0);
			default:
				System.out.println("Invalid option");
			}
		}
	}

	private static void persistAlbum() {

		Scanner console = new Scanner(System.in);
		System.out.println("Enter Title: ");
		String title = console.next();
		System.out.println("Enter Artist: ");
		String artist = console.next();
		System.out.println("Enter Genre: ");
		String genre = console.next();

		Album a = new Album(title, artist, genre);
		dao.persist(a);

	}

	private static void findTitle() {

		Scanner console = new Scanner(System.in);

		System.out.println("Enter Title: ");
		String title = console.next();

		System.out.println(dao.findByTitle(title));
	}
	private static void listAlbum() {
		dao.list().forEach(System.out::println);
	}
	private static void findArtist() {

		Scanner console = new Scanner(System.in);

		System.out.println("Enter Artist: ");
		String artist = console.next();

		System.out.println(dao.findByArtist(artist));
	}

	private static void findGenre() {

		Scanner console = new Scanner(System.in);

		System.out.println("Enter Genre: ");
		String genre = console.next();

		System.out.println(dao.findByGenre(genre));
	}

	private static void updateAlbum() {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter album title to update: ");
	    String updateTitle = scanner.nextLine(); // Declare and get the title to update

	    try {
	        Album foundAlbum = dao.findByTitle(updateTitle); // Use dao to find the album by title

	        System.out.print("Enter new artist (or press Enter to keep current): ");
	        String newArtist = scanner.nextLine();

	        if (!newArtist.isEmpty()) {
	            foundAlbum.setArtist(newArtist);
	        }

	        System.out.print("Enter new genre (or press Enter to keep current): ");
	        String newGenre = scanner.nextLine();

	        if (!newGenre.isEmpty()) {
	            foundAlbum.setGenre(newGenre);
	        }

	        dao.update(foundAlbum);

	        System.out.println("Album updated successfully.");
	    } catch (InvalidAlbumException e) {
	        System.out.println(e.getMessage());
	    }
	}

	private static void deleteAlbum() {

		Scanner console = new Scanner(System.in);

		System.out.println("Enter Title: ");
		String title = console.next();

		dao.delete(title);
	}
}
