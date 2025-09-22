import java.util.List;

public class Gerente extends Persona {
	List<Empleado>listEmpleados;

	public List<Empleado> getListEmpleados() {
		return listEmpleados;
	}

	public void setListEmpleados(List<Empleado> listEmpleados) {
		this.listEmpleados = listEmpleados;
	}

	@Override
	public String toString() {
		return "\nGerente [  identificador " + getIdentificador() + ", Id Gerente = " + getIdTrabajador()  + ", Nombre()=" + getNombre() + ", Apellido Paterno()="
				+ getApellidoPaterno() + ", Fecha Ingreso()=" + getFechaIngreso() + ", Sueldo()=" + getSueldo()
				+ "listEmpleados=" + listEmpleados +"]";
	}

	

}
