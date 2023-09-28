```java
public class Main {
    public static void main(String[] args) {
// Создание объектов авторов
        Author author1 = new Author("Имя1", "Фамилия1");
        Author author2 = new Author("Имя2", "Фамилия2");

// Создание объектов книг
        Book book1 = new Book("Название1", author1, 2020);
        Book book2 = new Book("Название2", author2, 2021);

// Вывод информации о первой книге
        System.out.println("Книга 1: " + book1.getTitle());
        System.out.println("Автор книги 1: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("Год публикации книги 1: " + book1.getPublicationYear());

// Вывод информации о второй книге
        System.out.println("Книга 2: " + book2.getTitle());
        System.out.println("Автор книги 2: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
        System.out.println("Год публикации книги 2: " + book2.getPublicationYear());

// Изменение года публикации первой книги
        book1.setPublicationYear(2022);

// Вывод обновленного года публикации первой книги
        System.out.println("Обновленный год публикации книги 1: " + book1.getPublicationYear());
    }
}
```/