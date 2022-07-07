public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 80; // масса тела в килограммах
        double human = 1.65; // рост в метрах
        double imt = service.calculate(mass, human);
        System.out.println(imt + " Индекс массы тела");
    }
}
