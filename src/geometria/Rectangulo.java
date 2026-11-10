package geometria;

public class Rectangulo extends FiguraGeometrica {
    public double base;
    public double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {return base;}
    public void setBase(double base) {
        if(base < 0) {
            System.out.println("La base debe ser un valor positivo");
        }else{this.base = base;}
    }

    public double getAltura() {return altura;}
    public void setAltura(double altura) {
        if(altura < 0) {
            System.out.println("La altura debe ser un valor positivo");
        }else{this.altura = altura;}
    }

    @Override
    public double calcularArea(){
        return base*altura;
    }
    @Override
    public double calcularPerimetro(){
        return base+altura*2;
    }
    @Override
    public void imprimirDatos(){
        System.out.println("----------------------Rectangulo----------------");
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
        super.imprimirDatos();
    }
}
