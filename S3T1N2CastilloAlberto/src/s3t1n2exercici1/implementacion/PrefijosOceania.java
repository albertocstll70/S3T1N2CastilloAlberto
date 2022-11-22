package s3t1n2exercici1.implementacion;

import s3t1n2exercici1.IPrefijo;

public class PrefijosOceania implements IPrefijo {

	public PrefijosOceania() {

	}

	@Override
	public String getPrefijoPais(String pais) {
		String prefijo = null;

		if (pais.equalsIgnoreCase("australia")) {

			prefijo = "+61";
		}

		return prefijo;

	}

}
