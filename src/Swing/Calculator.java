package Swing;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            var frame = new CalculatorFrame();
            frame.setTitle("Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
