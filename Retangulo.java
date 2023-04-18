public class Retangulo extends Figura{
    private double base;
    private double altura;
    public Retangulo(String cor, double base, double altura){
        this.cor=cor;
        this.base=base;
        this.altura=altura;
    }
    public double area(){
        return base*altura;
    }
}
