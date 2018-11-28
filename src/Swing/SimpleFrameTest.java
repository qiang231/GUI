package Swing;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class SimpleFrameTest {


    public static void main(String[] args) {

        Frame frame = new Frame("ws");

        Ellipse2D e = new Ellipse2D.Double(150,200,100,50);

        Rectangle2D r = new Rectangle2D.Double();
        //设置窗体标题
        frame.setTitle("hello");
//        //设置窗体大小
//        frame.setSize(400,300);
//        //设置窗体位置
//        frame.setLocation(400,200);

        frame.setBounds(400, 200, 400, 300);
        //调用方法，让窗体可见
        frame.setVisible(true);




//        frame.addWindowListener(new WindowListener() {
//            @Override
//            public void windowOpened(WindowEvent e) {
//                System.out.println("sadsdsd");
//            }
//
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//
//            @Override
//            public void windowClosed(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowIconified(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowDeiconified(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowActivated(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowDeactivated(WindowEvent e) {
//
//            }
//        });
//        EventQueue.invokeLater(() ->
//        {
//            SimpleFrame frame1 = new SimpleFrame();
//            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame1.setVisible(true);
//        });

    }


    static class SimpleFrame extends JFrame {
        private static final int DEFAULT_WIDTH = 300;
        private static final int DEFAULT_HEIGHT = 300;

        public SimpleFrame() {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension screenSize = toolkit.getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;

            setSize(screenWidth / 2, screenHeight / 2);
//            setBounds(16,70,DEFAULT_WIDTH,DEFAULT_HEIGHT);
            setLocationByPlatform(true);
//            Image image = new ImageIcon("icon.gif").getImage();
//            setIconImage(image);
        }
    }
}
