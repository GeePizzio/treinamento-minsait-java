package br.com.gps;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.gps.exception.LimiteCreditoExcedidoException;
import br.com.gps.model.Aluno;
import br.com.gps.model.ContaBancaria;
import br.com.gps.model.Disciplina;
import br.com.gps.model.Pessoa;
import br.com.gps.model.Professor;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Hello pessoal!");
		
		System.out.println("-------------------------------------");
		System.out.println("::PROGRAMA ORIENTADA A OBJETOS");
		
		/*
		Carro carroJao = new Carro();
		
		carroJao.cor = "Branca";
		carroJao.marca = "Chevrolet";
		carroJao.modelo = "Onix";
		carroJao.andar();
		
		Carro carroTiao = new Carro();
		
		carroTiao.cor = "Azul";
		carroTiao.marca = "BYD";
		carroTiao.modelo = "Dolphin";
		carroTiao.parar();
		*/
		
		Carro carroJao = new Carro("Branca", "Chevrolet", "Onix");
		carroJao.andar();
		
		Carro carroTiao = new Carro("Azul", "BYD", "Dolphin", "-");
		carroTiao.parar();
		
		Carro carroZe = new Carro("Vermelho", "VW", "Fusca", true);
		System.out.println("Carro Zé: " + carroZe.toString());
		carroZe.andar();
		
		Carro carroFulano = new Carro();
		carroFulano.setCor("Verde");
		System.out.println("A cor do carro do Fulano é: " + carroFulano.getCor());
		carroFulano.andar();
		System.out.println("Carro Fulano" + carroFulano.toString());
		
		System.out.println("-------------------------------------");
		System.out.println("::PROGRAMA ORIENTADA A OBJETOS - HERANÇA");
		
		Aluno aluno1 = new Aluno("123456", 2024, "Nome Aluno", "Telefone 1234", "aluno1@a.com");
		System.out.println("Aluno1: " + aluno1.toString());
		
		Professor professor1 = new Professor(1, "POO", "Mestre", "Professor 1", "654654654654", "prof1@a.com");
		System.out.println("Professor1: " + professor1.toString());
		
		Professor prof2 = new Professor(2, "Banco de Dados", "Mestre", "Professor 2", "654654", "prof2@a.com", "http://linkedin.com");
		System.out.println("Professor1: " + prof2.toString());
		
		System.out.println("-------------------------------------");
		System.out.println("::PROGRAMA ORIENTADA A OBJETOS - HERANÇA/PLIMORFISMO");
		
		Pessoa pessoa1 = new Aluno("3333", 2024, "Nome Pessoa 1", "Telefone Pessoa 1", "pessoa1@a.com");
		
		Pessoa pessoa2 = new Professor(2 ,"Prog. Web", "Doutor", "Pessoa 2", "64646464", "prof2@a.com");
		
		System.out.println("Pessoa1: " + pessoa1.toString());
		System.out.println("Pessoa2: " + pessoa2.toString());
		
		System.out.println("-------------------------------------");
		System.out.println("::TRATAMENTO DE ERROS");
		
		try {
			System.out.println("Vou fazer a conta...");
			
			int valor = 10/10;
			System.out.println("Fiz a conta!");
			
			int[] numero = {0,1,2};
			for(int i = 0; i < 4; i++) {
				System.out.println(numero[i]);
			}
			
		} catch (ArithmeticException e) {
			System.out.println("- ERRO : " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("- ERRO : " + e.getMessage());
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println("-------------------------------------");
		
		Funcao funcao = new Funcao();
		
		try {
			funcao.lerArquivo("Principal.class");
		} catch(FileNotFoundException e) {
			System.out.println("- ERRO : " + e.getMessage());
//			e.printStackTrace();
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println("-------------------------------------");
		
		ContaBancaria contaBancaria = new ContaBancaria(1500);
		
		try {
			contaBancaria.fazerPix(2000);
		} catch (LimiteCreditoExcedidoException e) {
			System.out.println("- ERRO : " + e.getMessage());
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println("-----------------------------");
		System.out.println(":: COLEÇÕES - LIST");
		List<String> nomes = new ArrayList<String>();
		nomes.add("Maria");
		nomes.add("Joao");
		nomes.add("Jose");
		
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		System.out.println("-----------------------------");
		nomes.add("Pedro");
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		System.out.println("-----------------------------");
		/*nomes.remove(1);
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}*/
		Collections.sort(nomes);
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		System.out.println("-----------------------------");
		
		List<Carro> carros = new ArrayList<Carro>();
		carros.add(carroZe);
		carros.add(carroJao);
		carros.add(carroTiao);
		carros.add(carroFulano);
		
		for(Carro c : carros) {
			System.out.println(c.toString());
		}
		System.out.println("-----------------------------");
		nomes.add("Arthur");
		nomes.add("Gabriel");
		Collections.sort(nomes);
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		
		System.out.println("-----------------------------");
		List<String> nomesFiltrados = nomes.stream()
				.filter(nome2 -> nome2.startsWith("J"))
				.collect(Collectors.toList());
		
		for(String nome : nomesFiltrados) {
			System.out.println("Nome filtro: " + nome);
		}
		
		System.out.println("-----------------------------");
		System.out.println(":: COLEÇÕES - SET");
		Set<String> cores = new HashSet<String>();
		
		cores.add("Azul");
		cores.add("Vermelho");
		cores.add("Verde");
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		System.out.println("-----------------------------");
		System.out.println(":: COLEÇÕES - HASHMAP");
		Map<String, String> paises = new HashMap<String, String>();
		paises.put("Brasil", "Brasília");
		paises.put("França", "Paris");
		paises.put("Portugal", "Lisboa");
		
		for(Map.Entry<String, String> entrada : paises.entrySet() ) {
			System.out.println("Capitais: " + entrada.getValue());
		}
		paises.put("Espanha", "Madri");
		System.out.println("Capital de Portugal: " + paises.get("Portugal"));
		
		
		System.out.println("-----------------------------");
		Map<Integer, Carro> estacionamento = new HashMap<Integer, Carro>();
		estacionamento.put(0, carroZe);
		estacionamento.put(1, carroFulano);
		estacionamento.put(2, carroJao);
		estacionamento.put(3, carroTiao);
		
		System.out.println("Carro do Jao: " + carroJao.toString());
		System.out.println("Carro do Jao: " + estacionamento.get(2));
		
		System.out.println("-----------------------------");
		System.out.println(":: BUILDER");
		Disciplina disciplina1 = new Disciplina("POO","2p",300);
		System.out.println("Disciplina1: " + disciplina1);
		
		Disciplina disciplina2 = Disciplina.builder()
				.setNome("Banco de dados")
				.setPeriodo("3p")
				
				.build();
		System.out.println("Disciplina2: " + disciplina2);
		
		
		System.out.println("F-----------------------------");
		
	}

}
