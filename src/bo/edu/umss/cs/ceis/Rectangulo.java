package bo.edu.umss.cs.ceis;

    public class Rectangulo extends Figura {
        double base;
        double altura;
        public Rectangulo (double b, double a){
            base = b;
            altura = a;
        }

        private double getBase(){
            return base;
        }

        private double getAltura(){
            return altura;
        }
        public double area(){
            double area = getBase()*getAltura();
            return area;
        }

    }
