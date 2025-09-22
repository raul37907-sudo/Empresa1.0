//import java.util.List;

public class Area {
	
	// finanza, producción ,rrhh, almacen ventas
	
	private String identificadorArea;
	private String nombreArea;
	private String numEmpleados;
	private String presupuesto;
	private Gerente gerente;
	
	
	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public String getIdentificadorArea() {
		return identificadorArea;
	}

	public void setIdentificadorArea(String identificadorArea) {
		this.identificadorArea = identificadorArea;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

	public String getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(String numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

//	public List<Gerente> getlistGerentes() {
//		return listGerentes;
//	}
//
//
//	public void setlistGerentes(List<Gerente> listGerentes) {
//		this.listGerentes = listGerentes;
//	}


	public String getPresupuesto() {
		return presupuesto;
	}


	public void setPresupuesto(String presupuesto) {
		this.presupuesto = presupuesto;
	}


	@Override
	public String toString() {
		return "Area [" + "identificador = " + identificadorArea + ","
				+ "nombre Area = " + nombreArea + ","
				  + " numero de Empleados = " + numEmpleados  + ", "
				  + " Presupuesto = " + presupuesto  + ", "
				  + "Gerente ==> " +  gerente + "] \n";
	}



}
