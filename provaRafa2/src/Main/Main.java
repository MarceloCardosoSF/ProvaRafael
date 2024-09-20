package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	/*String cnpj, String regime, String email, int numnota, String data, String descricao, Double valor*/
		ArrayList<Nota> notas = new ArrayList<Nota>();
		Nota nf1 = new Nota("Empresa1", "12.345.678/0001-95", "Simples", "exemplo@email.com", 1, "10/09/2024", "Serviços de TI", 1000.00);
		Nota nf2 = new Nota("Empresa2","23.456.789/0002-96", "Presumido", "exem@email.com", 2, "29/12/2023", "Revenda de mercadoria", 2000.00);
		Nota nf3 = new Nota("Empresa3","34.567.891/0003-97", "Simples", "exemplos@gmail.com", 3, "20/02/2002", "Brinde/bonficação", 3000.00);
		Nota nf4 = new Nota("Empresa4","45.678.910/0004-98","Presumido","email@exemplo.com",5,"10/10/2024","Aquisição automóvel", 4000.00);
		Nota nf5 = new Nota("Empresa5","45.678.910/0004-99","Simples","email@exemplo.com",6,"12/10/2024","Venda imóvel", 5000.00);
		Nota nf6 = new Nota("Empresa6","45.678.910/0004-10","Presumido","email@exemplo.com",7,"14/10/2024","Aquisição bens", 6000.00);
		Nota nf7 = new Nota("Empresa7","45.678.910/0004-11","Simples","email@exemplo.com",8,"16/10/2024","Aquisição produtos", 7000.00);
		Nota nf8 = new Nota("Empresa8","45.678.910/0004-12","Presumido","email@exemplo.com",8,"18/10/2024","Aquisição produtos", 8000.00);
		Scanner sc = new Scanner(System.in);
		
		notas.add(nf1);
		notas.add(nf2);
		notas.add(nf3);
		notas.add(nf4);
		notas.add(nf5);
		notas.add(nf6);
		notas.add(nf7);
		notas.add(nf8);
		
		int opcao;
		do {
			System.out.println("_---_---_");
			System.out.println("Selecione sua ação: ");
			System.out.println("1 - Listar todas as notas");
			System.out.println("2 - Verificar o valor tributado da nota");
			System.out.println("3 - Listar notas através do regime");
			System.out.println("4 - Sair do sistema");
			 opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
			case 1:
		System.out.println("Lista de notas: ");
		for (int i = 0; i < notas.size(); i++) {
			System.out.println("----------------");
			System.out.println("Código da nota: "+ i);
			System.out.println("Razão social: "+ notas.get(i).getRazao());
			System.out.println("Valor: "+ notas.get(i).getValor());
			System.out.println("Regime: "+ notas.get(i).getRegime());
		}
		break;
			case 2:
			System.out.println("Digite o código da nota: ");
			int n = sc.nextInt();
			sc.nextLine();
			if (notas.get(n).getRegime().contains("Simples")){
			double simp = (notas.get(n).getValor()*6.5)/100;
				System.out.println("Valor da nota: "+ notas.get(n).getValor());
				System.out.println("Valor do tributo: "+ simp);
				System.out.println("***Valor final: "+ (notas.get(n).getValor()+simp));		
			} else {
			Double pres = (notas.get(n).getValor()*12)/100;
			System.out.println("Valor da nota: "+ notas.get(n).getValor());
			System.out.println("Valor do tributo: "+ pres);
				System.out.println("***Valor final: "+ (notas.get(n).getValor()+pres));
			}
			break;
			
			case 3:
		System.out.println("A nota é 'Simples' ou 'Presumido'?");
			String proc = sc.nextLine();
			for (int i = 0; i < notas.size(); i++) {
			
				if (notas.get(i).getRegime().contains(proc)){
					System.out.println("Nome: "+ notas.get(i).getNumnota());}
					} 
			}
			}while (opcao < 3);		
		sc.close();
	}
}
			