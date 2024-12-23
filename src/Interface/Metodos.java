package Interface;

import java.util.List;

import Dominio.Casas;

public interface Metodos {
	
	public void guardar(Casas casa);
	
	public List<Casas> mostrar();
	
	public Casas buscar(int indice);
	
	public void editar(int indice, Casas casa);
	
	public void eliminar(int indice);

}
