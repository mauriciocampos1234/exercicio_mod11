/**
 * @author MauricioCampos
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SepararPorSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        System.out.println("Digite os nomes e sexos (formato: nome-sexo), separados por vírgula:");
        String input = scanner.nextLine();


        String[] entradas = input.split(",");


        for (String entrada : entradas) {

            String[] partes = entrada.split("-");

            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toLowerCase();


                if (sexo.equals("masculino")) {
                    grupoMasculino.add(nome);
                } else if (sexo.equals("feminino")) {
                    grupoFeminino.add(nome);
                } else {
                    System.out.println("Sexo inválido para o nome: " + nome);
                }
            } else {
                System.out.println("Formato inválido para a entrada: " + entrada);
            }
        }


        System.out.println("\nGrupo Masculino:");
        for (String nome : grupoMasculino) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : grupoFeminino) {
            System.out.println(nome);
        }

        //
    }
}






