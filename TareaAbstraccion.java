/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareaabstraccion;

/**
 *
 * @author vmbv2
 */
public class TareaAbstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Honduras hn = new Honduras();
        Mexico mx = new Mexico();
        Brasil br = new Brasil();

        System.out.println("---------------------------------");
        System.out.println(hn.getPais());
        System.out.println(hn.getPresidente());
        System.out.println("---------------------------------");
        System.out.println(mx.getPais());
        System.out.println(mx.getPresidente());
        System.out.println("---------------------------------");
        System.out.println(br.getPais());
        System.out.println(br.getPresidente());
        System.out.println("---------------------------------");
    }

}
