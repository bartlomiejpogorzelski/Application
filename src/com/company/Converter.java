package com.company;

import java.util.ArrayList;

public class Converter implements InterfaceConverter  {
    String apply = null;
    String line = null;
    int sum = 0;

    int applyValue = 0;
    static int addValue=0; // !!!!!!!!!!!!!! All values -setters and getters
    int subtractValue=0;
    int multiplyValue=0;
    int divideValue=0;
    @Override
    public double compute(ArrayList<String> commands) {

        try{
            apply = commands.get(commands.size()-1);
            apply=apply.replaceAll("apply", "");
            apply=apply.replaceAll(" ", "");
            applyValue=Integer.valueOf(apply);
            sum=applyValue;
        }catch(Exception e){
            System.out.print("Error in apply");
        }

        for(String command : commands){

            if(command.contains("add")){
                try{
                    line=command.replaceAll("add", "");
                    line=line.replaceAll(" ", "");
                    addValue=Integer.valueOf(line);
                    sum += addValue;
                }
                catch(Exception ex){
                    System.out.print("error in if-add ");
                }
            }
            if(command.contains("subtract")){
                line=command.replaceAll("subtract", "");
                line=line.replaceAll(" ", "");
                subtractValue=Integer.valueOf(line);
                sum -= subtractValue;
            }
            if(command.contains("multiply")){
                line=command.replaceAll("multiply", "");
                line=line.replaceAll(" ", "");
                multiplyValue=Integer.valueOf(line);
                sum *= multiplyValue;
            }
            if(command.contains("divide")){
                line=command.replaceAll("divide", "");
                line=line.replaceAll(" ", "");
                divideValue=Integer.valueOf(line);
                sum /= divideValue;
            }
        }
        return sum;
    }
}
