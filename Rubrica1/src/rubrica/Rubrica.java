package rubrica;

import java.util.ArrayList;
import java.util.List;




public class Rubrica {
	
	private String nomeRubrica;
	private List<Voce> listaVoci = new ArrayList <Voce> ();
	

	public String getNomeRubrica() {
		return nomeRubrica;
	}

	public void setNomeRubrica(String nomeRubrica) {
		this.nomeRubrica = nomeRubrica;
	}

	public List<Voce> getListaVoci() {
		return listaVoci;
	}

	public void setListaVoci(List<Voce> listaVoci) {
		this.listaVoci = listaVoci;
	}
	
	
	public void inserisciOggetti(Voce v) {
		
		listaVoci.add(v);
		}

	@Override
	public String toString() {
		return "Rubrica [nomeRubrica=" + nomeRubrica + ", listaVoci="
				+ listaVoci + "]";
	}
	
		
	
	
	}
