package s3t1n2exercici1.implementacion;

import s3t1n2exercici1.*;

public class FactoryPrefijo  implements IFactory {

	@Override
	public IPrefijo getBuscarPrefijo(String continente) {
		
		IPrefijo result = null;

		if (continente.equalsIgnoreCase("africa")) {
			result = new PrefijosAfrica();

		} else if (continente.equalsIgnoreCase("america")) {
			result = new PrefijosAmerica();

		} else if (continente.equalsIgnoreCase("asia")) {
			result = new PrefijosAsia();

		} else if (continente.equalsIgnoreCase("europa")) {
			result = new PrefijosEuropa();

		} else if (continente.equalsIgnoreCase("oceania")) {
			result = new PrefijosOceania();

		}
		return (IPrefijo) result;
	}

	
	

	

}
