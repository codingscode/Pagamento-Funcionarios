package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado;
import entidades.EmpregadoTerceirizado;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);	
		
	    List<Empregado> lista = new ArrayList<>();
	    
	    System.out.println("Digite o número de empregados : ");
	    int n = sc.nextInt();
	    
	    for (int i=1; i<=n;i++) {
	    	System.out.println("Empregado #" + i + " dados : " );
	    	System.out.println("Terceirizado (s/n) ?");
	    	char ch = sc.next().charAt(0);
	    	System.out.println("Nome : ");
	    	String nome = sc.next();
	    	System.out.println("Horas trabalhadas : ");
	    	int horas = sc.nextInt();
	    	System.out.println("Valor da hora : ");
	    	double valorhora = sc.nextDouble();
	    	if (ch == 's') {
	    		System.out.println("Ganho extra : ");
	    		double pagamentoplus = sc.nextDouble();
	    		EmpregadoTerceirizado emp = new EmpregadoTerceirizado(nome, horas, valorhora, pagamentoplus);
	    		lista.add(emp);
	    	}
	    	else {
	    		Empregado emp = new Empregado(nome, horas, valorhora);
	    		lista.add(emp);
	    	}
	    }
	    
	    System.out.println();
	    System.out.println("Pagamentos:");
	    for (Empregado emp : lista) {
	      System.out.println(emp.getNome() + " - $ " + emp.pagamento());
	    }
		
        sc.close();
	}

}
