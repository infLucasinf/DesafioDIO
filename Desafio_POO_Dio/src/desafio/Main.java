package desafio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Java ");
		curso1.setDescricao("Iniciante");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Java ");
		curso2.setDescricao("Intermediário ");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Java");
		mentoria.setDescricao("Avançado");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devLucas = new Dev();
		devLucas.setNome("Lucas");
		devLucas.inscreverBootcamp(bootcamp);
		System.out.println("Conteudo Inscritos Lucas" + devLucas.getConteudosInscritos());
		devLucas.progredir();
		devLucas.progredir();
		devLucas.progredir();
		System.out.println("***Progresso***");
		System.out.println("Conteudo Inscritos Lucas" + devLucas.getConteudosInscritos());
		System.out.println("Conteudo Concluido Lucas" + devLucas.getConteudosConcluidos());
		System.out.println("XP = " + devLucas.calcularTotalXp());
		
		System.out.println("-------------------------------------------");
		
		Dev devFonseca = new Dev();
		devFonseca.setNome("Fonseca");
		devFonseca.inscreverBootcamp(bootcamp);
		System.out.println("Conteudo Inscritos Fonseca" + devFonseca.getConteudosInscritos());
		devFonseca.progredir();
		System.out.println("***Progresso***");
		System.out.println("Conteudo Inscritos Fonseca" + devFonseca.getConteudosInscritos());
		System.out.println("Conteudo Concluido Fonseca" + devFonseca.getConteudosConcluidos());
		System.out.println("XP = " + devFonseca.calcularTotalXp());
		
		
		

	}

}
