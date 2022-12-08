package prova;
import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	       Produto[] estoque = new Produto[10];
	        boolean x = true;
	        int y = 0;
	        int sec = 0;
	        while(x){
	            System.out.println("Qual operação você quer fazer?");
	            System.out.println("1- Adicionar novo produto de alimento");
	            System.out.println("2- Adicionar novo produto de limpeza");
	            System.out.println("3- Ver informações de um produto específico");
	            System.out.println("4- Dar baixa em um produto");
	            System.out.println("5- Repor um produto");
	            System.out.println("6- Mostrar todos as informações de todos os produtos em estoque");
	            System.out.println("7- Mostrar valor total de um produto");
	            System.out.println("0- Sair");
	            int s = in.nextInt();
	            System.out.println();
	            System.out.println();
	            if(s == 0){
	                x = false;
	            }
	            else if(s == 1){
	                if(sec == 10){
	                    System.out.println("Não é possível adicionar novos Produtos!");
	                }
	                else{
	                    in.nextLine();
	                    System.out.println("Qual o tipo do alimento?");
	                    String tipo = in.nextLine();
	                    System.out.println("Qual o ID?");
	                    String id = in.nextLine();
	                    System.out.println("Qual a Descrição?");
	                    String desc = in.nextLine();
	                    System.out.println("Qual a quantidade?");
	                    int quant = in.nextInt();
	                    System.out.println("Qual o valor?");
	                    double val = in.nextDouble();
	                    ProdutoAlimento alimento = new ProdutoAlimento(tipo, id, desc, quant, val);
	                    estoque[y] = alimento;
	                    sec = sec + 1;
	                    y = y + 1;
	                }
	            }
	            else if(s == 2){
	                if(sec == 10){
	                    System.out.println("Não é possível adicionar novos Produtos!");
	                }
	                else{
	                    in.nextLine();
	                    System.out.println("Qual o tipo do Produto de Limpeza?");
	                    String tipo = in.nextLine();
	                    System.out.println("Qual o ID?");
	                    String id = in.nextLine();
	                    System.out.println("Qual a Descrição?");
	                    String desc = in.nextLine();
	                    System.out.println("Qual a quantidade?");
	                    int quant = in.nextInt();
	                    System.out.println("Qual o valor?");
	                    double val = in.nextDouble();
	                    ProdutoLimpeza limpeza = new ProdutoLimpeza(tipo, id, desc, quant, val);
	                    estoque[y] = limpeza;
	                    sec = sec + 1;
	                    y = y + 1;
	                }
	            }
	            else if(s == 3){
	                in.nextLine();
	            	System.out.println("Digite o ID do Produto que está procurando");
	            	String id = in.nextLine();
	            	int secr = 0;
	            	for(int i = 0;i <= estoque.length;i++){
	                    if(estoque[i].getId().equals(id)){
	                        System.out.println(estoque[i]);
	                        System.out.println("");
	                        break;
	                    }
	                    else if(!estoque[i].getId().equals(id)){
	                    	secr = secr + 1;
	                    	if(secr == sec) {
	                    		System.out.println("Não há nenhum Produto com esse ID");
	                    		System.out.println("");
	                    		break;
	                    	}
	                    }
	                   }
	            }
	            else if(s == 4){
	            	in.nextLine();
	            	System.out.println("Digite o ID do Produto que está procurando");
	            	String id = in.nextLine();
	            	System.out.println("Digite o quanto irá diminuir");
	            	int num = in.nextInt();
	            	int secr = 0;
	            	for(int i = 0;i <= estoque.length;i++){
	                    if(estoque[i].getId().equals(id)){
	                        estoque[i].darBaixa(num);
	                        System.out.println("");
	                        break;
	                    }
	                    else if(!estoque[i].getId().equals(id)){
	                    	secr = secr + 1;
	                    	if(secr == sec) {
	                    		System.out.println("Não há nenhum Produto com esse ID");
	                    		System.out.println("");
	                    		break;
	                    	}
	                    }
	                   }
	            }
	            else if(s == 5) {
	            	in.nextLine();
	            	System.out.println("Digite o ID do Produto que está procurando");
	            	String id = in.nextLine();
	            	System.out.println("Digite o quanto irá repor");
	            	int num = in.nextInt();
	            	int secr = 0;
	            	for(int i = 0;i <= estoque.length;i++){
	                    if(estoque[i].getId().equals(id)){
	                        estoque[i].repor(num);
	                        System.out.println("Você repôs o produto!");
	                        System.out.println("");
	                        break;
	                    }
	                    else if(!estoque[i].getId().equals(id)){
	                    	secr = secr + 1;
	                    	if(secr == sec) {
	                    		System.out.println("Não há nenhum Produto com esse ID");
	                    		System.out.println("");
	                    		break;
	                    	}
	                    }
	                   }
	            }
	            	else if(s == 6) {
	            	for(int i = 0;i < 10;i++){
	                    if(estoque[i] == null){
	                        
	                    }
	                    else{
	                        System.out.println(estoque[i]);
	                    }
	                }
	                System.out.println("");
	                }
	            	else if(s == 7) {
	            		in.nextLine();
		            	System.out.println("Digite o ID do Produto que está procurando");
		            	String id = in.nextLine();
		            	int secr = 0;
		            	for(int i = 0;i <= estoque.length;i++){
		                    if(estoque[i].getId().equals(id)){
		                        System.out.println(estoque[i].ValorTotal());
		                        System.out.println("");
		                        break;
		                    }
		                    else if(!estoque[i].getId().equals(id)){
		                    	secr = secr + 1;
		                    	if(secr == sec) {
		                    		System.out.println("Não há nenhum Produto com esse ID");
		                    		System.out.println("");
		                    		break;
		                    	}
		                    }
		                   }
	            	}
	            	else {
	                    System.out.println("Esse não é uma opção válida");
	                    System.out.println("");
	            	}
		}
	    }

}
