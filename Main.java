public class Main {
    public static void main(String[] args) {
        BodyIndexService service = new BodyIndexService();
        double index = service.calculate(70, 156);
        System.out.println(index);
    }
}