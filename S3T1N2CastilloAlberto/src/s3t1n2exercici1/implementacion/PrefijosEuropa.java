package s3t1n2exercici1.implementacion;

import s3t1n2exercici1.IPrefijo;

public class PrefijosEuropa implements IPrefijo {

	@Override
	public String getPrefijoPais(String pais) {

		pais = pais.toLowerCase();
		String prefijo = null;
		switch (pais) {
		case "albania":
			prefijo = "+355";
			break;
		case "alemania":
			prefijo = "+49";
			break;
		case "andorra":
			prefijo = "+376";
			break;
		case "austria":
			prefijo = "+43";
			break;
		case "bélgica":
			prefijo = "+32";
			break;
		case "bielorrusia":
			prefijo = "+375";
			break;
		case "bosnia herzegovina":
			prefijo = "+387";
			break;
		case "bulgaria":
			prefijo = "+359";
			break;
		case "chipre":
			prefijo = "+357";
			break;
		case "croacia":
			prefijo = "+385";
			break;
		case "dinamarca":
			prefijo = "+45";
			break;
		case "el vaticano":
			prefijo = "+39";
			break;
		case "eslovaquia":
			prefijo = "+421";
			break;
		case "eslovenia":
			prefijo = "+386";
			break;
		case "españa":
			prefijo = "+34";
			break;
		case "estonia":
			prefijo = "+372";
			break;
		case "finlandia":
			prefijo = "+358";
			break;
		case "francia":
			prefijo = "+33";
			break;
		case "gibraltar":
			prefijo = "+350";
			break;
		case "grecia":
			prefijo = "+30";
			break;
		case "holanda":
			prefijo = "+31";
			break;
		case "hungría":
			prefijo = "+36";
			break;
		case "irlanda":
			prefijo = "+353";
			break;
		case "isla de man":
			prefijo = "+44";
			break;
		case "islandia":
			prefijo = "+354";
			break;
		case "islas feroe":
			prefijo = "+298";
			break;
		case "italia":
			prefijo = "+39";
			break;
		case "kosovo":
			prefijo = "+381";
			break;
		case "letonia":
			prefijo = "+371";
			break;
		case "liechtenstein":
			prefijo = "+423";
			break;
		case "lituania":
			prefijo = "+370";
			break;
		case "luxemburgo":
			prefijo = "+352";
			break;
		case "macedonia":
			prefijo = "+389";
			break;
		case "malta":
			prefijo = "+356";
			break;
		case "moldavia":
			prefijo = "+373";
			break;
		case "mónaco":
			prefijo = "+377";
			break;
		case "montenegro":
			prefijo = "+382";
			break;
		case "noruega":
			prefijo = "+47";
			break;
		case "polonia":
			prefijo = "+48";
			break;
		case "portugal":
			prefijo = "+351";
			break;
		case "reino unido":
			prefijo = "+44";
			break;
		case "república checa":
			prefijo = "+420";
			break;
		case "rumanía":
			prefijo = "+40";
			break;
		case "rusia":
			prefijo = "+7";
			break;
		case "san marino":
			prefijo = "+378";
			break;
		case "serbia":
			prefijo = "+381";
			break;
		case "suecia":
			prefijo = "+46";
			break;
		case "suiza":
			prefijo = "+41";
			break;
		case "ucrania":
			prefijo = "+380";
			break;

		}

		return prefijo;
	}

}
