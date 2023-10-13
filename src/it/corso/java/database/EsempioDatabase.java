package it.corso.java.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.mysql.cj.xdevapi.PreparableStatement;

public class EsempioDatabase {
	private Connection con;

	public static void main(String[] args) {
		EsempioDatabase d = new EsempioDatabase();
		
		try {
//			System.out.println(d.getConnection().isClosed());
			
//			d.esSelect2();
//			d.esSelect();
			
//			d.esInsert("Sara", "Bartoli", "sara@test.it", "9999999");
			
//			d.esUpdate();
			
//			d.esDelete();
			
			d.esSelect3();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	private void esSelect3(String cognome) throws SQLException {
		String sql = "SELECT id, nome, cognome, email, telefono FROM clienti WHERE cognome = ?";
		
		PreparedStatement ps = getConnection().prepareStatement(sql);
		ps.setString(1, cognome);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("id = " + rs.getInt(1));
			System.out.println("nome = " + rs.getString(2));
			System.out.println("cognome = " + rs.getString(3));
			System.out.println("email = " + rs.getString(4));
			System.out.println("telefono = " + rs.getString(5));
			System.out.println("-----------------");
		}
	}
	
	private void esDelete() throws SQLException {
		String sql = "DELETE FROM clienti WHERE id = ?";
		
		PreparedStatement ps = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		ps.setInt(1, 6);
		
		ps.executeUpdate();
	}
	
	private void esUpdate() throws SQLException {
		String sql = "UPDATE clienti SET telefono = ? WHERE id = ?";
		
		PreparedStatement ps = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, "12345678");
		ps.setInt(2, 5);
		
		ps.executeUpdate();
	}
	
	private void esInsert(String nome, String cognome, String email, String telefono) throws SQLException {
//		String sql = "INSERT INTO clienti(nome, cognome, email, telefono) " +
//					"VALUES('"+nome+"', '"+cognome+"', '"+email+"', '"+telefono+"')";
		
		String sql = "INSERT INTO clienti(nome, cognome, email, telefono) " +
				"VALUES(?, ?, ?, ?)";
		
		/* INSERT INTO tabella(campi...) VALUES('valore1', 'valore2') */
		
		PreparedStatement ps = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, nome);
		ps.setString(2, cognome);
		ps.setString(3, email);
		ps.setString(4, telefono);
		
		ps.executeUpdate();
		
		ResultSet rs = ps.getGeneratedKeys();
		rs.next();
		
		System.out.println("l`ID è " + rs.getInt(1));
	}
	
	private void esSelect2() throws SQLException {
		String sql = "SELECT id, nome, cognome, email, telefono FROM clienti WHERE cognome LIKE '%Pre%'";
		
		PreparedStatement ps = getConnection().prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("id = " + rs.getInt(1));
			System.out.println("nome = " + rs.getString(2));
			System.out.println("cognome = " + rs.getString(3));
			System.out.println("email = " + rs.getString(4));
			System.out.println("telefono = " + rs.getString(5));
			System.out.println("-----------------");
		}
	}
	
	private void esSelect() throws SQLException {
		String sql = "SELECT id, nome, cognome, email, telefono FROM clienti";
		
		PreparedStatement ps = getConnection().prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("id = " + rs.getInt(1));
			System.out.println("nome = " + rs.getString(2));
			System.out.println("cognome = " + rs.getString(3));
			System.out.println("email = " + rs.getString(4));
			System.out.println("telefono = " + rs.getString(5));
			System.out.println("-----------------");
		}
	}
	
	private Connection getConnection() throws SQLException {
		if (con == null) {
			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setServerName("127.0.0.1");
			dataSource.setPortNumber(3306);
			dataSource.setUser("root");
			dataSource.setPassword("Simpatia5!");
			dataSource.setDatabaseName("corso_java");

			con = dataSource.getConnection();
		}
		
		return con;
	}
}
