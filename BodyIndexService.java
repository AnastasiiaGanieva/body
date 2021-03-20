public class BodyIndexService {
    public double calculate(int massa, int rost) {
        double index = (double) massa / (rost * rost);
        int a = (int) (index * 1000);
        double c = (double) a / 1000;
        return c;
    }
}

