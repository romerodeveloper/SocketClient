import java.io.Serializable;
import java.math.BigDecimal;

public class Ciudad_Persona implements Serializable {
	
	private String dir_tel;
	private String ciud_nombre;
	private String dir_nombre;
	private String dir_direccion;
	private String mensaje_error;
	
	public String getMensaje_error() {
		return mensaje_error;
	}
	public void setMensaje_error(String mensaje_error) {
		this.mensaje_error = mensaje_error;
	}
	public String getDir_tel() {
		return dir_tel;
	}
	public void setDir_tel(String dir_tel) {
		this.dir_tel = dir_tel;
	}
	public String getCiud_nombre() {
		return ciud_nombre;
	}
	public void setCiud_nombre(String ciud_nombre) {
		this.ciud_nombre = ciud_nombre;
	}
	public String getDir_nombre() {
		return dir_nombre;
	}
	public void setDir_nombre(String dir_nombre) {
		this.dir_nombre = dir_nombre;
	}
	public String getDir_direccion() {
		return dir_direccion;
	}
	public void setDir_direccion(String dir_direccion) {
		this.dir_direccion = dir_direccion;
	}
	
	

	
}
