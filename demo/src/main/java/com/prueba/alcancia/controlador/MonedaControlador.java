package com.prueba.alcancia.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.alcancia.condicional.ManejadorGuardarMoneda;
import com.prueba.alcancia.modelo.Moneda;
import com.prueba.alcancia.servicio.MonedaServicio;

@RestController
@RequestMapping(value="/moneda")
public class MonedaControlador {
	@Autowired
	 private ManejadorGuardarMoneda manejadorGuardarMoneda;
	 
	@Autowired
	private MonedaServicio monedaServicio;
	
	
	@PostMapping("/guardar")
	
	public String  guardarMoneda(@RequestBody Moneda moneda) {
		
	 return	this.manejadorGuardarMoneda.ejecutar(moneda.getValor());			
			
		
	 
	 
	}
	
	@GetMapping("/total-monedas")
	public Long totalMoneda() {
		
		return monedaServicio.totalCantidadMonedas();
	
	}
	
	@GetMapping("/total-dinero")
	public Integer totalDinero()
	{
		
		 return monedaServicio.sumaCantidadDineroTotal(); 
	}
	
	
	@GetMapping("/cantidad-monedas-denominacion/{valorMoneda}")
	public Integer cantidadMonedaPorDenominacion(@PathVariable ("valorMoneda") Integer valorMoneda)
	{
		
		 return monedaServicio.cantidadMonedasPorDenominacion(valorMoneda); 
	}
	
	
	

	@GetMapping("/suma-monedas-denominacion/{valorMoneda}")
	public Integer sumaMonedasPorDenominacion(@PathVariable ("valorMoneda") Integer valorMoneda)
	{
		
		 return monedaServicio.sumaMonedasPorDenominacion(valorMoneda); 
	}

}
