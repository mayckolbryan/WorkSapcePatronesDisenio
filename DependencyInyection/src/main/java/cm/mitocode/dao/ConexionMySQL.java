/**
 * 
 */
package cm.mitocode.dao;

/**
 * @author BRYAN
 *
 */
public class ConexionMySQL implements IConexion{
	
	private String usuario;
	private String clave;
	private String host;
	
	public ConexionMySQL(String usuario, String clave, String host) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.host = host;
	}

	@Override
	public String toString() {
		return "ConexionMySQL [usuario=" + usuario + ", clave=" + clave + ", host="
				+ host + "]";
	}

	@Override
	public void conectar() {
		System.out.println("Conectando a MySQL");
	}
}
