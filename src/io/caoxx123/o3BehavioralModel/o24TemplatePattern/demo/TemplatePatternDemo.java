package io.caoxx123.o3BehavioralModel.o24TemplatePattern.demo;


public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game=new Cricket();
        game.play();
        System.out.println("---------------");
        Game game1=new Football();
        game1.play();
    }
}
