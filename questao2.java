package prova;
import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	       Imovel[] lista = new Imovel[10];
	        boolean x = true;
	        int y = 0;
	        int sec = 0;
	        while(x){
	            System.out.println("Qual operação você quer fazer?");
	            System.out.println("1- Adicionar um imóvel Novo");
	            System.out.println("2- Adicionar um imóvel Usado");
	            System.out.println("3- Modificar Adicional");
	            System.out.println("4- Modificar Desconto");
	            System.out.println("5- Mostrar o valor de venda de um imóvel ");
	            System.out.println("6- Mostrar todas as informações de um Imóvel");
	            System.out.println("7- Mostrar todos as informações de todos os imóveis");
	            System.out.println("0- Sair");
	            int s = in.nextInt();
	            System.out.println();
	            System.out.println();
	            if(s == 0){
	                x = false;
	            }
	            else if(s == 1){
	                if(sec == 10){
	                    System.out.println("Não é possível adicionar novos Imóveis!");
	                    System.out.println("");
	                }
	                else{
	                    System.out.println("Qual o ID do imóvel?");
	                    int id = in.nextInt();
	                    in.nextLine();
	                    System.out.println("Qual o endereço?");
	                    String end = in.nextLine();
	                    System.out.println("Qual o valor?");
	                    double val = in.nextDouble();
	                    Novo novo = new Novo(id, end, val);
	                    lista[y] = novo;
	                    sec = sec + 1;
	                    y = y + 1;
	                }
	            }
	            else if(s == 2){
	            	if(sec == 10){
	                    System.out.println("Não é possível adicionar novos Imóveis!");
	                    System.out.println("");
	                }
	                else{
	                    System.out.println("Qual o ID do imóvel?");
	                    int id = in.nextInt();
	                    in.nextLine();
	                    System.out.println("Qual o endereço?");
	                    String end = in.nextLine();
	                    System.out.println("Qual o valor?");
	                    double val = in.nextDouble();
	                    Usado usado = new Usado(id, end, val);
	                    lista[y] = usado;
	                    sec = sec + 1;
	                    y = y + 1;
	                }
	            }
	            else if(s == 3){
	            	System.out.println("Digite o ID do Produto que está procurando");
	            	int id = in.nextInt();
	            	in.nextLine();
	            	System.out.println("Digite o novo valor do adicional");
	            	double num = in.nextDouble();
	            	int secr = 0;
	            	for(int i = 0;i <= lista.length;i++){
	                    if(lista[i].getId() == id){
	                    	if(lista[i] instanceof Novo) {
	                    		Novo nov = (Novo) lista[i];
	                    		nov.setAdicional(num);
	                        	System.out.println("");
	                    	}
	                    	else {
	                    		System.out.println("Esse ID é de um móvel usado");
	                    		System.out.println("");
	                    	}
	                        break;
	                    }
	                    else if(lista[i].getId() != id){
	                    	secr = secr + 1;
	                    	if(secr == sec) {
	                    		System.out.println("Não há nenhum Imóvel com esse ID");
	                    		System.out.println("");
	                    		break;
	                    	}
	                    }
	                   }
	            }
	            else if(s == 4){
	            	System.out.println("Digite o ID do Produto que está procurando");
	            	int id = in.nextInt();
	            	in.nextLine();
	            	System.out.println("Digite o novo valor do desconto");
	            	double num = in.nextDouble();
	            	int secr = 0;
	            	for(int i = 0;i <= lista.length;i++){
	                    if(lista[i].getId() == id){
	                    	if(lista[i] instanceof Usado) {
	                    		Usado usa = (Usado) lista[i];
	                    		usa.setDesconto(num);
	                        	System.out.println("");
	                    	}
	                    	else {
	                    		System.out.println("Esse ID é de um móvel Novo");
	                    		System.out.println("");
	                    	}
	                        break;
	                    }
	                    else if(lista[i].getId() != id){
	                    	secr = secr + 1;
	                    	if(secr == sec) {
	                    		System.out.println("Não há nenhum Imóvel com esse ID");
	                    		System.out.println("");
	                    		break;
	                    	}
	                    }
	                   }
	            }
	            else if(s == 5) {
	            	System.out.println("Digite o ID do Imóvel que está procurando");
	            	int id = in.nextInt();
	            	int secr = 0;
	            	for(int i = 0;i <= lista.length;i++){
	                    if(lista[i].getId() == id){
	                    	if(lista[i] instanceof Usado) {
	                    		Usado usa = (Usado) lista[i];
	                    		System.out.println(usa.getValorVenda());
	                        	System.out.println("");
	                    	} 
	                    	else if(lista[i] instanceof Novo) {
	                    		Novo nov = (Novo) lista[i];
	                    		System.out.println(nov.getValorVenda());
	                        	System.out.println("");
	                    	}
	                        break;
	                    }
	                    else if(lista[i].getId() != id){
	                    	secr = secr + 1;
	                    	if(secr == sec) {
	                    		System.out.println("Não há nenhum Imóvel com esse ID");
	                    		System.out.println("");
	                    		break;
	                    	}
	                    }
	                   }
	            }
	            	else if(s == 6) {
		            	System.out.println("Digite o ID do Imóvel que está procurando");
		            	int id = in.nextInt();
		            	int secr = 0;
		            	for(int i = 0;i <= lista.length;i++){
		                    if(lista[i].getId() == id){
		                        System.out.println(lista[i]);
		                        System.out.println("");
		                        break;
		                    }
		                    else if(lista[i].getId() != id){
		                    	secr = secr + 1;
		                    	if(secr == sec) {
		                    		System.out.println("Não há nenhum Imóvel com esse ID");
		                    		System.out.println("");
		                    		break;
		                    	}
		                    }
		                   }
	            	}
	            	else if(s == 7) {
	            		for(int i = 0;i < 10;i++){
		                    if(lista[i] == null){
		                        
		                    }
		                    else{
		                        System.out.println(lista[i]);
		                    }
		                }
		                System.out.println("");
		                }
	            	else {
	                    System.out.println("Esse não é uma opção válida");
	                    System.out.println("");
	            	}
		}
	    }
}
