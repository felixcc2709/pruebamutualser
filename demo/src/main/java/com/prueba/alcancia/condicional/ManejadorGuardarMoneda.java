package com.prueba.alcancia.condicional;

import java.beans.JavaBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.prueba.alcancia.servicio.ServicioValidadorMoneda;

@Component
public class ManejadorGuardarMoneda {
	
@Autowired 

 private ServicioValidadorMoneda servicioValidadorMoneda;	
 
	
 
 
 
	//public ManejadorGuardarMoneda(ServicioValidadorMoneda servicioValidadorMoneda) {

		//	this.servicioValidadorMoneda = servicioValidadorMoneda;
//}





	public ManejadorGuardarMoneda() {
	// TODO Auto-generated constructor stub
}





	public String ejecutar(Integer valorMoneda) {	
		
		
				
		Integer respuesta= this.servicioValidadorMoneda.ejecutar(valorMoneda);
		
		System.out.print(respuesta);
		
		if(respuesta>0) {
			
	
			 
			return "La  moneda ha sido agregada"; 
		} 
		
		 return "La moneda no es perminitada no se agrego";
		
	}
	
	
}
