package s3t1n2exercici1.implementacion;

import s3t1n2exercici1.IPrefijo;

public class PrefijosAmerica implements IPrefijo {

	public PrefijosAmerica() {

	}

	@Override
	public String getPrefijoPais(String pais) {

		pais = pais.toLowerCase();
		String prefijo = null;
		switch (pais) {

		case "anguila":
			prefijo = "+1264";
			break;

		case "argentina":
			prefijo = "+54";
			break;
		case "aruba":
			prefijo = "+297";
		case "bahamas":
			prefijo = "+1";
			break;
		case "barbados":
			prefijo = "+1";
			break;
		case "belice":
			prefijo = "+501";
			break;
		case "bermudas":
			prefijo = "+1";
			break;
		case "bolivia":
			prefijo = "+591";
			break;
		case "brasil":
			prefijo = "+55";
			break;
		case "canada":
			prefijo = "+1";
			break;
		case "chile":
			prefijo = "+56";
			break;
		case "colombia":
			prefijo = "+57";
			break;
		case "costa rica":
			prefijo = "+506";
			break;
		case "cuba":
			prefijo = "+53";
			break;
		case "curazao":
			prefijo = "+599";
			break;
		case "dominica":
			prefijo = "+1";
			break;
		case "ecuador":
			prefijo = "+593";
			break;
		case "el salvador":
			prefijo = "+503";
			break;
		case "estados unidos":
			prefijo = "+1";
			break;
		case "groenlandia":
			prefijo = "+299";
			break;
		case "guadalupe":
			prefijo = "+590";
			break;
		case "guatemala":
			prefijo = "+502";
			break;
		case "guyana":
			prefijo = "+592";
			break;
		case "haití":
			prefijo = "+509";
			break;
		case "honduras":
			prefijo = "+504";
			break;
		case "islas caimán":
			prefijo = "+1345";
			break;
		case "islas malvinas":
			prefijo = "+500";
			break;
		case "islas vírgenes británicas":
			prefijo = "+1284";
			break;
		case "jamaica":
			prefijo = "+1";
			break;
		case "méxico":
			prefijo = "+52";
			break;
		case "montserrat":
			prefijo = "+1664";
			break;
		case "nicaragua":
			prefijo = "+505";
			break;
		case "panamá":
			prefijo = "+507";
			break;
		case "paraguay":
			prefijo = "+595";
			break;
		case "perú":
			prefijo = "+51";
			break;
		case "puerto rico":
			prefijo = "+1";
			break;
		case "república dominicana":
			prefijo = "+1809";
			break;
		case "San Bartolomé":
			prefijo = "+590";
			break;
		case "san cristóbal y nevis":
			prefijo = "+1";
			break;
		case "san martín":
			prefijo = "+1599";
			break;
		case "san pedro y miquelón":
			prefijo = "+508";
			break;
		case "san vicente y las granadinas":
			prefijo = "+1";
			break;
		case "santa lucía":
			prefijo = "+1";
			break;
		case "surinam":
			prefijo = "+597";
			break;
		case "trinidad y tobago":
			prefijo = "+1";
			break;
		case "uruguay":
			prefijo = "+598";
			break;
		case "venezuela":
			prefijo = "+58";
			break;

		}

		return prefijo;
	}

}
