/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exhashmap2;

import java.util.HashMap;

/**
 *
 * @author aparcerozas
 */
public class ClassHash implements InterfaceHash {
    public HashMap<Integer,String> h = new HashMap<>();

    @Override
    public void putValue(Integer clave, String valor) {
        h.put(clave, valor);
    }

    @Override
    public String getValue(Integer clave) {
        return h.get(clave);
    }
}
