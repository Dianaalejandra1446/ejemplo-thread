public class App {
    public static void main(String[] args) throws Exception {
        //Con hilos
        Thread h1 = new NombreThread("Diana");
        Thread h2 = new NombreThread("Juliana");
        Thread h3 = new NombreThread("Ruth");
        Thread h4 = new NombreThread("Sofia");
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h1.join();//Frenar hasta que los hilos se vayan finalizando
        h2.join();
        h3.join(); 
        System.out.println("Fin del main");

        //Class
/*         Nombre nombre = new Nombre("Maria");
        Nombre nombre2 = new Nombre("Jose");
        Nombre nombre3 = new Nombre("pedro");
        nombre.run();
        nombre2.run();
        nombre3.run(); */
    }
}
