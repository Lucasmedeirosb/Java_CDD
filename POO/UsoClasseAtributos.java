package POO;

public class UsoClasseAtributos {

	public static void main(String[] args) {
		AtributosClasse cliente01 = new AtributosClasse();
		System.out.println(cliente01.nome);
		System.out.println(cliente01.sobrenome);
		System.out.println(cliente01.idade);
		System.out.printf("O aluno %s %s tem %d anos", cliente01.nome, cliente01.sobrenome, cliente01.idade);

	}

}
