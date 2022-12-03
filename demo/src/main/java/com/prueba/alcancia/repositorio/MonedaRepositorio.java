package com.prueba.alcancia.repositorio;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prueba.alcancia.modelo.Moneda;
@Repository
public interface MonedaRepositorio extends JpaRepository<Moneda, Integer> {
	
	 @Transactional
	 @Modifying
	 @Query (value = "INSERT INTO moneda (valor) VALUES (:valorMoneda)" , nativeQuery = true )
	 public Integer insertarMoneda(@Param("valorMoneda") Integer valorMoneda);
	
	
	 @Query(value = "SELECT sum(valor) FROM Moneda")
	    public Integer sumaCantidadDineroTotal();
	 
	 
	 
	 @Query(value = "SELECT count(*) FROM Moneda where valor =?1")
	    public Integer cantidadMonedasPorDenominacion(int valorMoneda);
	
	 @Query(value = "SELECT sum(valor) FROM Moneda where valor =?1")
	    public Integer sumaMonedasPorDenominacion(int valorMoneda);
	 

}
