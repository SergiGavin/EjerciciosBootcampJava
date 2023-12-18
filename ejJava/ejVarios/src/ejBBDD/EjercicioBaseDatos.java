package ejBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;


public class EjercicioBaseDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection;
		
		final String url = "jdbc:mysql://localhost:3306/db_test";
		
		final String usuario = "admin";
		final String password = "admin";
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		int idBBDD = 0;
		String query = "";
		String userBBDD;
		int edadBBDD;
		String nacionalidadBBDD = "";
		String tabla = "db_test.usuarios";
		int rowsUpdated = 0;
		
		try {
			connection = DriverManager.getConnection(url, usuario, password);
			java.sql.Statement statement = connection.createStatement();
			ResultSet result = null;
			System.out.println("Conexion realizada con exito");
			
			
			System.out.println("Que accion quieres realizar?\n"
					+ "1.Insert\n"
					+ "2.Select\n"
					+ "3.Update\n"
					+ "4.Delete");
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca el nombre del nuevo usuario");
				userBBDD = scanner.next();
				System.out.println("Introduzca la edad del usuario");
				edadBBDD = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Introduzca la nacionalidad del usuario");
				nacionalidadBBDD = scanner.nextLine();
				query = "INSERT INTO "+tabla+"(nombre, edad, nacionalidad) VALUES ('"+userBBDD+"',"+edadBBDD+", '"+nacionalidadBBDD+"');";
				int queryInsert = statement.executeUpdate(query);
				result = statement.executeQuery("SELECT * FROM "+tabla+";");
				break;
			case 2:
				result = statement.executeQuery("SELECT * FROM "+tabla+";");
				break;
			case 3:
				System.out.println("Que quieres actualizar?\n"
						+ "1.Nombre\n"
						+ "2.Edad\n"
						+ "3.Nacionalidad");
				int opcion2 = scanner.nextInt();
				switch (opcion2) {
				case 1:
					result = statement.executeQuery("SELECT * FROM " + tabla + ";");
					System.out.println("Introduzca el id del usuario que quieres modificar");
					idBBDD = scanner.nextInt();
					System.out.println("Introduzca el nombre del usuario a modificar");
					userBBDD = scanner.next();
					query = "UPDATE " + tabla + " SET nombre = '" + userBBDD + "' WHERE id_usuarios = " + idBBDD + ";";
					rowsUpdated = statement.executeUpdate(query);
					result = statement.executeQuery("SELECT * FROM " + tabla);
					break;
				case 2:
					result = statement.executeQuery("SELECT * FROM " + tabla + ";");
					System.out.println("Introduzca el id del usuario que quieres modificar");
					idBBDD = scanner.nextInt();
					System.out.println("Introduzca la edad del usuario a modificar");
					edadBBDD = scanner.nextInt();
					query = "UPDATE " + tabla + " SET edad = '" + edadBBDD + "' WHERE id_usuarios = " + idBBDD + ";";
					rowsUpdated = statement.executeUpdate(query);
					result = statement.executeQuery("SELECT * FROM " + tabla);
					break;
				case 3:
					result = statement.executeQuery("SELECT * FROM " + tabla + ";");
					System.out.println("Introduzca el id del usuario que quieres modificar");
					idBBDD = scanner.nextInt();
					System.out.println("Introduzca la nacionalidad del usuario a modificar");
					nacionalidadBBDD = scanner.next();
					query = "UPDATE " + tabla + " SET nacionalidad = '" + nacionalidadBBDD + "' WHERE id_usuarios = " + idBBDD + ";";
					rowsUpdated = statement.executeUpdate(query);
					result = statement.executeQuery("SELECT * FROM " + tabla);
					break;
				default:
					break;
				}
				break;
			case 4:
				
				System.out.println("Introduzca el id del usuario a eliminar");
				int idEliminar = scanner.nextInt();
				scanner.nextLine();
				
                if (idEliminar > 0) {
                	query = "DELETE FROM " + tabla + " WHERE id_usuarios = " + idEliminar;
                	int queryDelete = statement.executeUpdate(query);
                    System.out.println("Registro eliminado con éxito.");
                    result = statement.executeQuery("SELECT * FROM "+tabla+";");
                }else if(idEliminar < 0) {
                	System.out.println("El numero no puede ser negativo");
                }else {
                    System.out.println("No se encontró el registro con el ID especificado.");
                }
				break;

			default:
				break;
			}
			
			ResultSetMetaData rsmd = result.getMetaData();
			
			int columnCount = rsmd.getColumnCount();
			
			for (int i =1; i <= columnCount; i++) {
				System.out.printf("%15s", rsmd.getColumnName(i).toString());
			}
			
			int spacing = ((columnCount*10)-5);
			
			String textoFormateado = String.format("%n%"+spacing+"s"," "," ".replace(" ", "-"));
			System.out.println(textoFormateado);
			
			while(result.next()) {
				int id_usuarios = result.getInt("id_usuarios");
				String nombre = result.getString("Nombre");
				int edad = result.getInt("Edad");
				String nacionalidad = result.getString("nacionalidad");
				System.out.printf("%10d%20s%15d%15s%n", id_usuarios, nombre, edad, nacionalidad);

			}
			//cerramos el result, el statement y la conexion
			result.close();
			statement.close();
			connection.close();
			System.out.println("Conexion cerrada");
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
