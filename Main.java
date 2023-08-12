import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- MEUS SITES FAVORITOS -----");

        Scanner scanner = new Scanner (System.in);
        List<Website> meusWebsites = new ArrayList<>();

        String sair = "n";

        do {
            System.out.print("Qual o nome do site: ");
            String nome = scanner.nextLine();
            System.out.print("Qual o endereço do site: ");
            String url = scanner.nextLine();

            Website website = new Website();
            website.setNome(nome);
            website.setUrl(url);

            meusWebsites.add(website);

            System.out.println("Deseja sair? insira s para sair ou n para continuar");
            sair = scanner.nextLine();
        } while (!sair.equals("s"));

        System.out.println("-----------------------");
        System.out.println("Listando sites cadastrados");
        System.out.println("-----------------------");

        for (Website meuSite: meusWebsites) {
            System.out.println(meuSite.getNome() + ": " + meuSite.getUrl());
            System.out.println("-----------------------------------------");
        }
    }
}