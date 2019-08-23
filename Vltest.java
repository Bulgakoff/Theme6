package gitGraphInteface;

import java.awt.
import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;

public class Vltest{
    public static void main(String[] args) {
        //создаем окно
        Jframe frame = new JFrame("VerticaleLayoutTest");
//определяем размеры
        frame.setSize(260, 150);
        frame.setDefauCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Cоздаем панель с менеджером вертикального расположения компонентов
        JPanel contents = new JPanel(new VerticalLayout());
        //Добавим кнопки и текстовое поле в панель
        contents.add(new Button("ПРодукты"));
        contents.add(new Button("Галантерея"));
        contents.add(new JTextField(20));
        //Размещаем панель в контейнере
        frame.setContentPane(contents);
//открываем окно
        frame.setVizible(true);
    }
}
