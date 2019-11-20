package no.hvl.dat100.jplab12.oppgave3;

import java.util.Arrays;
import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggTabell;
	private int nesteLedig;

	public Blogg() {
		this.innleggTabell = new Innlegg[20]; 
	}

	public Blogg(int lengde) {
		this.innleggTabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return innleggTabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int p = -1; 
		int i = 0;
		while (i < nesteLedig && p == -1) {
			if (innleggTabell[i].erLik(innlegg)) {
				p = i;
			}
			i++; 
		}
		return p;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = true;
		if(finnInnlegg(innlegg) == -1) {
			finnes = false;
		}
		return finnes;
	}

	public boolean ledigPlass() {
		boolean ledig = false;
		if (innleggTabell.length > nesteLedig) {
			ledig = true;
		}
		return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean lagtTil =! finnes(innlegg) && ledigPlass();
		if (lagtTil) {
			innleggTabell[nesteLedig] = innlegg;
			lagtTil = true;
			nesteLedig ++;
		}
		return lagtTil;
	}
	
	public String toString() {
		String s = getAntall() + "\n";
		for(int i = 0; i < innleggTabell.length; i++) {
			s += innleggTabell[i].toString();
		}
		return s;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}