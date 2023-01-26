public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
            public void ligar(){
                ligada = true;
                System.out.println("A televisão está ligada");
            }
            public void desligar(){
                ligada = true;
                System.out.println("A televisão não está ligada");

            }

            public void aumentarVolume(){
                volume++;
                System.out.println("Volume atual " + volume);
            }


            public void diminuirVolume(){
                volume--;
                System.out.println("Volume atual " + volume);
            }
}
