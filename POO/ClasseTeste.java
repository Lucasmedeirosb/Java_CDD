package POO;

public class ClasseTeste {

	public static void main(String[] args) {
		//instanciando a classe pessoa
		ClassePessoa aluno01 = new ClassePessoa();
		ClassePessoa aluno02 = new ClassePessoa();
		aluno01.nome = "Lucas";
		aluno02.nome = "Grazi Pelúcia";
		//System.out.println(aluno01.nome);
		aluno01.comer(aluno01.nome);
		aluno02.comer(aluno02.nome);
	}
}
