package Calcular;

public class Nota {
	
	
	char retornaConceitoNota(float nota) {
		if(nota <50) {
			return 'D';
		}else if(nota<70) {
			return 'C';
		}else if(nota<90) {
			return 'B';
		}else if(nota<30) {
			return 'E';
		}else {
			return 'A';
		}
	

}
}
