/**
 * 
 */
package Backend.model.dto;

/**
 * @author Miguel A. Sastre
 *
 */
public class VideoDto {
	
	Integer id;
	String title;
	String director;
	Integer cli_id;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}
	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	/**
	 * @return the cli_id
	 */
	public Integer getCli_id() {
		return cli_id;
	}
	/**
	 * @param cli_id the cli_id to set
	 */
	public void setCli_id(Integer cli_id) {
		this.cli_id = cli_id;
	}
	
}
