import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerArchivo {
	static char puesto,area;
	public static void filtrarCargosEmpresa (List<String>fileEmpleados,List<String>fileAreas){
		List<String> listEmpleados    = new ArrayList <>();
		List<String> listGerentes     = new ArrayList <>();
		List<String> listNoAsignados  = new ArrayList <>();
		List<String> listAreas        = new ArrayList <>();
		int contador=0;
		for(String ithem : fileEmpleados) {
			contador++;
			   puesto = ithem.charAt(0);
			  if (puesto == 'E') {
				  listEmpleados.add(ithem);
			  }else if(puesto == 'G'){
				  listGerentes.add(ithem );
			  }else {listNoAsignados.add("no asignado en linea :" + contador + " " + ithem);
			  } 
		}
			 
		 for(String area : fileAreas) {
			  listAreas.add(area);
		  }
			  
		 crearPersonalAreas (listEmpleados,listGerentes,listAreas);
		
		 for(String noAsignados :listNoAsignados) {
			//System.out.println(noAsignados );
		}
	}
	public static void crearPersonalAreas (List<String>fileEmpleados,List<String>fileGerentes,List<String>fileAreas) {
		List<Empleado> listEmpleados = new ArrayList<>();
		List<Gerente>  listGerentes  = new ArrayList<>();
		List<Area>     listAreasNew  = new ArrayList<>();
		int i;
		for (i=0; i<fileEmpleados.size(); i++) {
			Empleado  empleado = new Empleado ();
			String [] cadenaRenglones = fileEmpleados.get(i).split("//");
			empleado.setIdentificador  (cadenaRenglones[0]);
			empleado.setNombre         (cadenaRenglones[1]);
			empleado.setApellidoPaterno(cadenaRenglones[2]);
			empleado.setApellidoMaterno(cadenaRenglones[3]);
			empleado.setDirreccion     (cadenaRenglones[4]);
			empleado.setTelefono       (cadenaRenglones[5]);
			empleado.setEdad           (cadenaRenglones[6]);
			empleado.setIdTrabajador   (cadenaRenglones[7]);
			empleado.setFechaIngreso   (cadenaRenglones[9]);
			empleado.setSueldo         (cadenaRenglones[10]);
			listEmpleados.add(empleado);
		}
		
		for ( i=0; i<fileGerentes.size(); i++) {
			Gerente  gerente = new Gerente ();
			String [] cadenaRenglones = fileGerentes.get(i).split("//");
			gerente.setIdentificador  (cadenaRenglones[0]);
			gerente.setNombre         (cadenaRenglones[1]);
			gerente.setApellidoPaterno(cadenaRenglones[2]);
			gerente.setApellidoMaterno(cadenaRenglones[3]);
			gerente.setDirreccion     (cadenaRenglones[4]);
			gerente.setTelefono       (cadenaRenglones[5]);
			gerente.setEdad           (cadenaRenglones[6]);
			gerente.setIdTrabajador   (cadenaRenglones[7]);
			gerente.setFechaIngreso   (cadenaRenglones[9]);
			gerente.setSueldo         (cadenaRenglones[10]);
			listGerentes.add(gerente);
		}
		
		for (i=0; i<fileAreas.size(); i++) {
			Area  newAreaEmpresa = new Area ();
			String [] cadenaRenglones = fileAreas.get(i).split("//");
			newAreaEmpresa.setIdentificadorArea(cadenaRenglones[0]);
			newAreaEmpresa.setNombreArea       (cadenaRenglones[1]);
			newAreaEmpresa.setNumEmpleados     (cadenaRenglones[2]);
			newAreaEmpresa.setPresupuesto      (cadenaRenglones[3]);
			listAreasNew.add(newAreaEmpresa);
		}
		ConstruirArea.separaEpleadosGerentesAreas(listAreasNew, listGerentes, listEmpleados);
	} 
	
	public static List<String>  leerArchivos(String urlFile) {	
		 String linea="";
		 List<String> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader (new FileReader(urlFile))){
			while((linea = br.readLine()) !=null ) {
				linea = String.valueOf(linea);
				list.add(linea);
			}    		
		}catch (IOException e) {
			System.out.println("ERROR: "+e.getMessage()); 
		}    	
		return list;	
	}

	
}//fin  de la  clase
