package objcts;

import java.io.RandomAccessFile;
import java.util.Scanner;

import objcts.conta;

public class banco {


public void criarConta() {


        Scanner sc=new Scanner(System.in);
        conta Conta=new conta();
        boolean sucess;

        Conta.setIDConta=(this.getNewID());
        
        System.out.println("\nForneça as seguintes informações:");
        System.out.print("Nome > ");
        Conta.setNome(sc.nextLine());
        
        System.out.print("Login de acesso > ");
        Conta.setLogin(sc.nextLine());

        System.out.print("Senha de acesso > ");
        conta.setSenha(sc.nextLine());

        


        

        sc.close();
        }

    private int getNewID(){
        int id=0;
        

        return id;
    }        

}

