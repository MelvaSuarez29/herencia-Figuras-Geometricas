package geometria;

public class Circulo extends FiguraGeometrica {
    private double radio;
    private double area;
    private double perimetro;

    public Circulo(double radio, String color){
        super(color);
        this.radio = radio;
    }
    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() { return radio;}

    public void setRadio(double radio) {
        if (radio < 0) {
            System.out.println("Radio incorrecto");
        } else {
            this.radio = radio;
        }
    }
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * radio * 2;
    }
    @Override
    public void imprimirDatos() {
        System.out.println("---------------Circulo------------");
        System.out.println("radio = " + radio);
        super.imprimirDatos();


    }

}
