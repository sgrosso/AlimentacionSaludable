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

public enum Nutrientes {
    PROTEINAS {
        @Override
        public String toString() {
            return "Proteínas";
        }
    },
    LIPIDOS {
        @Override
        public String toString() {
            return "Lípidos";
        }
    },
    HIDRATOS_DE_CARBONO  {
        @Override
        public String toString() {
            return "Hidratos de Carbono";
        }
    },
    VITAMINAS {
        @Override
        public String toString() {
            return "Vitaminas";
        }
    },
    MINERALES  {
        @Override
        public String toString() {
            return "Minerales";
        }
    },
    AGUA {
        @Override
        public String toString() {
            return "Agua";
        }
    },
    FIBRA  {
        @Override
        public String toString() {
            return "Fibra";
        }
    },
    NINGUNA {
        @Override
        public String toString() {
            return "Ninguna";
        }
    }
}
