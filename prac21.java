
class Degree {
    public void getDegree() {
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree {
    public void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}
class Postgraduate extends Degree {

    public void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}
public class prac21 {
    public static void main(String[] args) {
        Degree degree = new Degree();
        Undergraduate ug = new Undergraduate();
        Postgraduate pg = new Postgraduate();
        degree.getDegree();
        ug.getDegree();
        pg.getDegree();
    }
}

    

