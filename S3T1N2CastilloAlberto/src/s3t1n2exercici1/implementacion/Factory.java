package s3t1n2exercici1.implementacion;

import s3t1n2exercici1.IFactory;

public class Factory {

	public static IFactory getFactory(String tipo) {

		if (tipo.equalsIgnoreCase("prefijo")) {

			return (IFactory) new FactoryPrefijo();
		}
		return null;
	}

}
