/**
 * 
 */
package cm.mitocode.dao;

/**
 * @author BRYAN
 *
 */
public class ConexionPostgreSQL implements IConexion{
	
	private String usuario;
	private String clave;
	private String host;
	
	public ConexionPostgreSQL(String usuario, String clave, String host) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.host = host;
	}

	@Override
	public String toString() {
		return "ConexionPostgreSQL [usuario=" + usuario + ", clave=" + clave + ", host="
				+ host + "]";
	}

	@Override
	public void conectar() {
		System.out.println("Conectando a PostgreSQL");
	}
}
