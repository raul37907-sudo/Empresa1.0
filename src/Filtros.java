import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Filtros {

	public static void filtros (List<Area>listEmpresaCompleta){
		
		@SuppressWarnings("resource")
		Scanner entraDato = new Scanner (System.in);
			int opcion;
			while(true) {
				System.out.println(" \n 1 - BUSCAR EMPLEADO ");
				System.out.println(" \n 2 - BUSCAR GERENTE ");
				System.out.println("  - TIEMPO EN LA EMPRESA  ");
				System.out.println("  - BUSCAR EMPLEADO ");
				System.out.println("  -  ");
				
				opcion = entraDato.nextInt();
			
				switch(opcion) {
				case 1:
					System.out.println("BUSCANDO  EMPLEADO");
					buscarEmpleado(entraDato,listEmpresaCompleta);					
					break;
				case 2:
					System.out.println("BUSCANDO  GERENTE ");
					buscarGerente(entraDato,listEmpresaCompleta);
					
					break;
				case 3:
					System.out.println("ANTIGUEDAD DE EMPLEADO ES ");
					
					break;
				case 4:
					
					default : System.out.println(" <=== ESA  OPCIÓN NO  ESTA DISPONIBLE ===>");
				}
	
		   }
	}
	
	public static void buscarEmpleado (Scanner entraDato,List<Area>listEmpresaCompleta) {
		List<Empleado> listBuscar = new ArrayList<>();
		String elementoBuscar = "";
		System.out.println("COMIENZA TU  BUSQUEDA POR NOMBRE " + "\n");	
		elementoBuscar = entraDato.next();
		int i=0,j=0 ;
		for(i=0; i<listEmpresaCompleta.size() ; i++ ) {
			for (j=0; j<listEmpresaCompleta.get(i).getGerente().getListEmpleados().size();j++) {
			
				if (listEmpresaCompleta.get(i).getGerente().getListEmpleados().get(j).getNombre().toLowerCase().contains(elementoBuscar.toLowerCase()) ){
			    	listBuscar.add(listEmpresaCompleta.get(i).getGerente().getListEmpleados().get(j));
			    }	
			}
		}
		if(listBuscar.isEmpty()) {
			System.out.println(" NO  SE ENCONTRO  REGISTRO PARECIDO  A : " + elementoBuscar);
		}
		System.out.println(listBuscar);
	}
	
	public static void buscarGerente (Scanner entraDato,List<Area>listEmpresaCompleta) {
			List<Gerente> listBuscar = new ArrayList<>();
			String elementoBuscar = "";
			System.out.println("COMIENZA TU  BUSQUEDA POR NOMBRE  " + "\n ");	
			elementoBuscar = entraDato.next();
			int i=0;
			for(i=0; i<listEmpresaCompleta.size() ; i++ ) {
				
					if (listEmpresaCompleta.get(i).getGerente().getNombre().toLowerCase().contains(elementoBuscar) ){  
				    	listBuscar.add(listEmpresaCompleta.get(i).getGerente());
				}
			}
			Salidas.SalidaGerentes (listBuscar);
			if(listBuscar.isEmpty()) {
				System.out.println(" NO  SE ENCONTRO  REGISTRO PARECIDO  A : " + elementoBuscar);
			}
			//System.out.println(listBuscar);
		
	}
}
