import java.util.List;

public interface AlbumDao {

	void persist(Album a);

	Album findByTitle(String title) throws InvalidAlbumException;

	List<Album> list();

	Album findByArtist(String artist);

	Album findByGenre(String genre);

	boolean update(Album a) throws InvalidAlbumException;

	boolean delete(String title) throws InvalidAlbumException;

}