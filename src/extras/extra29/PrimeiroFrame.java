package extras.extra29;
import java.awt.*;

public class PrimeiroFrame extends Frame {
    PrimeiroFrame(){
        Button b = new Button("Clicada");
        b.setBounds(50, 50, 100, 50);

        add(b);

        setSize(300, 300);
        setTitle("Primeiro Frame");
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        PrimeiroFrame primeiro = new PrimeiroFrame();
    }
}

