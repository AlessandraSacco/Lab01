package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.zaxxer.hikari.util.SuspendResumeLock;

public class Parole {
	List<String> elenco = new ArrayList<>();
		
	public Parole() {
		//TODO
	}
	
	public void addParola(String p) {
		elenco.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(elenco,new ConfrontaNomi());
		//System.out.println(elenco);
		return elenco;
	}
	
	public void reset() {
		elenco.removeAll(elenco);
	}
	
	public void resetonly1(String s) {
		elenco.remove(s);
	    
	}

}
