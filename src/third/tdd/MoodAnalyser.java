package third.tdd;

public class MoodAnalyser {

    public String analyseMood(String message) {


        if (message.toLowerCase().contains("отлично!")) return "Happy";
        if (message.toLowerCase().contains("ужасно!")) return "Unhappy";
    return "Normal";
    }
}