package desafio;

public class Curso extends Conteudo {

	private String titulo;
	private String descricao;
	private int cargaHoraria;

	public Curso() {

	}

	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso{" + "titulo = " + getTitulo() + "," + "descricao = " + getDescricao() + "," + " Carga horária = "
				+ cargaHoraria + '}';
	}
}
