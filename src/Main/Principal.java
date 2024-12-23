package Main;

import java.util.Scanner;

import Dominio.Casas;
import Implementacion.LogicaMetodos;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar las variables
		Scanner lectura = null;

		int numeroCasa, menuPrinc, subMenu, indice;
		float precio;
		String tipoCasa;
		String dimensiones;

		Casas casa = null;

		// Instancia de clase
		LogicaMetodos imp = new LogicaMetodos();

		do {
			System.out.println("***MENU PRINCIPAL");
			System.out.println("1.-ALTA");
			System.out.println("2.-MOSTRAR");
			System.out.println("3.-BUSCAR");
			System.out.println("4.-EDITAR");
			System.out.println("5.-ELIMINAR");
			System.out.println("6---BUSCAR POR NUM.CASA");
			System.out.println("7---BUSCAR POR TIPO");
			System.out.println("8---CALCULAR DINERO INVERTIDO");
			System.out.println("9----ELIMINAR POR NUM. CASA");
			System.out.println("10.-EDITAR PRECIO BUSCANDO POR NUM. DE CASA");
			System.out.println("11---SALIR");

			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();

			switch (menuPrinc) {
			case 1:
				try {
					System.out.println("Ingresa el numero de casa");
					lectura = new Scanner(System.in);
					numeroCasa = lectura.nextInt();

					System.out.println("Ingresa el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					System.out.println("Ingresa el tipo de casa");
					lectura = new Scanner(System.in);
					tipoCasa = lectura.nextLine();

					System.out.println("Ingresa las dimensiones");
					lectura = new Scanner(System.in);
					dimensiones = lectura.nextLine();

					// Declarar el objeto con todos los atributos
					casa = new Casas(numeroCasa, precio, tipoCasa, dimensiones);

					// Agregar a la lista
					imp.guardar(casa);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar: " + e.getMessage());
				}

				break;

			case 2:
				if (imp.mostrar().size() > 0) {
					System.out.println(imp.mostrar());
				} else {
					System.out.println("No hay registros en las listas");
				}

				break;

			case 3:
				try {
					System.out.println("Ingresa el indice a buscar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// buscar
					System.out.println(imp.buscar(indice));

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar");
				}
				break;

			case 4:
				try {
					System.out.println("Ingresa el indice a EDITAR");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// buscar
					casa = imp.buscar(indice);
					System.out.println("Se encontro: " + casa);

					// Editar---submenu numCasa, precio
					do {
						System.out.println("***SUB MENU PARA EDITAR");
						System.out.println("1.-EDITAR NUM DE CASA");
						System.out.println("2.-EDITAR PRECIO");
						System.out.println("3.-REGRESAR A MENU PRINCIPAL");

						lectura = new Scanner(System.in);
						subMenu = lectura.nextInt();

						switch (subMenu) {
						case 1:
							System.out.println("ingresa el nuevo numero de casa");
							lectura = new Scanner(System.in);
							numeroCasa = lectura.nextInt();

							// Actualizacion
							casa.setNumeroCasa(numeroCasa);
							imp.editar(indice, casa);
							System.out.println("Se edito el numero de casa con exito");
							break;

						case 2:
							System.out.println("ingresa el nuevo precio");
							lectura = new Scanner(System.in);
							precio = lectura.nextInt();

							// Actualizacion
							casa.setPrecio(precio);
							imp.editar(indice, casa);
							System.out.println("Se edito el precio con exito");
							break;

						case 3:
							break;

						}

					} while (subMenu < 3);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar para editar");
				}

				break;

			case 5:
				try {
					System.out.println("ingresa el indice a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// eliminar
					imp.eliminar(indice);
					System.out.println("Se elimino con exito");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al eliminar");
				}

				break;

			case 6:
				try {
					System.out.println("Ingresa el numero de casa a buscar");
					lectura = new Scanner(System.in);
					numeroCasa = lectura.nextInt();

					// buscar
					casa = imp.buscarXNumCasa(numeroCasa);

					if (casa == null) {
						System.out.println("No existe ese numero de casa");
					} else {
						System.out.println("Registro encontrado: " + casa);
					}

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar" + e.getMessage());
				}
				break;

			case 7:
				try {
					System.out.println("Ingresa el tipo de casa a buscar");
					lectura = new Scanner(System.in);
					tipoCasa = lectura.nextLine();

					// buscar
					System.out.println(imp.buscarXTipoCasa(tipoCasa));

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar " + e.getMessage());
				}

				break;

			case 8:
				
				
				
				break;

			case 9:
				try {
					System.out.println("Ingresa el numero de casa a eliminar");
					lectura = new Scanner(System.in);
					numeroCasa = lectura.nextInt();
					
					//eliminar
					imp.eliminarXNumCasa(numeroCasa);
					System.out.println("Registro eliminado");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al elimnar " + e.getMessage());
				}

				break;

			case 10:
				try {
					System.out.println("Ingresa el numer de casa a editar");
					lectura = new Scanner(System.in);
					numeroCasa = lectura.nextInt();

					// buscar
					casa = imp.buscarXNumCasa(numeroCasa);
					System.out.println("Se encontro: " + casa);
					
					System.out.println("ingresa el nuevo precio de casa");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();
					casa.setPrecio(precio);
					imp.editarXNumCasa(numeroCasa, casa);
					
					System.out.println("Precio actualizado");
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				break;
				
			case 11:
				System.out.println("Nos vemos !!");
				break;

			}

		} while (menuPrinc < 11);

	}

}
