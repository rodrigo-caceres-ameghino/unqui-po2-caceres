package unq.tp3;

import java.util.ArrayList;

public class Counter {
	//Atributos
	private ArrayList<Integer> lista;
	//Constructor
	public Counter() {
		this.setLista(new ArrayList<Integer>());
	}
	//Gets y sets
	public void setLista(ArrayList<Integer> lista) {
		this.lista = lista;
	}
	
	public ArrayList<Integer> getLista() {
		return lista;
	}
	//Metodos
	public void agregarNumero(Integer numero) {
		this.lista.add(numero);
	}

	public Integer cantidadDePares() {
		int pares = 0;
		for (int numero : lista) {
				if (numero%2 == 0) {
					pares = pares + 1;
				}
		} 
		return pares;
	}
	
	public int cantidadDeImpares() {
		int impares = 0;
        for (int numero : lista) {
            if(!(numero%2==0)) {
            	impares = impares + 1;
            }
        }
        return impares;
	}

	public int cantidadDeMultiplosDe(Integer multiplicador) {
		int multiplos = 0;
		for (int numero : lista) {
			if(numero% multiplicador==0) {
				multiplos = multiplos + 1;
			}
		}
		return multiplos;
	}
}