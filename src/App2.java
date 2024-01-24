public class App2 {
    public static void main(String[] args) {
        new Thread(new ViajaTarea("Bogota")).start();
        new Thread(new ViajaTarea("Cartagena")).start();
        new Thread(new ViajaTarea("Medellin")).start();
        new Thread(new ViajaTarea("Bucaramanga")).start();
        
    }
}
