public class index {

    public static void main(String[] args) {
        int index = 0;
        String[] message = {"oi ", "estou ", "aprendendo ", "java" }; 
        while (index < message.length){
            System.out.println(index + " - " + message[index]);
            index ++;
        }
    }
}