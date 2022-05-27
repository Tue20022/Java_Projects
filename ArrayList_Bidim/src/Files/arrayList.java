package Files;

import javax.swing.*;
import java.util.ArrayList;


public class arrayList {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        int cont = 0, n;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja buscar: "));
        JOptionPane.showMessageDialog(null, "Posições: \n");

        for (int l = 0; l < 50; l++) {
            matriz.add(new ArrayList<>());
            for (int c = 0; c < 20; c++) {
                int random = (int) (Math.random() * 1001) + 50;
                matriz.get(l).add(random);

                if (matriz.get(l).get(c) == n) {
                    cont++;
                    JOptionPane.showMessageDialog(null, "Linha: " + l + "  Coluna: " + c + "\n");
                }
            }
        }

        if (cont == 0) {
            JOptionPane.showMessageDialog(null, "Número não encontrado!");
        }
    }
}
