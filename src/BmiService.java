public class BmiService {
    public int calculate(int weight, double height) {
        double massIndex = weight / (height * height);
        return (int) massIndex;
    }
}