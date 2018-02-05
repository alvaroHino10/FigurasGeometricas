package bo.edu.umss.cs.ceis;

public class Circulo extends Figura {
    double radio;
    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double area (){
        double area = (2*Math.pow(radio,2)*Math.PI);
        return area;
    }
}
