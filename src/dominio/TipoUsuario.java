/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author seba
 */

public enum TipoUsuario {
    PROFESIONAL {
        @Override 
        public String toString() {
            return "Profesional";
        }
    },
    USUARIO {
        @Override 
        public String toString() {
            return "Usuario";
        }
    },
    NO_SELECCIONADO {
        @Override 
        public String toString() {
            return "No Seleccionado";
        }
    }
}
