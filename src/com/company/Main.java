package com.company;

public class Main {
 /*
 Example :

Input from file  add 2
multiply 3
apply 10
Output  36
Explanation  10 + 2 * 3 = 36

Name file: dataFile

Brak Explanation.

  */
    public static void main(String[] args) {
        try{
            Reader reader = new Reader();
            Converter converter = new Converter();
            reader.readingFile();
            converter.compute(reader.getCommands());
            System.out.println("Output: "+converter.compute(reader.getCommands()));
            System.out.println("Add = "+ Converter.addValue);//!!!!!!!!!!!!!!!!!!!!
        } catch(Exception ex){

        }
    }
}
