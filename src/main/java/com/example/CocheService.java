package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CocheService
{
@Autowired
    private CocheRepository cocheRepository;

    public void testCoches()
    {

        Coche coche = new Coche();
        coche.setAño(2015);
        coche.setMarca ("Abarth");
        coche.setModelo("124 spider");
        coche.setPrecio(40000);
        coche.setMatricula("4586B");
        cocheRepository.save(coche);

        Coche coche2 = new Coche();
        coche2.setAño(2010);
        coche2.setMarca ("Alfa Romeo");
        coche2.setModelo("Giulieta");
        coche2.setPrecio(21000);
        coche2.setMatricula("7896L");
        cocheRepository.save(coche2);

        Coche coche3 = new Coche();
        coche3.setAño(2012);
        coche3.setMarca ("Aston Martin");
        coche3.setModelo("V8 Vantage");
        coche3.setPrecio(132000);
        coche3.setMatricula("2356K");
        cocheRepository.save(coche3);

        Coche coche4 = new Coche();
        coche4.setAño(2016);
        coche4.setMarca ("Bugati");
        coche4.setModelo("Chiron");
        coche4.setPrecio(2900000);
        coche4.setMatricula("5631M");
        cocheRepository.save(coche4);

        Coche coche5 = new Coche();
        coche5.setAño(2016);
        coche5.setMarca ("Bugati");
        coche5.setModelo("Chiron");
        coche5.setPrecio(2900000);
        coche5.setMatricula("5631M");
        cocheRepository.save(coche5);

        Coche coche6 = new Coche();
        coche6.setAño(2008);
        coche6.setMarca ("Ferrari");
        coche6.setModelo("California T");
        coche6.setPrecio(214000);
        coche6.setMatricula("5697T");
        cocheRepository.save(coche6);

        Coche coche7 = new Coche();
        coche7.setAño(2012);
        coche7.setMarca ("Ferrari");
        coche7.setModelo("FF");
        coche7.setPrecio(630000);
        coche7.setMatricula("4789N");
        cocheRepository.save(coche7);


        System.out.println(cocheRepository.findOne(2L));
        System.out.println(cocheRepository.findByMarca("Abarth"));

        System.out.println("Mostrar todos los coches cuyo año de fabricación sea >= a 2005: ");
        System.out.println(cocheRepository.findByAñoGreaterThanEqual(2005));

        System.out.println("Mostrar todos los coches cuyo año de fabricación sea <= a 2016: ");
        System.out.println(cocheRepository.findByAñoLessThanEqual(2016));

        System.out.println("Mostrar todos los coches cuyo año de fabricación se encuentre entre 2010 y 2016: ");
        System.out.println(cocheRepository.findByAñoBetween(2010, 2016));

        System.out.println("Mostrar todos los coches cuyo precio sea >= a 35000: ");
        System.out.println(cocheRepository.findByPrecioGreaterThanEqual(35000));

        System.out.println("Mostrar todos los coches cuyo precio sea <= a 130000");
        System.out.println(cocheRepository.findByPrecioLessThanEqual(130000));

        System.out.println("Mostrar todos los coches cuyo precio se encuentre entre 50000 y 150000");
        System.out.println(cocheRepository.findByPrecioBetween(50000, 150000));

        System.out.println("Mostrar la matricula del Aston Martin: ");
        System.out.println(cocheRepository.findByMatricula("2356K"));

        System.out.println("Mostrar todos los coches Bugati: ");
        System.out.println(cocheRepository.findByMarca("Bugati"));

        System.out.println("Mostrar todos los coches Alfa Romeo Guilieta");
        System.out.println(cocheRepository.findByMarcaAndModelo("Alfa Romeo", "Guilieta"));

        System.out.println("Mostrar todos los Abarth con un precio inferior a 50000");
        System.out.println(cocheRepository.findByMarcaAndPrecioLessThanEqual("Abarth", 50000));

        System.out.println("La media del precio de los coches Ferrari es: ");
        System.out.println(cocheRepository.obtenerMediaPorMarca("Ferrari"));









    }



}