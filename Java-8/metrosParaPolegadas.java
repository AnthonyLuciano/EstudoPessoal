public class metrosParaPolegadas {
    public static void main(String[] args) {
        double metros,polegadas;
        int counter;

        counter = 0;
        for(polegadas = 1; polegadas <= 100; polegadas++){
            metros = polegadas * 39.37;

            System.out.println(polegadas + " polegadas sao " + metros + " metros.");
        
        
            counter++;
            if (counter == 12) {
            System.out.println("");
            counter = 0;
            }
        }
    }
}

