
public class Persona {
	
	private String identificador;
	private	String nombre ;
	private	String apellidoPaterno;
	private	String ApellidoMaterno;
	private	String dirreccion;	
	private	String telefono;
	private String  edad;
	private String fechaIngreso;
	private String sueldo ;
	private String idTrabajador ;
	
	public Persona() {
	}

	public String getIdentificador() {
		return identificador;
	}


	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		ApellidoMaterno = apellidoMaterno;
	}

	public String getDirreccion() {
		return dirreccion;
	}

	public void setDirreccion(String dirreccion) {
		this.dirreccion = dirreccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getSueldo() {
		return sueldo;
	}

	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}

	public String getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(String idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	@Override
	public String toString() {
		return "\nPersona [ identificador = " + identificador + ", nombre = " + nombre + ", apellidoPaterno = " + apellidoPaterno + ", ApellidoMaterno = "
				+ ApellidoMaterno + ", dirreccion=" + dirreccion + ", telefono=" + telefono + ", edad=" + edad
				+ ", fechaIngreso = " + fechaIngreso + ", sueldo = " + sueldo
				+ ", idTrabajador = " + idTrabajador + "]";
	}
	
	

}
