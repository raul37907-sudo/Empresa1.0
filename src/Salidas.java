import java.util.List;

public class Salidas {

	public static void SalidaGerentes (List<Gerente>ListGerentes){
		
		for(Gerente ithem : ListGerentes) {
			System.out.println("NOMBRE DEL GERENTE :" +ithem.getNombre() +" APELLIDO PATERNO " + ithem.getApellidoPaterno() + " APELLIDO PATERNO " + ithem.getApellidoMaterno() 
			+" FECHA DE INGRESO : " +  ithem.getFechaIngreso() +" SALARIO" + "  " + ithem.getSueldo());
		
		}
		
	}
}
