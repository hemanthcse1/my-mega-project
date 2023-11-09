package com.hemanth.problemsolving.strings.easy;

public class GoalParserInterpretation1678 {


    public static void main(String[] args) {

        String command = "(al)G(al)()()G";


        System.out.println(parse(command));

    }

    public static String parse(String command){
        return command.replace("()","o").replace("(al)","al");
    }
}
