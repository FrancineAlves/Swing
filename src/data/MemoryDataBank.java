/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.List;
import model.Programador;

/**
 *
 * @author crfranco
 */
public class MemoryDataBank implements IDao<Programador>{
    
    private List<Programador> memoryDataBank = new ArrayList<>(); 

    @Override
    public void save(Programador t) {
        this.memoryDataBank.add(t);
    }

    @Override
    public List<Programador> getOne(String nome) {
        
         List<Programador> lista = new ArrayList<Programador>();
         
        Programador programador = new Programador();
	
			for(Programador p: memoryDataBank) {
                                if (p.getNome().contains(nome)){
                                    lista.add(p);
                                };
			}
		return lista;	
    }

    @Override
    public List<Programador> list() {
        return memoryDataBank;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Programador t) {
        if (memoryDataBank.contains(t)){
            int posicao = memoryDataBank.indexOf(t);
            delete(t);
            memoryDataBank.add(posicao, t);
        }else{
            this.save(t);
        }
    }

    @Override
    public void delete(Programador p) {
        memoryDataBank.remove(p);
    }
    
}
