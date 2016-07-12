package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CocheRepository extends JpaRepository<Coche, Long>
{
    List<Coche> findByMarca (String marca);

    List<Coche> findByModelo (String modelo);

    List<Coche> findByAñoGreaterThanEqual (Integer año);

    List<Coche> findByAñoLessThanEqual (Integer año);

    List<Coche> findByAñoBetween (Integer añoMin, Integer añoMax);

    List<Coche> findByPrecio (Integer precio);

    List<Coche> findByPrecioGreaterThanEqual (Integer precio);

    List<Coche> findByPrecioLessThanEqual (Integer precio);

    List<Coche> findByPrecioBetween (Integer precioMin, Integer precioMax);

    Coche findByMatricula (String matricula);

    List<Coche> findByMarcaAndModelo (String marca, String modelo);

    List<Coche> findByMarcaAndPrecioLessThanEqual (String marca, Integer precio);

    @Query ("SELECT AVG (c. precio) from Coche c where c.marca = :marca")
    Double obtenerMediaPorMarca (@Param("marca") String marca);
}