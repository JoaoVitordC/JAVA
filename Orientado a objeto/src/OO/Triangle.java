package OO;

public class Triangle {
    public Double A;
    public Double B;
    public Double C;

    public double area(){
        double p =(A + B + C) / 2.0;
        return Math.sqrt(p*(p- A) * (p - B) * (p - C));
    }
}

