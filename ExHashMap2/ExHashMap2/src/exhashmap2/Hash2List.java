/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exhashmap2;

import java.util.Iterator;

/**
 *
 * @author aparcerozas
 */
public class Hash2List extends ClassList {
    public Hash2List(ClassHash hash){
        Iterator t = hash.h.keySet().iterator();
        while(t.hasNext()){
            a.add(hash.h.get(t.next()));
        }
    }
    
    
}
