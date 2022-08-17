package com.syntax.javaclass25;

public class Task1 {
    /*
    Create a class File that will have the following behaviors:
    open, edit, close. Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file
    we need Microsoft Word to be installed etc
     */
    public static void main(String[] args) {

        File[] files={new JavaFile(), new PDFFile(), new WordFile()}; // File[] is the parent class so thats why I use to
        // create an array
        // example: Scanner[] scanners={new Scanner(System.in), new String()};
        for (File file:files){
            file.open();
            file.edit();
            file.close();
        }
    }


}

abstract class File {
    private String name="MS Office File";

    // we can have everything ins an abstract class but not a body in abstract method
    abstract void open();
    void edit(){
        System.out.println(name);
        System.out.println("Editing the file");
    }
    void close(){
        System.out.println("Closing the file");
    }
}

class JavaFile extends File{

    void open(){
        System.out.println("Use Intellij to open Java files");
    }

    @Override
    void edit() {
        System.out.println("Editing the file with intellij");
    }
}

class WordFile extends File{

    @Override
    void open() {
        System.out.println("Use Microsoft word to open de word file");
    }
}

class PDFFile extends File{

    @Override
    void open() {
        System.out.println("Use Adobe reader to open pdf file");
    }
}
