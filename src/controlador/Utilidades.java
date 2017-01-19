/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 *
 * @author AngelEduardo
 */
public class Utilidades {

    public static void ValidarSoloNumeros(KeyEvent Event) {
        if (!Character.isDigit(Event.getKeyChar())) {
            Event.consume();
            Toolkit.getDefaultToolkit().beep();
        }

    }

}
