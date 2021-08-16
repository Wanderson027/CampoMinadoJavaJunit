package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private int minas;
	
	private final List<Campo> campos  = new  ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
		
	}
	
	private void gerarCampos() {
		for (int l = 0; l < linhas; l++) {
			for (int c = 0; c < colunas; l++) {
				campos.add(new Campo(l, c));
			}
		}
	}
	
	private void associarVizinhos() {
		
	}
	
	private void sortearMinas() {
		
	}
	
	
	
	
}
