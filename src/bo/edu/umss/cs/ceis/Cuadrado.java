package bo.edu.umss.cs.ceis;

public class Cuadrado extends Figura {
    private double lado;
    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double getLado (){
        return lado;
    }
    public double area(){
        double area = getLado()*getLado();
        return area;
    }
}
