package org.cmbk.miu.cs525.lectures.lesson4.composite;

public class Application {
    public static void main(String[] args) {
        Directory cDir = new Directory("C");
        Directory appDir = new Directory("applications");
        Directory dataDir = new Directory("myData");
        Directory courseDir = new Directory("cs525");
        File excelFile = new File("ms_excel.exe", 2353256);
        File wordFile = new File("ms_word.exe", 3363858);
        File studentsFile = new File("students.doc", 34252);
        cDir.addComponent(appDir);
        cDir.addComponent(dataDir);
        dataDir.addComponent(courseDir);
        appDir.addComponent(excelFile);
        appDir.addComponent(wordFile);
        courseDir.addComponent(studentsFile);
        cDir.print();
    }
}
