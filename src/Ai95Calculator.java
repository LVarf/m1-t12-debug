class Ai95Calculator {
    double ai95Price = 46.35;

    public double calculate(double volume, double discount) {
        double fullPrice = ai95Price * (1 - discount);
        return volume * fullPrice;
    }
}
