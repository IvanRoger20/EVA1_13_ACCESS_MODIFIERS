/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_access_modifiers;

import Vehiculos_Sin_Motor.Bicicleta;

/**
 *
 * @author IvanTron
 */
public class EVA1_13_ACCESS_MODIFIERS {

    public static void main(String[] args) {
        Automovil miCarro = new Automovil();
        miCarro.setAño(2000);
        miCarro.imprimirMensaje();
        Bicicleta miBici = new Bicicleta();
        Carreta miCarreta = new Carreta();
    }
    
}
