package s3t1n2exercici1.implementacion;

import s3t1n2exercici1.IPrefijo;

public class PrefijosAsia implements IPrefijo {

	public PrefijosAsia() {

	}

	@Override
	public String getPrefijoPais(String pais) {

		pais = pais.toLowerCase();
		String prefijo = null;
		switch (pais) {
		case "afganistán":
			prefijo = "+93";
			break;
		case "arabia saudita":
			prefijo = "+966";
			break;
		case "armenia":
			prefijo = "+374";
			break;
		case "azerbaiyán":
			prefijo = "+994";
			break;
		case "bahréin":
			prefijo = "+973";
			break;
		case "bangladesh":
			prefijo = "+880";
			break;
		case "birmania":
			prefijo = "+95";
			break;
		case "brunéi":
			prefijo = "+673";
			break;
		case "bután":
			prefijo = "+975";
			break;
		case "camboya":
			prefijo = "+855";
			break;
		case "china":
			prefijo = "+86";
			break;
		case "corea del norte":
			prefijo = "+850";
			break;
		case "corea del sur":
			prefijo = "+82";
			break;
		case "emiratos arabes unidos":
			prefijo = "+971";
			break;
		case "filipinas":
			prefijo = "+63";
			break;
		case "georgia":
			prefijo = "+995";
			break;
		case "hong kong":
			prefijo = "+852";
			break;
		case "india":
			prefijo = "+91";
			break;
		case "indonesia":
			prefijo = "+62";
			break;
		case "irak":
			prefijo = "+964";
			break;
		case "irán":
			prefijo = "+98";
			break;
		case "israel":
			prefijo = "+972";
			break;
		case "japón":
			prefijo = "+81";
			break;
		case "jordania":
			prefijo = "+962";
			break;
		case "kazajistán":
			prefijo = "+7";
			break;
		case "kirgizistán":
			prefijo = "+996";
			break;
		case "kuwait":
			prefijo = "+965";
			break;
		case "laos":
			prefijo = "+856";
			break;
		case "líbano":
			prefijo = "+961";
			break;
		case "macao":
			prefijo = "+853";
			break;
		case "malasia":
			prefijo = "+60";
			break;
		case "maldivas":
			prefijo = "+960";
			break;
		case "mongolia":
			prefijo = "+976";
			break;
		case "nepal":
			prefijo = "+977";
			break;
		case "omán":
			prefijo = "+968";
			break;
		case "pakistán":
			prefijo = "+92";
			break;
		case "qatar":
			prefijo = "+974";
			break;
		case "singapur":
			prefijo = "+65";
			break;
		case "siria":
			prefijo = "+963";
			break;
		case "sri lanka":
			prefijo = "+94";
			break;
		case "tailandia":
			prefijo = "+66";
			break;
		case "taiwán":
			prefijo = "+886";
			break;
		case "tayikistán":
			prefijo = "+992";
			break;
		case "turkmenistán":
			prefijo = "+993";
			break;
		case "turquía":
			prefijo = "+90";
			break;
		case "uzbekistán":
			prefijo = "+998";
			break;
		case "vietnam":
			prefijo = "+84";
			break;
		case "yemen":
			prefijo = "+967";
			break;

		}

		return prefijo;

	}

}
