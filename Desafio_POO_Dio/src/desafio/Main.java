package desafio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso: java - ");
		curso1.setDescricao("Descrição: Para iniciantes - ");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso: Java intermediário - ");
		curso2.setDescricao("Descrição: intermediário - ");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Java - ");
		mentoria.setDescricao("Avançado - ");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1.getTitulo()+curso1.getDescricao()+curso1.getCargaHoraria());
		System.out.println(curso2.getTitulo()+curso2.getDescricao()+curso2.getCargaHoraria());
		System.out.println(mentoria.getTitulo()+mentoria.getDescricao()+mentoria.getData());
		

	}

}
