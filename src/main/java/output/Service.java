package output;

import java.io.IOException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import dao.PlaylistDAO;
import dao.TrackDAO;
import entities.Playlist;
import entities.Track;
import parse.Parse;

@Path("/sampleservice")
public class Service {
	private static List<Track> tracks;
	private static List<Playlist> playlist;
	static {
		Parse parse = new Parse();
		try {
			parse.parse();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// CREATING ARRAYLIST OF TRACKS
		ArrayList<Track> tracksStatic = parse.getTracks();
		tracks = tracksStatic;
		// USING HIBERNATE TO SAVE TRACKS
		TrackDAO trackdao = new TrackDAO();
		for (Track t : tracks) {
			trackdao.saveTrack(t);
		}

		// CREATING ARRAYLIST OF PLAYLISTS
		ArrayList<Playlist> playlistStatic = parse.getPlaylists();
		playlist=playlistStatic;
		// USING HIBERNATE TO SAVE TRACKS
		PlaylistDAO playlistdao = new PlaylistDAO();
		for (Playlist p: playlist) {
			playlistdao.savePlaylist(p);
			
		}


	}

	@GET
	@Path("/tracks")
	@Produces("text/plain")
	public String hello() {
		return tracks.toString();
	}
}
