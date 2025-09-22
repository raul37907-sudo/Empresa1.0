import java.util.List;

public class Main {

	public static void main(String[] args) {

	List<String>fileEmpleados = LeerArchivo.leerArchivos ("C:\\Users\\Usuario\\Desktop\\proyectos\\Empresa\\Empleados.txt");
	List<String>fileAreas = LeerArchivo.leerArchivos ("C:\\Users\\Usuario\\Desktop\\proyectos\\Empresa\\Areas.txt");
	LeerArchivo.filtrarCargosEmpresa(fileEmpleados,fileAreas);
//	Crud.reemplazar("C:\\Users\\Usuario\\Desktop\\proyectos\\Empresa\\EmpleadosCopia.txt");
	}

}
