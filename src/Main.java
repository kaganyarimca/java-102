// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
    TreeSet<Book> books =new TreeSet<>();

    Book b1= new Book("Dava",224,"Franz Kafka","1924");
    Book b2= new Book("Bin Dokuz Seksen Dört",352,"George Orwell","1949");
    Book b3 = new Book("İnsanlık Durumu",320, "André Malraux","1933");
    Book b4= new Book("Küçük Prens",112,"Antoine de Saint-Exupery","1933");

    books.add(b1);
    books.add(b2);
    books.add(b3);
    books.add(b4);

for(Book book : books){
    System.out.println("Kitap İsmi: "+ book.getName()
            + ", Sayfa Sayısı: "+ book.getPage()
            + ", Yazar İsmi " + book.getAuthor()
            + ", Yayınlanma Tarihi: " + book.getReleaseDate()  );
    }
        System.out.println("************************* \n");

    TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getPage()- o2.getPage();
        }
    } );

    books2.add(b1);
    books2.add(b2);
    books2.add(b3);
    books2.add(b4);
        System.out.println("Sayfa sayısını göre sıralanmıştır.\n");
    for (Book book : books2){
        System.out.println("Kitap İsmi: "+ book.getName()
                + ", Sayfa Sayısı: "+ book.getPage()
                + ", Yazar İsmi " + book.getAuthor()
                + ", Yayınlanma Tarihi: " + book.getReleaseDate()  );

    }




    }
}