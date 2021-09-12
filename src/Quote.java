public class Quote {
    public static String randomQuote() {
        int rando = (int) (Math.random() * 4) + 1;
        if (rando == 1) {
            return "whatever";
        } else if (rando == 2) {
            return "I like Cheese";
        } else if (rando == 3) {
            return "I eat rats";
        } else if (rando == 4) {
            return "I shed skin";
        } else {
            return "I have nothing to say";

        }
    }
}
