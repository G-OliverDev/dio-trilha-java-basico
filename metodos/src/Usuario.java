public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume(); // 24
        smartTv.diminuirVolume(); // 23
        smartTv.diminuirVolume(); // 22
        smartTv.aumentarVolume(); // 23

        System.out.println("\nTV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("\nNovo status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("\nNovo status -> TV ligada? " + smartTv.ligada);

        smartTv.mudarCanal(13);
        System.out.println("\nNovo status -> Canal atual: " + smartTv.canal);
    }
}
