package com.prueba.alcancia.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.prueba.alcancia.modelo.Moneda;
import com.prueba.alcancia.repositorio.MonedaRepositorio;

@Service
public class MonedaServicio {

	@Autowired
	private MonedaRepositorio monedaRepositorio;

	// public void guardarMoneda(Moneda moneda) {

	// monedaRepositorio.save(moneda);

	// }
	
	public Integer cuandoLaMonedaEsCorrecta(Integer valorMoneda) {
		
		
		
		
		return  monedaRepositorio.insertarMoneda(valorMoneda);
	
			
	}


	public Long totalCantidadMonedas() {

		return monedaRepositorio.count();

	}

	public Integer sumaCantidadDineroTotal() {

		return monedaRepositorio.sumaCantidadDineroTotal();
	}

	public Integer cantidadMonedasPorDenominacion(int valorMoneda) {

		return monedaRepositorio.cantidadMonedasPorDenominacion(valorMoneda);
	}
	
	public Integer sumaMonedasPorDenominacion(int valorMoneda) {
		
		return monedaRepositorio.sumaMonedasPorDenominacion(valorMoneda);
	}


}
