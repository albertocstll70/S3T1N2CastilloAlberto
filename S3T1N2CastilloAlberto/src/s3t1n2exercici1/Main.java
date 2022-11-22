package s3t1n2exercici1;

import java.util.ArrayList;
import java.util.Scanner;

import s3t1n2exercici1.implementacion.Factory;
import s3t1n2exercici1.implementacion.FactoryPrefijo;

public class Main {

	public static void main(String[] args) {

		ArrayList<Agenda> listRegistro = new ArrayList<Agenda>();
		
		Agenda registro1 = new Agenda("calle 1",addPrefijo("america","ecuador")+"123456789");
		Agenda registro2 = new Agenda("calle 2",addPrefijo("america","canada")+"246810121");
		Agenda registro3 = new Agenda("calle 3",addPrefijo("africa","burundi")+"12451223");
		Agenda registro4 = new Agenda("calle 4",addPrefijo("africa","mali")+"2040305060");
		Agenda registro5 = new Agenda("calle 5",addPrefijo("europa","alemania")+"123456789");
		Agenda registro6 = new Agenda("calle 6",addPrefijo("europa","españa")+"123456789");
		Agenda registro7 = new Agenda("calle 7",addPrefijo("asia","japón")+"55556666");
		Agenda registro8 = new Agenda("calle 8",addPrefijo("asia","corea del sur")+"8888222333");
		Agenda registro9 = new Agenda("calle 9",addPrefijo("oceania","australia")+"222222556");
		Agenda registro10 = new Agenda("calle 10",addPrefijo("oceania","australia")+"9999123213");
		
		listRegistro.add(registro1);
		listRegistro.add(registro2);
		listRegistro.add(registro3);
		listRegistro.add(registro4);
		listRegistro.add(registro5);
		listRegistro.add(registro6);
		listRegistro.add(registro7);
		listRegistro.add(registro8);
		listRegistro.add(registro9);
		listRegistro.add(registro10);
		
		for(Agenda r: listRegistro) {
			System.out.println(r);
			
			
		}
		
	}

	
	public static String addPrefijo(String continente, String pais) {

		return Factory.getFactory("prefijo").getBuscarPrefijo(continente).getPrefijoPais(pais);

	}

}
