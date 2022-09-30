/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio06practico;

import Cafetera.Cafetera;
import CafeteraService.CafeteraService;

/**
 *
 * @author diego
 */
public class POOEjercicio06Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //
       CafeteraService cs = new CafeteraService();
      Cafetera c = new Cafetera(30,0);
       cs.llenarCafetera(c);
       cs.servirTaza(c);
       cs.vaciarCafetera(c);
       cs.agregarCafe(c);
    
}
}