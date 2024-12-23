import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Project: md11
 * Package: PACKAGE_NAME
 * <p>
 * User: Davy Lopes
 * Email: davylopes866@gmail.com
 * Date: 20/12/2024
 * Time: 21:54
 * <p>
 */public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o nome dos usuarios");
        String nome = sc.nextLine();
        String[] names = nome.split(",");

        List<String> nomesPessoas = new ArrayList<>(Arrays.asList(names));

        nomesPessoas.sort(null);
        System.out.println("Lista de nomes:" + nomesPessoas);

        System.out.println("digite o nome dos usuarios com genero");
        String nomeG = sc.nextLine();
        String[] namesG = nomeG.split(",");

        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        for (String name : namesG) {
            if(name.endsWith("- M")) {
                homens.add(name.replace("- M", ""));
            }else if (name.endsWith("- F")){
                mulheres.add(name.replace("- F", ""));
            }
        }
        System.out.println("Lista de homens:");
        for (String homem : homens) {
            System.out.println(homem);
        }
        System.out.println("Lista de mulheres:");
        for (String mulher : mulheres) {
            System.out.println(mulher);
        }

    }
}
