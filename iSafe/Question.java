/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.uikit.materialscreens;

/**
 *
 * @author priyakhandelwal 
 */
public class Question {
    // a question prompt 
    // 3 answer options total
    // 1 correct answer
    // an explanation text box
    private String prompt;
    private String correctAnswer;
    private String incorrectOne;
    private String incorrectTwo;
    private String explain;
    private int pointValue;
    
    public Question(String prompt, String correctAnswer, String incorrectOne, String incorrectTwo, String explain, int pointValue)
    {
       this.prompt = prompt;
       this.correctAnswer = correctAnswer;
       this.incorrectOne = incorrectOne;
       this.incorrectTwo = incorrectTwo; 
       this.explain = explain;
       this.pointValue = pointValue;
    }
    
    public String getPrompt()
    {
        return prompt;
    }
    
    public String getCorrectAnswer()
    {
        return correctAnswer;
    }
    
    public String getIncorrectOne()
    {
        return incorrectOne;
    }
    
    public String getIncorrectTwo()
    {
        return incorrectTwo;
    }
    
    public String getExplain()
    {
        return explain; 
    }
    
    public int getPointValue()
    {
        return pointValue; 
    }
    
    
}
    
    
