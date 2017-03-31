package dados;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Dados> lista_dados = new ArrayList<Dados>();

        while(true) {
            int opcion = 0;

            System.out.println("\nSimulacion de dados");
            System.out.println("1. Tira un dado");
            System.out.println("2. Ver lista de resultados..");
            System.out.println("3. Salir");

            try {
                System.out.print("OPCION: ");
                opcion = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.err.println("ERROR: Opción inválida.");
            }

            switch (opcion) {
                case 1:
                    Dados d = new Dados();
                    int estado = d.lanzamiento();

                    if (estado == 0)
                        lista_dados.add(d);
                    break;
                case 2:
                    if (lista_dados.size() == 0)
                        System.out.println("No tienes resultados todavia");
                    else System.out.println("Tus resultados: "); {for (Dados dd : lista_dados) {

                        System.out.println(Math.round(dd.getLanzar()));
                    }
                }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR: Opción inválida");
            }
        }
    }
}
