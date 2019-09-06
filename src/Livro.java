

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Livro implements Comparable<Livro> {

    private String title;
    private String Author;
    private int year;
    GestaoBiblioteca check = new GestaoBiblioteca();

    public Livro() {
    }

    public Livro(String title, String Author, int year) {
        this.title = title;
        this.Author = Author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void orderAscendente(ArrayList<Livro> a) {
        Collections.sort(a);
        String aux = exibe(a);
        JOptionPane.showMessageDialog(null, aux);
    }

    public void orderDescendente(ArrayList<Livro> a) {
        Collections.sort(a, Collections.reverseOrder());
        String aux = exibe(a);
        JOptionPane.showMessageDialog(null, aux);
    }

    public void changeElements(ArrayList<Livro> a) {
        for (int i = 0; i < a.size(); i++) {
            for (int j = 1; j < a.size(); j++) {
                if (a.get(i).getAuthor().equalsIgnoreCase(a.get(j).getAuthor())) {
                    Collections.swap(a, i, j);
                }
            }
        }
        String aux = exibe(a);
        JOptionPane.showMessageDialog(null, aux);
    }

    @Override
    public int compareTo(Livro other) {

        int aux = this.title.compareTo(other.getTitle());
        int aux2 = this.Author.compareTo(other.getAuthor());

        int t = check.getCheckT();
        int a = check.getCheckT();
        int y = check.getCheckY();

        
        if (t == 1) {
            if (aux < 0) {
                return -1;
            } else if (aux > 0) {
                return 1;
            }
        }

        if (a == 1) {
            if (aux2 < 0) {
                return -1;
            } else if (aux2 > 0) {
                return 1;
            }
        }

        if (y == 1) {
            if (this.year < other.getYear()) {
                return -1;
            } else if (this.year > other.getYear()) {
                return 1;
            }
        }

        return 0;
    }

    public String exibe(ArrayList<Livro> a) {
        String aux = "TITLE | AUTHOR | YEAR \n";
        for (int i = 0; i < a.size(); i++) {
            aux = aux + "| " + a.get(i).getTitle() + " | "
                    + a.get(i).getAuthor() + " | "
                    + Integer.toString(a.get(i).getYear()) + "\n";
        }
        return aux;
    }
}
