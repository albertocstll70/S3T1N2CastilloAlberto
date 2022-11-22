package s3t1n2exercici1.implementacion;

import s3t1n2exercici1.IPrefijo;

public class PrefijosAfrica implements IPrefijo {

	public PrefijosAfrica() {

	}

	@Override
	public String getPrefijoPais(String pais) {
		pais = pais.toLowerCase();
		String prefijo = null;
		switch (pais) {
		case "angola":
			prefijo = "+244";
			break;
		case "argelia":
			prefijo = "+213";
			break;
		case "botswana":
			prefijo = "+267";
			break;

		case "burkina Faso":
			prefijo = "+226";
			break;

		case "libia":
			prefijo = "+218";
			break;

		case "madagascar":
			prefijo = "+261";
			break;

		case "malawi":
			prefijo = "+265";
			break;
		case "benin":
			prefijo = "+229";
			break;

		case "mali":
			prefijo = "+223";
			break;
		case "marruecos":
			prefijo = "+212";
			break;

		case "mauricio":
			prefijo = "+230";
			break;

		case "burundi":
			prefijo = "+257";
			break;

		case "mauritania":
			prefijo = "+222";
			break;

		case "cabo verde":
			prefijo = "+238";
			break;

		case "mayotte":
			prefijo = "+262";
			break;

		case "camerún":
			prefijo = "+237";
			break;

		case "mozambique":
			prefijo = "+258";
			break;

		case "chad":
			prefijo = "+235";
			break;

		case "namibia":
			prefijo = "+264";
			break;

		case "comoras":
			prefijo = "+269";
			break;

		case "níger":
			prefijo = "+227";
			break;

		case "República del Congo":
			prefijo = "+242";
			break;

		case "Nigeria":
			prefijo = "+234";
			break;

		case "república democrática del dongo":
			prefijo = "+243";
			break;

		case "república centroafricana":
			prefijo = "+236";
			break;

		case "costa de marfil":
			prefijo = "+225";
			break;

		case "reunión":
			prefijo = "+262";
			break;

		case "djibouti":
			prefijo = "+253";
			break;

		case "ruanda":
			prefijo = "+250";
			break;

		case "egipto":
			prefijo = "+20";
			break;

		case "sahara occidental":
			prefijo = "+212";
			break;

		case "eritrea":
			prefijo = "+291";
			break;

		case "santa helena":
			prefijo = "+290";
			break;

		case "etiopía":
			prefijo = "+251";
			break;
		case "santo tomé y príncipe":
			prefijo = "+239";
			break;

		case "gabón":
			prefijo = "+241";
			break;

		case "senegal":
			prefijo = "+221";
			break;

		case "gambia":
			prefijo = "+220";
			break;

		case "seychelles":
			prefijo = "+248";
			break;

		case "ghana":
			prefijo = "+233";
			break;

		case "sierra leona":
			prefijo = "+232";
			break;

		case "somalia":
			prefijo = "+252";
			break;

		case "guinea":
			prefijo = "+224";
			break;

		case "sudáfrica":
			prefijo = "+27";
			break;

		case "guinea ecuatorial":
			prefijo = "+240";
			break;

		case "sudán":
			prefijo = "+249";
			break;

		case "guinea bissau":
			prefijo = "+245";
			break;

		case "swazilandia":
			prefijo = "+268";
			break;

		case "tanzania":
			prefijo = "+255";
			break;

		case "togo":
			prefijo = "+228";
			break;

		case "túnez":
			prefijo = "+216";
			break;

		case "uganda":
			prefijo = "+256";
			break;
		case "kenia":
			prefijo = "+254";
			break;

		case "zambia":
			prefijo = "+260";
			break;

		case "lesoto":
			prefijo = "+266";
			break;

		case "zimbabue":
			prefijo = "+263";
			break;

		case "liberia":
			prefijo = "+231";
			break;
		}
		return prefijo;

	}

}
