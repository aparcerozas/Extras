/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exhashmap2;

import java.util.ArrayList;

/**
 *
 * @author aparcerozas
 */
public class ClassList implements InterfaceList {
    public ArrayList<String> a = new ArrayList<>();

    @Override
    public void putElement(String valor) {
        a.add(valor);
    }

    @Override
    public String getElement(int posicion) {
        return a.get(posicion);
    }
}
