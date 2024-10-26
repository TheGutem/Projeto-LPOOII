package Cadastro;

import java.util.Scanner;

class Professor extends Pessoa {
    int siape;

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public void cadastrar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome do professor: \n");
        setNome(entrada.nextLine());
        System.out.println("Matricula: ");
        setMatricula(entrada.nextLine());
        System.out.println("CPF: ");
        setCPF(entrada.nextLine());
    }
}
