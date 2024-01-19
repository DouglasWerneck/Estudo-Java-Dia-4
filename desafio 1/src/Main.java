public class Main {

    public static void main(String[] args) {
        System.out.println("Usando incrementoPar:");
        incrementoPar();

        System.out.println("\nUsando restoPar:");
        restoPar();

        System.out.println("\nUsando restoImpar:");
        restoImpar();
    }

    public static void incrementoPar() {
        int valor = 100;
        for(int index = 0; index < valor ; index+= 2){
            System.out.print(index + " ");
        }
    }

    public static void restoPar() {

        for(int index = 0; index < 100 ; index+= 2){
            if(index % 2 == 0){
                System.out.print(index + " ");
            }
        }
    
    }

    public static void restoImpar() {

        for(int index = 0; index < 100 ; index++){
            if(index % 2 != 0){
                System.out.print(index + " ");
            }
        }
    }
}