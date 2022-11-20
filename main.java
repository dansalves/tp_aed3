import java.util.Scanner;

import objcts.banco;
import objcts.conta;
import objcts.indice;

public class main {
    public static void main(String[] arguments){
        Scanner sc = new Scanner(System.in);
        banco Banco = new banco();
        indice index = new indice();
        int option = 0;

        do{
            System.out.println("Por favor, selecione uma opcão.");
            System.out.println("1 - Criar uma nova conta no banco.\n2 - Realizar uma tranferencia\n3 - Pesquisar por conta no banco.\n4 - Atualizar uma conta bancaria.\n5 - Sair.\n");

            option=sc.nextInt();
            
            switch(option){
                case 1:
                    Banco.criarConta();

            }

        } while (option!=3);



        sc.close();
    }
}
