import model.aparelhoTelefonico;
import model.reprodutorMuscial;

public class main {
    public static void main(String[] args) {

        reprodutorMuscial a = new reprodutorMuscial("GTASAN");
        a.setNome("Galaxy y");
        a.setModelo("Samsung");
        a.tocar();
    }
}