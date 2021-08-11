package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {
	
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3,3);
	}
	

	@Test 
	void testeVizinhoRealDistancia1Esquerda(){
		Campo vizinho = new Campo (3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		 assertTrue(resultado);
	}
	
	@Test 
	void testeVizinhoRealDistancia1Direita(){
		Campo vizinho = new Campo (3,4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		 assertTrue(resultado);
	}
	
	@Test 
	void testeVizinhoRealDistancia1Cima(){
		Campo vizinho = new Campo (2,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		 assertTrue(resultado);
	}
	
	@Test 
	void testeVizinhoRealDistancia1baixo(){
		Campo vizinho = new Campo (4,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		 assertTrue(resultado);
	}
	@Test 
	void testeVizinhoRealDistancia1EsquerdaCima(){
		Campo vizinho = new Campo (2,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		 assertTrue(resultado);
	}
	@Test 
	void testeVizinhoRealDistancia1DireitaCima(){
		Campo vizinho = new Campo (2,4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		 assertTrue(resultado);
	}
	@Test 
	void testeVizinhoRealDistancia1EsquerdaBaixo(){
		Campo vizinho = new Campo (4,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		 assertTrue(resultado);
	}
	@Test 
	void testeVizinhoRealDistancia1DireitaBaixo(){
		Campo vizinho = new Campo (4,4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		 assertTrue(resultado);
	}
	
	@Test 
	void testeNaoVizinhoRealDistancia2(){
		Campo vizinho = new Campo (1,1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		 assertFalse(resultado);
	}
}

