public class noparaandreturn{
    public String getWelcomeMessage() {
        return "Welcome to bangalore";
    }

    public static void main(String[] args) {
        
        noparaandreturn welcomeMessage = new noparaandreturn();
        
        
        String message = welcomeMessage.getWelcomeMessage();
    
        System.out.println(message);
    }
}