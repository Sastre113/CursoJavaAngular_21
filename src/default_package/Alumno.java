package default_package;

public class Alumno {
	
	/*
	 * Atributos
	 */
	
	private String nombreApellido;
	private int notas[];
	private double notaMedia;
	
	
	public Alumno(String nombreApellido, int notas[]) {
		this.nombreApellido = nombreApellido;
		this.notas = notas;
		this.notaMedia = this.calcularMedia();
	}
	
	private double calcularMedia() {
		double sumTotal = 0;
		
		for(int i = 0; i < notas.length; i++)
			sumTotal += this.notas[i];
		
		return sumTotal/notas.length;
	}
	
	private String notasToString() {
		String notas = "";
		
		for(int i = 0 ; i < this.notas.length; i++)
			notas += "UD" + (i+1) + ". " + this.notas[i] + "\n";
		
		return notas;
	}
	
	private String notaMediaToString() {
		return String.format("%1$,.2f", getNotaMedia());
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
		this.calcularMedia();
	}
	
	public void setOneNotas(int idx, int nota) {
		this.notas[idx] = nota;
		this.calcularMedia();
	}

	public double getNotaMedia() {
		return notaMedia;
	}
	
	
	@Override
	public String toString() {
		return "Alumno: " + this.nombreApellido +"\nCalificación de cada unidad:\n" + notasToString() + "Nota Media: " + notaMediaToString()+"\n";
	}
}
