package ch.monkeybanana.controller;

import java.sql.SQLException;

import javax.swing.JLabel;

import ch.monkeybanana.GameTest.GameClient;
import ch.monkeybanana.dao.UserDao;
import ch.monkeybanana.dao.UserJDBCDao;
import ch.monkeybanana.model.User;

/**
 * Hier ist die Kommunikation zwischen View und Datenbank implementiert
 * @author Dominic Pfister, Elia Perenzin MBController.java Copyright
 *         Berufsbildungscenter MonkeyBanana 2015
 */
public class MBController {
	private static MBController instance = new MBController();
	private final static UserDao USER_DAO = new UserJDBCDao();

	public static UserDao getUserDao() {
		return USER_DAO;
	}

	/**
	 * Konstruktor der Klasse GMCController nur Privat
	 */
	private MBController() {
	}

	public static MBController getInstance() {
		return MBController.instance;
	}

	/**
	 * Hier wird ueberprueft ob die eingaben des Users gueltig sind und wenn
	 * dies zutrifft wird er in die DB eingetragen
	 * @author Elia Perenzin
	 * @param newUser {@link User}
	 */
	public void registrieren(User newUser, JLabel console) {
		try{
			USER_DAO.registrieren(newUser);
			console.setText(console.getText() + "Benutzer "+ newUser.getUsername() + " hat sich registriert." + "<br>");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

	/**
	 * Hier wird das Login durchgefuehrt
	 * @param user {@link User}
	 */
	public void login(User user, JLabel console) {
			console.setText(console.getText() + user.getUsername() + " hat den Server betreten." + "<br/>");
	
	}
}
