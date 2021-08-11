package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.excecao.ExplosaoException;

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
	@Test
	void testeValorPadrãoValorMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao () {
		campo.alternarMarcação();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacaoDuasChamadas () {
		campo.alternarMarcação();
		campo.alternarMarcação();
		assertFalse	(campo.isMarcado());
	}
	
	@Test
	void abrirCampoNaoMinadoNaoMarcado () {
		assertTrue(campo.abrir());
	}
	
	@Test
	void abrirCampoNaoMinadoMarcado () {
		campo.alternarMarcação();
		assertFalse(campo.abrir());
	}
	
	@Test 
	void abrirMinadoMarcado () {
		campo.alternarMarcação();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test
	void abriMinadoNaoMarcado () {
		campo.minar();
		
		assertThrows(ExplosaoException.class,  () -> {
			campo.abrir();
		});
	}
	
	@Test
	void testeVizinhoSeguro () {
		Campo campo11 = new Campo(1, 1);
		Campo campo22 = new Campo(2, 2);
		
		campo22.adicionarVizinho(campo11);
		campo.adicionarVizinho(campo22);
		campo.abrir();
		assertTrue(campo22.isAberto() && campo22.isAberto());
	}
	
	
}

