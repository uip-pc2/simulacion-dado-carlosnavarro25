package dados;

public class Dados {
    private Integer lanzar;


    public Dados() {

        this.lanzar = 1 + (int)(Math.random() * ((6 - 1) + 1));

    }


    public Integer getLanzar() {
        return lanzar;
    }

    public int lanzamiento() {
        System.out.println("Simulacion de dados");
        System.out.println("Tirando dados.........");
        double probabilidad_lanzar = Math.random();
        System.out.println("Te salio el numero: " +lanzar);
        System.out.println("Incluyendo a la lista de resultados ");

        return 0;
    }
}
