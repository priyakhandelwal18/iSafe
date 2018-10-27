/*
 * Copyright (c) 2016, Codename One
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated 
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, 
 * and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions 
 * of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE 
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE. 
 */

package com.codename1.uikit.materialscreens;

import com.codename1.components.FloatingActionButton;
import com.codename1.components.MultiButton;
import com.codename1.components.SpanLabel;
import com.codename1.ui.Button;
import static com.codename1.ui.Component.BOTTOM;
import static com.codename1.ui.Component.CENTER;
import com.codename1.ui.Container;
import com.codename1.ui.FontImage;
import com.codename1.ui.Graphics;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.layouts.GridLayout;
import com.codename1.ui.plaf.Style; 
import com.codename1.ui.util.Resources;
import java.util.Random;

/**
 * Represents a user profile in the app, the first form we open after the walkthru
 *
 * @author Priya K
 */
public class ProfileForm extends SideMenuBaseForm {
    public ProfileForm(Resources res, int points) {
        super(BoxLayout.y(), 1);
        Toolbar tb = getToolbar();
        Game playGame = new Game();
        playGame.setPoints(points);
        Question question = playGame.getQuestion();
        
        tb.setTitleCentered(false);
        Image profilePic = res.getImage("user-picture.jpg");
        Image mask = res.getImage("round-mask.png");
        profilePic = profilePic.fill(mask.getWidth(), mask.getHeight());
        Label profilePicLabel = new Label(profilePic, "ProfilePicTitle");
        profilePicLabel.setMask(mask.createMask());

        Button menuButton = new Button("");
        menuButton.setUIID("Title");
        FontImage.setMaterialIcon(menuButton, FontImage.MATERIAL_MENU);
        menuButton.addActionListener(e -> getToolbar().openSideMenu());
        
            Container PointsWon = BoxLayout.encloseY(
                            new Label(((Integer)playGame.getPoints()).toString(), "CenterTitle"),
                            new Label("Points", "CenterSubTitle")
                    );
            PointsWon.setUIID("PointsWon");
            
            // container for level
            Container GameLevel = BoxLayout.encloseY(
                            new Label(((Integer)playGame.getLevel()).toString(), "CenterTitle"),
                            new Label("Level", "CenterSubTitle")
            );
            GameLevel.setUIID("Level");
            
        Button answerA = new Button("              A             ");
        answerA.setUIID("RemainingTasks");
        Button answerB = new Button("              B             ");
        answerB.setUIID("CompletedTasks");
        Button answerC = new Button("              C             ");
        answerC.setUIID("RemainingTasks");
            
        Container titleCmp = BoxLayout.encloseY(
                        FlowLayout.encloseIn(menuButton),
                        BorderLayout.centerAbsolute(
                                BoxLayout.encloseY(
                                    new SpanLabel(question.getPrompt(), "WalkthruBody"))
                        ),
                        GridLayout.encloseIn(2, PointsWon, GameLevel),
                        BorderLayout.centerAbsolute(
                                answerB
                            ).add(BorderLayout.WEST, answerA).add(BorderLayout.EAST, answerC)
                );
        
        FloatingActionButton fab = FloatingActionButton.createFAB(FontImage.MATERIAL_ADD);
        fab.getAllStyles().setMarginUnit(Style.UNIT_TYPE_PIXELS);
        fab.getAllStyles().setMargin(BOTTOM, GameLevel.getPreferredH() - fab.getPreferredH() / 2);
        tb.setTitleComponent(titleCmp);
                     
        //add(new Label("Choose an answer above ", "TitlePictureSpace"));
        
        FontImage arrowDown = FontImage.createMaterial(FontImage.MATERIAL_KEYBOARD_ARROW_DOWN, "Label", 3);
        
        Random rand = new Random();
        int placement = rand.nextInt(3) + 1;
        
        Button correct;
        Button incorrectOne;
        Button incorrectTwo;
            
            if(placement == 1)
            {
                add(new SpanLabel("A) " + question.getCorrectAnswer(), "TodayEntry"));
                add(new SpanLabel("B) " + question.getIncorrectOne(), "TodayEntry"));
                add(new SpanLabel("C) " + question.getIncorrectTwo(), "TodayEntry"));
                correct = answerA;
                incorrectOne = answerB;
                incorrectTwo = answerC;
            }
            else if (placement == 2)
            {
                add(new SpanLabel("A) " + question.getIncorrectOne(), "TodayEntry"));
                add(new SpanLabel("B) " + question.getCorrectAnswer(), "TodayEntry"));
                add(new SpanLabel("C) " + question.getIncorrectTwo(), "TodayEntry"));
                incorrectOne = answerA;
                correct = answerB;
                incorrectTwo = answerC;               
            }
            else
            {
                add(new SpanLabel("A) " + question.getIncorrectTwo(), "TodayEntry"));
                add(new SpanLabel("B) " + question.getIncorrectOne(), "TodayEntry"));
                add(new SpanLabel("C) " + question.getCorrectAnswer(), "TodayEntry"));
                incorrectTwo = answerA;
                incorrectOne = answerB;
                correct = answerC; 
                
            }
        
        
        setupSideMenu(res, playGame.getPoints(), playGame.getLevel());
        
        correct.addActionListener(e -> new CorrectAnswerPage(res, question, playGame.getPoints()).show());
        incorrectOne.addActionListener(e -> new IncorrectAnswerPage(res, question, playGame.getPoints()).show());
        incorrectTwo.addActionListener(e -> new IncorrectAnswerPage(res, question, playGame.getPoints()).show());
        
    }
    
    private Button addButtonBottom(String text, int color, boolean first) {
        Button finishLandingPage = new Button(text);
        finishLandingPage.setUIID("Container");
        //finishLandingPage.setUIIDLine1("TodayEntry");
        finishLandingPage.setIcon(createCircleLine(color, finishLandingPage.getPreferredH(),  first));
        //finishLandingPage.setIconUIID("Container");
        //finishLandingPage.setAutoSizeMode(true);
        add(FlowLayout.encloseIn(finishLandingPage));
        return finishLandingPage; 
    }
    
    private Image createCircleLine(int color, int height, boolean first) {
        Image img = Image.createImage(height, height, 0);
        Graphics g = img.getGraphics();
        g.setAntiAliased(true);
        g.setColor(0xcccccc);
        int y = 0;
        if(first) {
            y = height / 6 + 1;
        }
        g.drawLine(height / 2, y, height / 2, height);
        g.drawLine(height / 2 - 1, y, height / 2 - 1, height);
        g.setColor(color);
        g.fillArc(height / 2 - height / 4, height / 6, height / 2, height / 2, 0, 360);
        return img;
    }

    @Override
    protected void showOtherForm(Resources res) {
        new StatsForm(res).show();
    }
}
