package extras.extra30;

import java.awt.*;

public class SegundoFrame {
    SegundoFrame(String titulo){
        Frame f = new Frame();
        Label l = new Label("Rótulo id empregado");
        Button b = new Button("Salvar");
        TextField tf = new TextField();

        l.setBounds(20,30,120, 30);
        b.setBounds(120,60,80, 30);
        tf.setBounds(20,60,120,30);
        //criou e editou cada um dos elementos e agora adiciona nos frames.

        f.add(b);
        f.add(l);
        f.add(tf);

        f.setSize(400,300);

        f.setTitle(titulo);

        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        SegundoFrame f = new SegundoFrame("O homem pode fazer o que quer, mas não pode querer o que quer");
    }
}
