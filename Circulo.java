public class Circulo extends Figura {
    private double area,raio;
    public Circulo(String cor, double raio){
        this.cor=cor;
        this.raio=raio;
    }
    public double area(){
        return Math.PI * Math.pow(raio, 2);
    }
}