package com.arvind.myapplication;

public class QuestionBank {
    String Answer, Option1, Option2, Option3, Option4, Qtext;

    public QuestionBank(){}

    public QuestionBank(String Answer, String Option1, String Option2, String Option3, String Option4, String Qtext) {
        this.Answer = Answer;
        this.Option1 = Option1;
        this.Option2 = Option2;
        this.Option3 = Option3;
        this.Option4 = Option4;
        this.Qtext = Qtext;
    }

    public String getAnswer() {
        return Answer;
    }

    public String getOption1() {
        return Option1;
    }

    public String getOption2() {
        return Option2;
    }

    public String getOption3() {
        return Option3;
    }

    public String getOption4() {
        return Option4;
    }

    public String getQtext() {
        return Qtext;
    }
}
