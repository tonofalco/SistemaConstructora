package Interface;

import java.util.List;

import Dominio.Casas;

public interface MetodosDos {
	
	public Casas buscarXNumCasa(int numeroCasa);
	
	public List<Casas> buscarXTipoCasa(String tipoCasa);
	
	public void eliminarXNumCasa(int numeroCasa);
	
	
	
	public void editarXNumCasa(int numeroCasa, Casas casa);

}
