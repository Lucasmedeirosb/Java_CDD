package Membros;

public class DataNacimentoMain {

	public static void main(String[] args) {
		DataNascimento dt = new DataNascimento();
		DataNascimento dt2 = new DataNascimento();
		dt.dia=16;
		dt.mes=02;
		dt.ano=2000;
		
		dt2.dia=20;
		dt2.mes= 12;
		dt2.ano= 1986;
		System.out.printf("A data de Nascimento" + " é %d %d %d \n", dt.dia, dt.mes, dt.ano);
		
		System.out.printf("A data de Nascimento" + " é %d %d %d \n", dt2.dia, dt2.mes, dt2.ano);

	}

}
