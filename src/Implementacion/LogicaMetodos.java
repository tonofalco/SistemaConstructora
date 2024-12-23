package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Casas;
import Interface.Metodos;
import Interface.MetodosDos;

public class LogicaMetodos implements Metodos, MetodosDos{
	
	private List<Casas> lista = new ArrayList<Casas>();

	@Override
	public void guardar(Casas casa) {
		// TODO Auto-generated method stub
		boolean bandera = false;
		
		for (Casas c : lista) {
			if(c.getNumeroCasa() == casa.getNumeroCasa()) {
				System.out.println("ya existe ese numero de casa");
				bandera = true;
				break;
			}
		}
		
		if(bandera == false) {
			lista.add(casa);
			System.out.println("Se guardo el registro con exito");
		}
		
		
	}

	@Override
	public List<Casas> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Casas buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, Casas casa) {
		// TODO Auto-generated method stub
		lista.set(indice, casa);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
		
	}
	
	//METODOS---DOS

	@Override
	public Casas buscarXNumCasa(int numeroCasa) {
		// TODO Auto-generated method stub
		for (Casas c : lista) {
			if (c.getNumeroCasa() == numeroCasa) {
				return c;
			}
		}
		return null;
	}

	@Override
	public List<Casas> buscarXTipoCasa(String tipoCasa) {
		// TODO Auto-generated method stub
		List<Casas> listaNueva = new ArrayList<Casas>();
		
		for (Casas c : lista) {
			if (c.getTipoCasa().equalsIgnoreCase(tipoCasa)) {
				listaNueva.add(c);
			}
		}
		return listaNueva;
	}

	@Override
	public void eliminarXNumCasa(int numeroCasa) {
		// TODO Auto-generated method stub
		for (Casas c : lista) {
			if (c.getNumeroCasa() == numeroCasa) {
				lista.remove(c);
				break;
			}
		}

	}

	@Override
	public void editarXNumCasa(int numeroCasa, Casas casa) {
		// TODO Auto-generated method stub
		for (Casas c : lista) {
			if (c.getNumeroCasa() == numeroCasa) {
				lista.set(c.getNumeroCasa(), casa);
				break;
			}
			
		}
		
	}

}



