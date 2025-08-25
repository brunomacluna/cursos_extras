package Herança;

import java.awt.*;
import java.applet.*;

/*
 * NÃO FIZ ESSA ATIVIDADE, PEDI PARA O GEMINI FAZER POIS APPLET FOI DESCONTINUADO A PARTIR DO JAVA 9 * 
 */

public class DrawShapes extends Applet {
    Font font;
    Color darkGrayColor;
    Color grayColor;
    Color whiteColor;

    public void init() {
        // A fonte é Arial, tamanho 18 e em itálico
        font = new Font("Arial", Font.ITALIC, 18);
        
        // As cores foram alteradas para preto, branco e cinza, conforme o pedido
        darkGrayColor = Color.darkGray;
        whiteColor = Color.white;
        grayColor = Color.gray;

        // Define a cor de fundo do applet
        setBackground(whiteColor);
    }

    public void stop() {
    }

    /**
     * Este método pinta as formas na tela
     */
    public void paint(Graphics graph) {
        // Define a fonte
        graph.setFont(font);
        
        // Cria um título
        graph.setColor(Color.black); // Título em preto para contraste
        graph.drawString("Draw Shapes", 90, 20);
        
        // Define a cor para a primeira forma (cinza)
        graph.setColor(grayColor);
        // Desenha um retângulo
        graph.drawRect(120, 120, 120, 120);
        // Preenche um retângulo
        graph.fillRect(115, 115, 90, 90);
        
        // Define a cor para a próxima forma (cinza escuro)
        graph.setColor(darkGrayColor);
        // Desenha um círculo
        graph.fillArc(110, 110, 50, 50, 0, 360);
        
        // Define a cor para a próxima forma (branco, que é a cor de fundo)
        graph.setColor(whiteColor);
        // Desenha outro retângulo
        graph.drawRect(50, 50, 50, 50);
        
        // Preenche um retângulo
        graph.fillRect(50, 50, 60, 60);
    }
}
