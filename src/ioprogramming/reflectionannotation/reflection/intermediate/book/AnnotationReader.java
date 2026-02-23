package ioprogramming.reflectionannotation.reflection.intermediate.book;

/*
 * Reads annotation value at runtime.
 */
public class AnnotationReader {

    public static void main(String[] args) {

        Class<Book> clazz = Book.class;

        // Get annotation from class
        Author author =
                clazz.getAnnotation(Author.class);

        System.out.println(
                "Author: " + author.name()
        );
    }
}