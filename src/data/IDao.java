/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author crfranco
 */
import java.util.List;

public interface IDao <T>{ // generics
	
	void save(T t);
	
	List<T> getOne(String nome);
	
	List<T> list();
	
	void update (T t);
	
	void delete (T t);

}
