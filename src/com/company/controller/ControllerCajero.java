package com.company.controller;

import com.company.model.DatosCajero;
import com.company.utileria.utileria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerCajero {

    private String monto_retirar_cadena;
    private Double monto_retirar;
    private DatosCajero listaDenominaciones;

    /*Funcion general del modulo para invocacion*/
    public void index(){

        System.out.println("****Escribe el monto a retirar****");

        /*Declaramos la clase con el objeto*/
        Scanner console = new Scanner(System.in);
        monto_retirar_cadena = console.nextLine();
        monto_retirar=Double.parseDouble(monto_retirar_cadena);

        System.out.println("El monto a retirar es: "+monto_retirar);

        if (monto_retirar>12550){
            System.out.println("El monto de la cantidad a retirar sobrepasa la capacidad del cajero porfavor visitanos en otro momento.");
        }
        else{
            transaction();
        }
    }

    public void transaction(){

        /*Creamos una funcion que realize el retiro de la cantidad principal.*/
        utileria util = new utileria();

        /*La delcaramos a nivel clase la lista de denominaciones*/
        List<DatosCajero> listaDenominaciones = new ArrayList<DatosCajero>();
        listaDenominaciones=util.getListCajero();

        /* Crearremos una lista con los datos siguientes */
        List<DatosCajero> denominaciones_descontadas = new ArrayList<DatosCajero>();

        /*Mostramos la lista original*/
        System.out.println("****************   Datos Previos a la transacción   *******************");

        for (DatosCajero index : listaDenominaciones) {
            System.out.println("El tipo: " + index.getTipo() + ", La cantidad: " + index.getCantidad() + "  La denominacion es: " + index.getDenominacion());
        }

        for (DatosCajero index : listaDenominaciones){

            /*Sacamos el numero de veces aproximado a recorrer para restar cantidad*/
            /*Para esto dividimos el monto retirar diviendo entre las denominaciones*/

            double recorrer=Math.floor(monto_retirar/index.getDenominacion());

            if (monto_retirar>=index.getDenominacion() && index.getCantidad()>0){

                for (int indice=1; indice<=recorrer; indice++) {

                    if (index.getCantidad()>0){
                        /*Restamos el monto para validar el tipo de moneda consecutiva*/
                        monto_retirar=monto_retirar-index.getDenominacion();

                        /*Descontamos los valores en la lista el tipo de cantidad del billete a descontar*/
                        index.setCantidad(index.getCantidad()-1);

                        /*Obtenemos una lista denominaciones para mostrarlas en consola*/
                        denominaciones_descontadas.add(index);
                    }
                }
            }
        }

        /*Mostramos la lista rescrita*/
        System.out.println("****************   Datos Previos despues de modificar   *******************");

        for (DatosCajero index : listaDenominaciones) {
            System.out.println("El tipo: " + index.getTipo() + ", La cantidad: " + index.getCantidad() + "  La denominacion es: " + index.getDenominacion());
        }

        /*Mostramos la denominaciones actualizadas*/
        System.out.println("****************   Cambio del retiro   *******************");
        String mensaje_cambio="EL cambio devuelto por el cajero es el siguiente: ";

        for (DatosCajero index : denominaciones_descontadas){
            mensaje_cambio=mensaje_cambio+index.getTipo()+" "+index.getDenominacion()+", ";
        }

        System.out.println(mensaje_cambio);
    }
}
