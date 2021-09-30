package com.company.utileria;

import com.company.model.DatosCajero;

import java.util.ArrayList;
import java.util.List;

public class utileria {

    private DatosCajero listaCajero;

    /*En la clase utileria vamos a crear una función que llene mi modelo del objeto datos cajero*/

    public List<DatosCajero> getListCajero(){

        /*Declaramos la lista del objeto*/

        List<DatosCajero> listaCajero = new ArrayList<DatosCajero>();

        /*Crearemos ls lista de datos de objetos*/

        DatosCajero denominacion1 = new DatosCajero();
        denominacion1.setDenominacion(1000);
        denominacion1.setCantidad(2);
        denominacion1.setTipo("Billete");

        DatosCajero denominacion2 = new DatosCajero();
        denominacion2.setDenominacion(500);
        denominacion2.setCantidad(5);
        denominacion2.setTipo("Billete");

        DatosCajero denominacion3 = new DatosCajero();
        denominacion3.setDenominacion(200);
        denominacion3.setCantidad(10);
        denominacion3.setTipo("Billete");

        DatosCajero denominacion4 = new DatosCajero();
        denominacion4.setDenominacion(100);
        denominacion4.setCantidad(20);
        denominacion4.setTipo("Billete");

        DatosCajero denominacion5 = new DatosCajero();
        denominacion5.setDenominacion(50);
        denominacion5.setCantidad(30);
        denominacion5.setTipo("Billete");

        DatosCajero denominacion6 = new DatosCajero();
        denominacion6.setDenominacion(20);
        denominacion6.setCantidad(40);
        denominacion6.setTipo("Billete");

        DatosCajero denominacion7 = new DatosCajero();
        denominacion7.setDenominacion(10);
        denominacion7.setCantidad(50);
        denominacion7.setTipo("Moneda");

        DatosCajero denominacion8 = new DatosCajero();
        denominacion8.setDenominacion(5);
        denominacion8.setCantidad(100);
        denominacion8.setTipo("Moneda");

        DatosCajero denominacion9 = new DatosCajero();
        denominacion9.setDenominacion(2);
        denominacion9.setCantidad(200);
        denominacion9.setTipo("Moneda");

        DatosCajero denominacion10 = new DatosCajero();
        denominacion10.setDenominacion(1);
        denominacion10.setCantidad(300);
        denominacion10.setTipo("Moneda");

        DatosCajero denominacion11 = new DatosCajero();
        denominacion11.setDenominacion(0.5f);
        denominacion11.setCantidad(100);
        denominacion11.setTipo("Moneda");

        listaCajero.add(denominacion1);
        listaCajero.add(denominacion2);
        listaCajero.add(denominacion3);
        listaCajero.add(denominacion4);
        listaCajero.add(denominacion5);
        listaCajero.add(denominacion6);
        listaCajero.add(denominacion7);
        listaCajero.add(denominacion8);
        listaCajero.add(denominacion9);
        listaCajero.add(denominacion10);
        listaCajero.add(denominacion11);

        return listaCajero;

    }
}
