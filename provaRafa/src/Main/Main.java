package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*int pesId, String pesNome, String pesNascimento, String pesSexo, String pesMae, String pesPai,
		String pesEndereco, String pesEmail, int pesTelefone*/
Pessoa pes = new Pessoa(1,"Marcelo", "06/08/2002", "Masculino", "Maria", "Edvaldo", "Endereço completo", "email@email.com", "900900", "<IMG>");
	Scanner sc = new Scanner(System.in);
	System.out.println("ID: "+ pes.getPesId());
	System.out.println("Nome: "+ pes.getPesNome());
	System.out.println("Nascimento: "+ pes.getPesNascimento());
	System.out.println("Gênero: "+ pes.getPesSexo());
	System.out.println("Nome da mãe: "+ pes.getPesMae());
	System.out.println("Nome do pai: "+ pes.getPesPai());
	System.out.println("Endereço: "+ pes.getPesEndereco());
	System.out.println("Email: "+ pes.getPesEmail());
	System.out.println("Telefone: "+ pes.getPesTelefone());
	System.out.println("Foto: "+ pes.getPesFoto());

	ArrayList<Pessoa> pess = new ArrayList<Pessoa>();
	pess.add(pes);
	
	int opcao;
	do {
	System.out.println("*---*---*");
	System.out.println("Opções: ");
	System.out.println("1 - Listar todos os contatos");
	System.out.println("2 - Cadastrar novo contato");
	System.out.println("3 - Buscar contato pelo telefone");
	System.out.println("4 - Verificar o contato completo");
	System.out.println("5 - Sair de contatos");
	opcao = sc.nextInt();
	sc.nextLine();
	
		switch(opcao) 	{
	case 1:
		System.out.println("Lista de contatos: ");
			for (int i = 0; i < pess.size(); i++) {
				System.out.println("Contato: "+ i);
				System.out.println("Nome: "+ pess.get(i).getPesNome());
				System.out.println("Telefone: "+ pess.get(i).getPesTelefone());
				System.out.println("-------------------------------");
			
			}break;
		
	case 2:
		System.out.println("Informe o ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Informe o Nome: ");
		String nome = sc.nextLine();
		System.out.println("Informe o Nascimento: ");
		String nasc = sc.nextLine();
		System.out.println("Informe o Gênero: ");
		String gen = sc.nextLine();
		System.out.println("Informe o nome da mãe: ");
		String mae = sc.nextLine();
		System.out.println("Informe o nome do pai: ");
		String pai = sc.nextLine();
		System.out.println("Informe o endereço: ");
		String end = sc.nextLine();
		System.out.println("Informe o email: " );
		String email = sc.nextLine();
		System.out.println("Informe o telefone: ");
		String tel = sc.nextLine();
		pess.add(new Pessoa(id, nome, nasc, gen, mae, pai, end, email, tel, null));
		break;
	case 3:
		System.out.println("Digite o número telefone: ");
		String proc = sc.nextLine();
		for (int i = 0; i < pess.size(); i++) {
		if (pess.get(i).getPesTelefone().contains(proc)){
			System.out.println("Nome: "+ pess.get(i).getPesNome());
			break;
		}
	}
		break;
		
	case 4:
		System.out.println("Digite o número do contato: ");
		int i = sc.nextInt();
		System.out.println("ID: "+ pess.get(i).getPesId());
		System.out.println("Nome: "+ pess.get(i).getPesNome());
		System.out.println("Nascimento: "+ pess.get(i).getPesNascimento());
		System.out.println("Gênero: "+ pess.get(i).getPesSexo());
		System.out.println("Nome da mãe: "+ pess.get(i).getPesMae());
		System.out.println("Nome do pai: "+ pess.get(i).getPesPai());
		System.out.println("Endereço: "+ pess.get(i).getPesEndereco());
		System.out.println("Email: "+ pess.get(i).getPesEmail());
		System.out.println("Telefone: "+ pess.get(i).getPesTelefone());
		System.out.println("Foto: "+ pess.get(i).getPesFoto());
		break;
	case 5:
		System.out.println("Saindo dos contatos...");
		}	
	}while (opcao < 5);						
								sc.close();
	
	}
}
