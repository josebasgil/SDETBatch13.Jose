package com.syntax.javaclass20;

public class Task3 {
    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own
    features and behaviour. Test all 4 classes
     */
    public static void main(String[] args) {
        ChemistryTeacher chemistryteacher=new ChemistryTeacher();
        chemistryteacher.name="Adem";
        chemistryteacher.favouriteChemSubject="Organic";
        chemistryteacher.teachesChem();
    }
}

class Teacher {
    String name;
    String typeOfTeacher;
    void teach(){
        System.out.println(name+" teaches "+typeOfTeacher);
    }
}

class MathTeacher extends Teacher{
    String specialMathSubject;
    public void teachesMath(){
        System.out.println(name+" teaches math and his favourite subject is "+specialMathSubject);
    }
}

class ChemistryTeacher extends Teacher{
    String favouriteChemSubject;
    public void teachesChem(){
        System.out.println(name+" teaches chemistry and his favourite subject is "+favouriteChemSubject);
    }
}

class PianoTeacher extends Teacher{
    String favouriteStyle;
    public void TeachesPiano(){
        System.out.println(name+" teaches math and his favourite style is "+favouriteStyle);
    }
}
