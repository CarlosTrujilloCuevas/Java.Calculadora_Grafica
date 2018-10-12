package Graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana {

    private String aux;
    private Double a, b, c;
    private int operacion;
    private int existenciaPunto = 0;
    private String[] ab;

    /*1/Suma_2/Resta_3/Mult_4/Div_5/Porc_6/Sqrt*/
    public Ventana() {
        /*Frame*/
        Frame = new JFrame("Calculadora");
        Frame.setSize(300, 400);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setResizable(false);
        Frame.setLayout(null);
        Frame.setLocationRelativeTo(null);
        Oyente(Frame);
        /*Panel*/ Panel = new JPanel();
        Panel.setSize(Frame.getSize());
        Panel.setLayout(null);
        /*Btn*/
        insertBtn();
        /*Pantalla*/
        insertPantalla();
        /*Visibles*/
        Frame.add(Panel);
        Frame.setVisible(true);
    }

    public final void insertBtn() {
        /*btn 0*/
        btn0 = new JButton("0");
        setBtn(btn0);
        btn0.setBounds(0, 311, 60, 60);
        btn0.addActionListener((e) -> {
            if (!textoPantalla.getText().equals("0")) {
                aux = textoPantalla.getText();
                aux += "0";
                textoPantalla.setText(aux);
            }
        });
        /*btn punto*/
        btnPoint = new JButton(".");
        setBtn(btnPoint);
        btnPoint.setBounds(60, 311, 60, 60);
        btnPoint.addActionListener((e) -> {
            if (existenciaPunto == 0) {
                aux = textoPantalla.getText();
                aux += ".";
                textoPantalla.setText(aux);
                existenciaPunto = 1;

            }
        });

        /*btn Change*/
        btnChange = new JButton("+/-");
        setBtn(btnChange);
        btnChange.setBounds(120, 311, 60, 60);
        /*btn 1*/
        btn1 = new JButton("1");
        setBtn(btn1);
        btn1.setBounds(0, 251, 60, 60);
        btn1.addActionListener((e) -> {
            if (!textoPantalla.getText().equals("0")) {
                aux = textoPantalla.getText();
                aux += "1";
                textoPantalla.setText(aux);
            } else {
                textoPantalla.setText("1");
            }
        });
        /*btn 2*/
        btn2 = new JButton("2");
        setBtn(btn2);
        btn2.setBounds(60, 251, 60, 60);
        btn2.addActionListener((e) -> {
            if (!textoPantalla.getText().equals("0")) {
                aux = textoPantalla.getText();
                aux += "2";
                textoPantalla.setText(aux);
            } else {
                textoPantalla.setText("2");
            }
        });
        /*btn 3*/
        btn3 = new JButton("3");
        setBtn(btn3);
        btn3.setBounds(120, 251, 60, 60);
        btn3.addActionListener((e) -> {
            if (!textoPantalla.getText().equals("0")) {
                aux = textoPantalla.getText();
                aux += "3";
                textoPantalla.setText(aux);
            } else {
                textoPantalla.setText("3");
            }
        });
        /*btn 4*/
        btn4 = new JButton("4");
        setBtn(btn4);
        btn4.setBounds(0, 191, 60, 60);
        btn4.addActionListener((e) -> {
            if (!textoPantalla.getText().equals("0")) {
                aux = textoPantalla.getText();
                aux += "4";
                textoPantalla.setText(aux);
            } else {
                textoPantalla.setText("4");
            }
        });
        /*btn 5*/
        btn5 = new JButton("5");
        setBtn(btn5);
        btn5.setBounds(60, 191, 60, 60);
        btn5.addActionListener((e) -> {
            if (!textoPantalla.getText().equals("0")) {
                aux = textoPantalla.getText();
                aux += "5";
                textoPantalla.setText(aux);
            } else {
                textoPantalla.setText("5");
            }
        });
        /*btn 6*/
        btn6 = new JButton("6");
        setBtn(btn6);
        btn6.setBounds(120, 191, 60, 60);
        btn6.addActionListener((e) -> {
            if (!textoPantalla.getText().equals("0")) {
                aux = textoPantalla.getText();
                aux += "6";
                textoPantalla.setText(aux);
            } else {
                textoPantalla.setText("6");
            }
        });
        /*btn 7*/
        btn7 = new JButton("7");
        setBtn(btn7);
        btn7.setBounds(0, 131, 60, 60);
        btn7.addActionListener((e) -> {
            if (!textoPantalla.getText().equals("0")) {
                aux = textoPantalla.getText();
                aux += "7";
                textoPantalla.setText(aux);
            } else {
                textoPantalla.setText("7");
            }
        });
        /*btn 8*/
        btn8 = new JButton("8");
        setBtn(btn8);
        btn8.setBounds(60, 131, 60, 60);
        btn8.addActionListener((e) -> {
            if (!textoPantalla.getText().equals("0")) {
                aux = textoPantalla.getText();
                aux += "8";
                textoPantalla.setText(aux);
            } else {
                textoPantalla.setText("8");
            }
        });
        /*btn 9*/
        btn9 = new JButton("9");
        setBtn(btn9);
        btn9.setBounds(120, 131, 60, 60);
        btn9.addActionListener((e) -> {
            if (!textoPantalla.getText().equals("0")) {
                aux = textoPantalla.getText();
                aux += "9";
                textoPantalla.setText(aux);
            } else {
                textoPantalla.setText("9");
            }
        });
        /*btn Suma*/
        btnSuma = new JButton("+");
        setBtn(btnSuma);
        btnSuma.setBounds(180, 251, 60, 120);
        btnSuma.addActionListener((e) -> {
            if (!textoPantalla.getText().equals("0")) {

                if (operacion == 0) {
                    aux = textoPantalla.getText();
                    aux += " + ";
                    textoPantalla.setText(aux);
                    operacion = 1;
                }
            }
        });
        /*btn Resta*/
        btnResta = new JButton("-");
        setBtn(btnResta);
        btnResta.setBounds(240, 251, 60, 60);
        btnResta.addActionListener((e) -> {
            if (!textoPantalla.getText().equals("0")) {

                if (operacion == 0) {
                    aux = textoPantalla.getText();
                    aux += " - ";
                    textoPantalla.setText(aux);
                    operacion = 2;
                }
            }
        });
        /*btn resultado*/
        btnResult = new JButton("=");
        setBtn(btnResult);
        btnResult.setBounds(240, 311, 60, 60);
        btnResult.addActionListener((ActionEvent e) -> {
            aux = textoPantalla.getText();
            if (operacion != 6) {
                ab = aux.split(" ");
                String num1 = format(ab[0]);
                String num2 = format(ab[2]);
                a = Double.parseDouble(num1);
                b = Double.parseDouble(num2);
            } else {
                ab = aux.split(" ");
                String num1 = format(ab[2]);
                a = Double.parseDouble(num1);
            }
            switch (operacion) {
                case 1:
                    c = a + b;
                    aux = Double.toString(c);
                    textoPantalla.setText(aux);
                    break;
                case 2:
                    c = a - b;
                    aux = Double.toString(c);
                    textoPantalla.setText(aux);
                    break;
                case 3:
                    c = a * b;
                    aux = String.format("%,.2f", c);
                    textoPantalla.setText(aux);
                    break;
                case 4:
                    c = a / b;
                    aux = String.format("%,.2f", c);
                    textoPantalla.setText(aux);
                    break;
                case 5:
                    c = (a * b) / 100;
                    aux = String.format("%,.2f", c);
                    textoPantalla.setText(aux);
                    break;
                case 6:
                    Double d = (Math.sqrt(a));
                    aux = String.format("%,.3f", d);
                    aux = format(aux);
                    textoPantalla.setText(aux);
                    break;
            }
            operacion = 0;
            existenciaPunto = 1;
        });

        /*btn Multiplicacion*/
        btnMult = new JButton("X");
        setBtn(btnMult);
        btnMult.setBounds(180, 191, 60, 60);
        btnMult.addActionListener((e) -> {
            if (!textoPantalla.getText().equals("0")) {
                if (operacion == 0) {
                    operacion = 3;
                    aux = textoPantalla.getText();
                    aux += " x ";
                    textoPantalla.setText(aux);
                }
            }
        });
        /*btn Division*/
        btnDiv = new JButton("/");
        setBtn(btnDiv);
        btnDiv.setBounds(240, 191, 60, 60);
        btnDiv.addActionListener((e) -> {
            if (!textoPantalla.getText().equals("0")) {

                if (operacion == 0) {
                    aux = textoPantalla.getText();
                    aux += " / ";
                    textoPantalla.setText(aux);
                    operacion = 4;

                }
            }
        });
        /*btn Percentage*/
        btnPorc = new JButton("%");
        setBtn(btnPorc);
        btnPorc.setBounds(180, 131, 60, 60);
        btnPorc.addActionListener((e) -> {
            if (!textoPantalla.getText().equals("0")) {

                if (operacion == 0) {
                    aux = textoPantalla.getText();
                    aux += " % ";
                    textoPantalla.setText(aux);
                    operacion = 5;

                }
            }
        });
        /*btn SQRT*/
        btnSqrt = new JButton("√");
        setBtn(btnSqrt);
        btnSqrt.setBounds(240, 131, 60, 60);
        btnSqrt.addActionListener((e) -> {
            if (!textoPantalla.getText().equals("0")) {

                if (operacion == 0) {
                    aux = textoPantalla.getText();
                    aux = " √ " + aux;
                    textoPantalla.setText(aux);
                    operacion = 6;

                }
            }
        });
        //////////////////////////
        this.Panel.add(btn0, 0);
        this.Panel.add(btnPoint, 0);
        this.Panel.add(btnChange, 0);
        this.Panel.add(btn1, 0);
        this.Panel.add(btn2, 0);
        this.Panel.add(btn3, 0);
        this.Panel.add(btn4, 0);
        this.Panel.add(btn5, 0);
        this.Panel.add(btn6, 0);
        this.Panel.add(btn7, 0);
        this.Panel.add(btn8, 0);
        this.Panel.add(btn9, 0);
        this.Panel.add(btnSuma, 0);
        this.Panel.add(btnResta, 0);
        this.Panel.add(btnResult, 0);
        this.Panel.add(btnMult, 0);
        this.Panel.add(btnDiv, 0);
        this.Panel.add(btnPorc, 0);
        this.Panel.add(btnSqrt, 0);

    }

    public void setBtn(JButton btn) {
        btn.setBorderPainted(true);
        btn.setFocusPainted(false);
        btn.setContentAreaFilled(false);

        btn.setFocusable(true); //Importante para hacer funcionar el KeyListener
        btn.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    if (textoPantalla.getText().equals("")) {
                        textoPantalla.setText("0");
                    }
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        String aux2 = aux.substring((aux.length() - 1), aux.length());
                        System.out.println(aux2);
                        if (aux2.equals(".")) {
                            existenciaPunto = 0;
                        }
                        if (aux2.equals("+") || aux2.equals("-") || aux2.equals("x") || aux2.equals("/") || aux2.equals("%") || aux2.equals("√")) {
                            operacion = 0;
                        }
                        aux = aux.substring(0, (aux.length() - 1));
                        textoPantalla.setText(aux);
                    }

                }

                if (e.getKeyCode() == KeyEvent.VK_1) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "1";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("1");
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_2) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "2";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("2");
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_3) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "3";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("3");
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_4) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "4";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("4");
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_5) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "5";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("5");
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_6) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "6";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("6");
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_7) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "7";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("7");
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_8) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "8";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("8");
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_9) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "9";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("9");
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    aux = textoPantalla.getText();
                    if (operacion != 6) {
                        ab = aux.split(" ");
                        a = Double.parseDouble(ab[0]);
                        b = Double.parseDouble(ab[2]);
                    } else {
                        ab = aux.split(" ");
                        a = Double.parseDouble(ab[2]);
                    }
                    switch (operacion) {
                        case 1:
                            c = a + b;
                            aux = Double.toString(c);
                            textoPantalla.setText(aux);
                            break;
                        case 2:
                            c = a - b;
                            aux = Double.toString(c);
                            textoPantalla.setText(aux);
                            break;
                        case 3:
                            c = a * b;
                            aux = Double.toString(c);
                            textoPantalla.setText(aux);
                            break;
                        case 4:
                            c = a / b;
                            aux = Double.toString(c);
                            textoPantalla.setText(aux);
                            break;
                        case 5:
                            c = (a * (b / 100));
                            aux = String.format("%,.3f", c);
                            aux = format(aux);
                            textoPantalla.setText(aux);
                            break;
                        case 6:
                            Double d = (Math.sqrt(a));
                            aux = String.format("%,.3f", d);
                            aux = format(aux);
                            textoPantalla.setText(aux);
                            break;
                    }
                    operacion = 0;
                    existenciaPunto = 1;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

    }

    public void insertPantalla() {
        Font myFont = new Font("TimesRoman", Font.PLAIN, 40);
        FondoPantalla = new JPanel();
        FondoPantalla.setSize(300, 131);
        FondoPantalla.setBackground(Color.BLACK);
        FondoPantalla.setLayout(null);

        textoPantalla = new JTextField("0");
        textoPantalla.setBorder(null);
        textoPantalla.setEditable(false);
        textoPantalla.setSize(280, 131);
        textoPantalla.setOpaque(false);
        textoPantalla.setFont(myFont);
        textoPantalla.setForeground(Color.WHITE);
        textoPantalla.setHorizontalAlignment(JTextField.RIGHT);

        FondoPantalla.add(textoPantalla, 0);
        this.Panel.add(FondoPantalla, 0);
    }

    public String format(String a) {
        String formating = "";
        for (int index = 0; index < a.length(); index++) {
            String format = a.substring(index, index + 1);
            if (format.equals(",")) {
                format = ".";
            }
            formating += format;
        }
        return formating;
    }

    public void Oyente(JFrame frame) {
        frame.setFocusable(true); //Importante para hacer funcionar el KeyListener
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    if (textoPantalla.getText().equals("")) {
                        textoPantalla.setText("0");
                    }
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        String aux2 = aux.substring((aux.length() - 1), aux.length());
                        System.out.println(aux2);
                        if (aux2.equals(".")) {
                            existenciaPunto = 0;
                        }
                        if (aux2.equals("+") || aux2.equals("-") || aux2.equals("x") || aux2.equals("/") || aux2.equals("%") || aux2.equals("√")) {
                            operacion = 0;
                        }
                        aux = aux.substring(0, (aux.length() - 1));
                        textoPantalla.setText(aux);
                    }

                }

                if (e.getKeyCode() == KeyEvent.VK_1) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "1";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("1");
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_2) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "2";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("2");
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_3) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "3";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("3");
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_4) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "4";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("4");
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_5) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "5";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("5");
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_6) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "6";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("6");
                    }
                }
                if ((e.getKeyCode() == KeyEvent.VK_7) && ((e.getModifiers() & KeyEvent.SHIFT_MASK) != 0)) {
                    if (!textoPantalla.getText().equals("0")) {

                        if (operacion == 0) {
                            aux = textoPantalla.getText();
                            aux += " / ";
                            textoPantalla.setText(aux);
                            operacion = 4;
                        }
                    }

                }
                if (e.getKeyCode() == KeyEvent.VK_7 && ((e.getModifiers() & KeyEvent.SHIFT_MASK) == 0)) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "7";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("7");
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_8) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "8";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("8");
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_9) {
                    if (!textoPantalla.getText().equals("0")) {
                        aux = textoPantalla.getText();
                        aux += "9";
                        textoPantalla.setText(aux);
                    } else {
                        textoPantalla.setText("9");
                    }
                }

                if ((e.getKeyCode() == KeyEvent.VK_PLUS) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
                    if (!textoPantalla.getText().equals("0")) {
                        if (operacion == 0) {
                            aux = textoPantalla.getText();
                            aux += " x ";
                            textoPantalla.setText(aux);
                            operacion = 3;
                        }
                    }

                }

                if (e.getKeyCode() == KeyEvent.VK_PLUS) {
                    if (!textoPantalla.getText().equals("0")) {

                        if (operacion == 0) {
                            aux = textoPantalla.getText();
                            aux += " + ";
                            textoPantalla.setText(aux);
                            operacion = 1;
                        }
                    }

                }

                if (e.getKeyCode() == KeyEvent.VK_MINUS) {
                    if (!textoPantalla.getText().equals("0")) {

                        if (operacion == 0) {
                            aux = textoPantalla.getText();
                            aux += " - ";
                            textoPantalla.setText(aux);
                            operacion = 2;
                        }
                    }

                }

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    aux = textoPantalla.getText();
                    if (operacion != 6) {
                        ab = aux.split(" ");
                        String num1 = format(ab[0]);
                        String num2 = format(ab[2]);
                        a = Double.parseDouble(num1);
                        b = Double.parseDouble(num2);

                    } else {
                        ab = aux.split(" ");
                        String num1 = format(ab[2]);
                        a = Double.parseDouble(num1);
                    }
                    switch (operacion) {
                        case 1:
                            c = a + b;
                            aux = Double.toString(c);
                            textoPantalla.setText(aux);
                            break;
                        case 2:
                            c = a - b;
                            aux = Double.toString(c);
                            textoPantalla.setText(aux);
                            break;
                        case 3:
                            c = a * b;
                            aux = Double.toString(c);
                            textoPantalla.setText(aux);
                            break;
                        case 4:
                            c = a / b;
                            aux = Double.toString(c);
                            textoPantalla.setText(aux);
                            break;
                        case 5:
                            c = (a * (b / 100));
                            aux = String.format("%,.2f", c);
                            textoPantalla.setText(aux);
                            break;
                        case 6:
                            Double d = (Math.sqrt(a));
                            aux = String.format("%,.3f", d);
                            aux = format(aux);
                            textoPantalla.setText(aux);
                            break;
                    }
                    operacion = 0;
                    existenciaPunto = 1;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

    }

    JFrame Frame;
    JPanel Panel;
    JPanel FondoPantalla;
    JTextField textoPantalla;
    JButton btn0;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btnMult;
    JButton btnSuma;
    JButton btnResta;
    JButton btnDiv;
    JButton btnPorc;
    JButton btnSqrt;
    JButton btnResult;
    JButton btnPoint;
    JButton btnChange;
}
