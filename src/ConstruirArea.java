import java.util.ArrayList;
import java.util.List;

public class ConstruirArea {

	public static void separaEpleadosGerentesAreas (List<Area>listAreas,List<Gerente>listGerentes,List<Empleado>listEmpleados) {
		List<Empleado>listEmpleadosFinanzas    = new ArrayList<>();	
		List<Empleado>listEmpleadosProduccion  = new ArrayList<>();	
		List<Empleado>listEmpleadosRrhh        = new ArrayList<>();	
		List<Empleado>listEmpleadosAlmacen     = new ArrayList<>();	
		List<Empleado>listEmpleadosVentas      = new ArrayList<>();
		String identificador = "" ;
		int i=0;
		
		for (Empleado ithem : listEmpleados) {
			identificador = String.valueOf(listEmpleados.get(i).getIdentificador());
		if (identificador.equalsIgnoreCase("EF")){
				listEmpleadosFinanzas.add(ithem);				
		}else if  (identificador.equalsIgnoreCase("EP")) {
				listEmpleadosProduccion.add(ithem);
			}else if  (identificador.equalsIgnoreCase("ER")) {
				listEmpleadosRrhh.add(ithem);
				}else if  (identificador.equalsIgnoreCase("EA")) {
				listEmpleadosAlmacen.add(ithem);
					}else if(identificador.equalsIgnoreCase("EV")) {
					listEmpleadosVentas.add(ithem);
					}			
			i++;
			}
		
		listGerentes.get(0).setListEmpleados(listEmpleadosFinanzas);
		listGerentes.get(1).setListEmpleados(listEmpleadosProduccion);
		listGerentes.get(2).setListEmpleados(listEmpleadosRrhh);
		listGerentes.get(3).setListEmpleados(listEmpleadosAlmacen);
		listGerentes.get(4).setListEmpleados(listEmpleadosVentas);
		
		listAreas.get(0).setGerente(listGerentes.get(0));
		listAreas.get(1).setGerente(listGerentes.get(1));
		listAreas.get(2).setGerente(listGerentes.get(2));
		listAreas.get(3).setGerente(listGerentes.get(3));
		listAreas.get(4).setGerente(listGerentes.get(4));
		
//		for(Area ithem : listAreas) {
//			System.out.println(ithem);
//		}
		Filtros.filtros (listAreas);
	}
		
} // de lA CLASE 
