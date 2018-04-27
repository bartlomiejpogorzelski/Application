package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader implements InterfaceReader {

    private ArrayList<String> commands;
    Scanner in;
    String input;
    File file;
    Scanner scanFile;

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }

    @Override
    public void readingFile() throws FileNotFoundException {
        commands = new ArrayList();
        in = new Scanner(System.in);
        System.out.println("What is the filename?");
        input = in.nextLine();
        file = new File("src/"+ input+".txt");
        scanFile = new Scanner(file);

        int i =0;
        while(scanFile.hasNextLine()){
            commands.add(i++, scanFile.nextLine());
        }
        System.out.println(commands);
    }
}
