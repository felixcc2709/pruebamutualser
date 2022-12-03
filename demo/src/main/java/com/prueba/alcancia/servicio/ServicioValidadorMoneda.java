package com.prueba.alcancia.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ServicioValidadorMoneda {
	
	
	@Autowired
	private MonedaServicio monedaServicio;
	
	
	public Integer ejecutar(Integer valorMoneda) {
		
		 
		 if(valorMoneda==50) {
			 
			return monedaServicio.cuandoLaMonedaEsCorrecta(valorMoneda);
			
		 }
		 
	
		 if(valorMoneda==100) {
			 
				return monedaServicio.cuandoLaMonedaEsCorrecta(valorMoneda);
		 }
		 
		 if(valorMoneda==200) {
				return monedaServicio.cuandoLaMonedaEsCorrecta(valorMoneda);
		 }
		 
		 if(valorMoneda==500) {
				return monedaServicio.cuandoLaMonedaEsCorrecta(valorMoneda);
		 }
		 
		 if(valorMoneda==1000) {
				return monedaServicio.cuandoLaMonedaEsCorrecta(valorMoneda);
		 }
		
		 
		
		 return 0;
	}
}

		
	
	


