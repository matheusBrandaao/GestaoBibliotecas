

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Livro implements Comparable<Livro> {

    private String title;
    private String author;
    private int year;
    private static boolean ORDEM;
    private static boolean ORDEM2;
    private static boolean ORDEM3;

    public Livro() {}

    public Livro(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
    
    public boolean getOrdem(){
        return ORDEM;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String Author) {
        this.author = Author;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void orderAttribute(boolean orderType, String attributeName){
        if(attributeName.equals("Title")) {
            this.ORDEM = orderType;
        } else if(attributeName.equals("Author")) {
            this.ORDEM2 = orderType;
        } else if(attributeName.equals("Year")) {
            this.ORDEM3 = orderType;
        }
    }

    public void orderTitle(ArrayList<Livro> a) {
        Collections.sort(a, Livro.Comparators.TITLE);
    }
    
    public void orderAuthor(ArrayList<Livro> a) {
        Collections.sort(a, Livro.Comparators.AUTHOR);
    }
    
    public void orderYear(ArrayList<Livro> a) {
        Collections.sort(a, Livro.Comparators.YEAR);
    }
    
    public void doubleOrder(ArrayList<Livro> a){
        Collections.sort(a, Livro.Comparators.DOUBLE_COMPARATOR);
    }
    
    public void tripleOrder(ArrayList<Livro> a){
        Collections.sort(a, Livro.Comparators.TITULO_AUTOR_ANO);
    }

    @Override
    public int compareTo(Livro other) {
         return Comparators.TITLE.compare(this, other);
    }

    public String showValues(ArrayList<Livro> a) {
        String aux = "TITLE | AUTHOR | YEAR \n";
        for (int i = 0; i < a.size(); i++) {
            aux = aux + "| " + a.get(i).getTitle() + " | "
                    + a.get(i).getAuthor() + " | "
                    + Integer.toString(a.get(i).getYear()) + "\n";
        }
        return aux;
    }

    private static class Comparators {

    public static Comparator<Livro> TITLE = new Comparator<Livro>()
    {
        @Override
        public int compare(Livro livro1, Livro livro2){
            if(ORDEM){
            return livro1.getTitle().compareTo(livro2.getTitle());
        }
            if(!ORDEM){
            return livro2.getTitle().compareTo(livro1.getTitle());
        }
        return 1;
        }
    };

    
    public static Comparator<Livro> AUTHOR = new Comparator<Livro>()
    {
        @Override
        public int compare(Livro livro1, Livro livro2){
            if(ORDEM2){
            return livro1.getAuthor().compareTo(livro2.getAuthor());
            }
            if(!ORDEM2){
            return livro2.getAuthor().compareTo(livro1.getAuthor());
            }
            return 1;
        }
    };

    public static Comparator<Livro> YEAR = new Comparator<Livro>()
    {
        @Override
        public int compare(Livro livro1, Livro livro2){
            if(ORDEM3){
            return livro1.year - livro2.year;
            }
            if(!ORDEM3){
            return livro2.year - livro1.year;
            }
            return 1;
        }
    };
    
    public static Comparator<Livro> DOUBLE_COMPARATOR = new Comparator<Livro>()
    {
        public int compare(Livro livro1, Livro livro2){
            int i = livro1.getAuthor().compareTo(livro2.getAuthor());
            int j = livro1.getYear() - livro2.getYear();
                if(i == 0){
                    if(ORDEM){
                        return livro1.getTitle().compareTo(livro2.getTitle());
                    }
                    if(!ORDEM){
                        return livro2.getTitle().compareTo(livro1.getTitle());
                    }
                }
                if(i != 0){
                    if(ORDEM2){
                        return livro1.getAuthor().compareTo(livro2.getAuthor());
                    }
                    if(!ORDEM2){
                        return livro2.getAuthor().compareTo(livro1.getAuthor());
                    }
                }
                if(j == 0){
                    if(ORDEM2){
                        return livro1.getAuthor().compareTo(livro2.getAuthor());
                    }
                    if(!ORDEM2){
                        return livro2.getAuthor().compareTo(livro1.getAuthor());
                    }
                }
                if(j == 0){
                    if(ORDEM){
                        return livro1.getTitle().compareTo(livro2.getTitle());
                    }
                    if(!ORDEM){
                        return livro2.getTitle().compareTo(livro1.getTitle());
                    }
                }
                if(j != 0){
                    if(ORDEM3){
                        return livro1.getYear() - livro2.getYear();
                    }
                    if(!ORDEM3){
                        return livro2.getYear() - livro1.getYear();
                    }
                }
            return 1;
        }
    };

    public static Comparator<Livro> TITULO_AUTOR_ANO = new Comparator<Livro>()
    {
        public int compare(Livro livro1, Livro livro2){
        int i = livro1.getAuthor().compareTo(livro2.getAuthor());
        int j = livro1.getYear() - livro2.getYear();
            if(i == 0 && j == 0){
                if(ORDEM){
                    return livro1.getTitle().compareTo(livro2.getTitle());
                }
                if(!ORDEM){
                    return livro2.getTitle().compareTo(livro1.getTitle());
                }
            }
            if(j == 0){
                if(ORDEM2){
                    return livro1.getAuthor().compareTo(livro2.getAuthor());
                }
                if(!ORDEM2){
                    return livro2.getAuthor().compareTo(livro1.getAuthor());
                }
            }
            if(j == 0){
                if(ORDEM){
                    return livro1.getTitle().compareTo(livro2.getTitle());
                }
                if(!ORDEM){
                    return livro2.getTitle().compareTo(livro1.getTitle());
                }
            }
            if(i == 0){
                if(ORDEM){
                    return livro1.getTitle().compareTo(livro2.getTitle());
                }
                if(!ORDEM){
                    return livro2.getTitle().compareTo(livro1.getTitle());
                }
            }
            if(i == 0){
                if(ORDEM3){
                    return livro1.getYear() - livro2.getYear();
                }
                if(!ORDEM3){
                    return livro2.getYear() - livro1.getYear();
                }
            }
            if(i != 0 && j != 0){
                if(ORDEM3){
                    return livro1.getYear() - livro2.getYear();
                }
                if(!ORDEM3){
                    return livro2.getYear() - livro1.getYear();
                }
            }
            return 1;  
    }
    };
    }
}
