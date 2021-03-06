package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "track")
@Entity
public class Track {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int trackid;
	private int id;
	private String name;
	private String artist;
	private String album;
	private String genre;
	private int time;
	public Track() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Track(int id, String name, String artist, String album, String genre, int time) {
		super();
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.genre = genre;
		this.time = time;
	}
	
	@XmlElement
	public int getTrackid() {
		return trackid;
	}
	public void setTrackid(int trackid) {
		this.trackid = trackid;
	}
	/**
	 * @return the id
	 */
	@XmlElement
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	@XmlElement
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the artist
	 */
	@XmlElement
	public String getArtist() {
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 * @return the album
	 */
	@XmlElement
	public String getAlbum() {
		return album;
	}
	/**
	 * @param album the album to set
	 */
	public void setAlbum(String album) {
		this.album = album;
	}
	/**
	 * @return the genre
	 */
	@XmlElement
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * @return the time
	 */
	@XmlElement
	public int getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Track [id=" + id + ", name=" + name + ", artist=" + artist + ", album=" + album + ", genre=" + genre
				+ ", time=" + time + "]\n";
	}
	
	
	
	
	
}
