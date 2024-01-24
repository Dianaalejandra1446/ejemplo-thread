public class App4 {
    static int Num_Clientes =50;
    static int Num_Filas = 25;
    static int Num_Columnas =25;
    static int[][] sillas = new int[Num_Filas][Num_Columnas];
    static Cliente[] clientes = new Cliente[Num_Clientes];

    public static void main(String[] args) {
        for (int i = 0; i < Num_Clientes; i++) {
            clientes[i]= new Cliente(i);
        }
    }
}
