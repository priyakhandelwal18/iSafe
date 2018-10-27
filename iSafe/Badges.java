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

import com.codename1.components.SpanLabel;
import com.codename1.ui.Button;
import com.codename1.ui.ButtonGroup;
import com.codename1.ui.Component;
import static com.codename1.ui.Component.CENTER;
import com.codename1.ui.Container;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.RadioButton;
import com.codename1.ui.Tabs;
import com.codename1.ui.Toolbar;
import com.codename1.ui.animations.CommonTransitions;
import com.codename1.ui.events.SelectionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.layouts.LayeredLayout;
import com.codename1.ui.util.Resources;

/**
 * A swipe tutorial for the application
 *
 * @author Priya Khandelwal
 */

// also takes a question, points parameter in the constructor
public class Badges extends Form {
    
    int level;
    int points;
    
    public Badges(Resources res, int points, int level) {
        super(new LayeredLayout());
        getTitleArea().removeAll();
        getTitleArea().setUIID("Container");
        
        this.level = level;
        this.points = points; 
        
        
        setTransitionOutAnimator(CommonTransitions.createUncover(CommonTransitions.SLIDE_HORIZONTAL, true, 400));
        
        Tabs walkthruTabs = new Tabs();
        walkthruTabs.setUIID("Container");
        walkthruTabs.getContentPane().setUIID("Container");
        walkthruTabs.getTabsContainer().setUIID("Container");
        walkthruTabs.hideTabs();
        
        Image notes = res.getImage("InstaBadge.png");
        Image InstaBadge = res.getImage("InstaBadge.png");
        Image TweetBirdBadge = res.getImage("TweetBirdBadge.png");
        Image ThumbsUpBadge = res.getImage("ThumbsUpBadge.png");
        Image SnapGhostBadge = res.getImage("SnapGhostBadge.png");
        Image VineBadge = res.getImage("VineBadge.png");
        Image ExpertBadge = res.getImage("ExpertBadge.png");
        Image PinItBadge = res.getImage("PinItBadge.png");
        Image TumblrBadge = res.getImage("TumblrBadge.png");
        Image CyberSafeBadge = res.getImage("CyberSafeBadge.png");
           
        
        Label notesPlaceholder = new Label("","ProfilePic");
        Label notesLabel = new Label(notes, "ProfilePic");
        Component.setSameHeight(notesLabel, notesPlaceholder);
        Component.setSameWidth(notesLabel, notesPlaceholder);
        Label bottomSpace = new Label();
        
        Label InstaPlaceholder = new Label("","ProfilePic");
        Label InstaLabel = new Label(InstaBadge, "ProfilePic");
        Component.setSameHeight(InstaLabel, InstaPlaceholder);
        Component.setSameWidth(InstaLabel, InstaPlaceholder);
        
        //Container tab1 = BorderLayout.centerAbsolute(BoxLayout.encloseY(
                //notesPlaceholder
                //new Label("That's the right answer!", "WalkthruWhite"),
                //new SpanLabel("Good job!", "WalkthruWhite"),
                //new SpanLabel(question.getExplain(), "CenterSubTitle"),
                //bottomSpace
        //));
        //tab1.setUIID("WalkthruTab1");
        
        //walkthruTabs.addTab("", tab1);
        
        level = 6;
        if(level == 1)
        {
            Container tab1 = BorderLayout.centerAbsolute(BoxLayout.encloseY(
                new Label("InstaBadge", InstaBadge, "SideMenuTitle") 
            ));
        tab1.setUIID("WalkthruTab1");
        walkthruTabs.addTab("", tab1);
        }
            
        else if(level == 2)
        {
            Container tab1 = BorderLayout.centerAbsolute(BoxLayout.encloseY(
                new Label("InstaBadge", InstaBadge, "SideMenuTitle"),
                new Label("TweetBirdBadge", TweetBirdBadge, "SideMenuTitle")    
            ));
        tab1.setUIID("WalkthruTab1");
        walkthruTabs.addTab("", tab1);
        }
        
        else if(level == 3)
        {
            Container tab1 = BorderLayout.centerAbsolute(BoxLayout.encloseY(
                new Label("InstaBadge", InstaBadge, "SideMenuTitle"),
                new Label("TweetBirdBadge", TweetBirdBadge, "SideMenuTitle"),
                new Label("ThumbsUpBadge", ThumbsUpBadge, "SideMenuTitle")
            ));
        tab1.setUIID("WalkthruTab1");
        walkthruTabs.addTab("", tab1);
        }
        
        else if(level == 4)
        {
            Container tab1 = BorderLayout.centerAbsolute(BoxLayout.encloseY(
                new Label("InstaBadge", InstaBadge, "SideMenuTitle"),
                new Label("TweetBirdBadge", TweetBirdBadge, "SideMenuTitle"),
                new Label("ThumbsUpBadge", ThumbsUpBadge, "SideMenuTitle"),
                new Label("SnapGhostBadge", SnapGhostBadge, "SideMenuTitle")
            ));
        tab1.setUIID("WalkthruTab1");
        walkthruTabs.addTab("", tab1);
        }
        
        else if(level == 5)
        {
            Container tab1 = BorderLayout.centerAbsolute(BoxLayout.encloseY(
                new Label("InstaBadge", InstaBadge, "SideMenuTitle"),
                new Label("TweetBirdBadge", TweetBirdBadge, "SideMenuTitle"),
                new Label("ThumbsUpBadge", ThumbsUpBadge, "SideMenuTitle"),
                new Label("SnapGhostBadge", SnapGhostBadge, "SideMenuTitle"),
                new Label("VineBadge", VineBadge, "SideMenuTitle")
            ));
        tab1.setUIID("WalkthruTab1");
        walkthruTabs.addTab("", tab1);
        }
        
        else if(level == 6)
        {
            Container tab1 = BorderLayout.centerAbsolute(BoxLayout.encloseY(
                new Label("InstaBadge", InstaBadge, "SideMenuTitle"),
                new Label("TweetBirdBadge", TweetBirdBadge, "SideMenuTitle"),
                new Label("ThumbsUpBadge", ThumbsUpBadge, "SideMenuTitle"),
                new Label("SnapGhostBadge", SnapGhostBadge, "SideMenuTitle"),
                new Label("VineBadge", VineBadge, "SideMenuTitle"),
                new Label("PinItBadge", PinItBadge, "SideMenuTitle")
            ));
        tab1.setUIID("WalkthruTab1");
        walkthruTabs.addTab("", tab1);
        }
        
        else if(level == 7)
        {
            Container tab1 = BorderLayout.centerAbsolute(BoxLayout.encloseY(
                new Label("InstaBagde", InstaBadge, "SideMenuTitle"),
                new Label("TweetBirdBagde", TweetBirdBadge, "SideMenuTitle"),
                new Label("ThumbsUpBadge", ThumbsUpBadge, "SideMenuTitle"),
                new Label("SnapGhostBadge", SnapGhostBadge, "SideMenuTitle"),
                new Label("VineBadge", VineBadge, "SideMenuTitle"),
                new Label("PinItBadge", PinItBadge, "SideMenuTitle"),
                new Label("TumblrBadge", TumblrBadge, "SideMenuTitle")
            ));
        tab1.setUIID("WalkthruTab1");
        walkthruTabs.addTab("", tab1);
        }
        
        else
        {
            Container tab1 = BorderLayout.centerAbsolute(BoxLayout.encloseY(
                new Label("InstaBagde", InstaBadge, "SideMenuTitle"),
                new Label("TweetBirdBagde", TweetBirdBadge, "SideMenuTitle"),
                new Label("ThumbsUpBadge", ThumbsUpBadge, "SideMenuTitle"),
                new Label("SnapGhostBadge", SnapGhostBadge, "SideMenuTitle"),
                new Label("VineBadge", VineBadge, "SideMenuTitle"),
                new Label("PinItBadge", PinItBadge, "SideMenuTitle"),
                new Label("TumblrBadge", TumblrBadge, "SideMenuTitle"),
                new Label("ExpertBadge", ExpertBadge, "SideMenuTitle")
            ));
        tab1.setUIID("WalkthruTab1");
        walkthruTabs.addTab("", tab1);
        }
                
        
        /*
        Label bottomSpaceTab2 = new Label();
        
        Container tab2 = BorderLayout.centerAbsolute(BoxLayout.encloseY(
                new Label(duke, "ProfilePic"),
                new Label("Codename One", "WalkthruWhite"),
                new SpanLabel("Write once run anywhere native mobile development " +
                                            "Get Java working on all devices as it was always meant " +
                                            "to be!",  "WalkthruBody"),
                bottomSpaceTab2
        ));
        
        tab2.setUIID("WalkthruTab2");

        walkthruTabs.addTab("", tab2);
        */
        
        add(walkthruTabs);
        
        ButtonGroup bg = new ButtonGroup();
        Image unselectedWalkthru = res.getImage("unselected-walkthru.png");
        Image selectedWalkthru = res.getImage("selected-walkthru.png");
        RadioButton[] rbs = new RadioButton[walkthruTabs.getTabCount()];
        FlowLayout flow = new FlowLayout(CENTER);
        flow.setValign(CENTER);
        Container radioContainer = new Container(flow);
        for(int iter = 0 ; iter < rbs.length ; iter++) {
            rbs[iter] = RadioButton.createToggle(unselectedWalkthru, bg);
            rbs[iter].setPressedIcon(selectedWalkthru);
            rbs[iter].setUIID("Label");
            radioContainer.add(rbs[iter]);
        }
                
        rbs[0].setSelected(true);
        walkthruTabs.addSelectionListener((i, ii) -> {
            if(!rbs[ii].isSelected()) {
                rbs[ii].setSelected(true);
            }
        });
        
        Button skip = new Button("BACK TO GAME");
        skip.setUIID("SkipButton");
        skip.addActionListener(e -> new ProfileForm(res, this.points).show());
        
        Container southLayout = BoxLayout.encloseY(
                        radioContainer,
                        skip
                );
        add(BorderLayout.south(
                southLayout
        ));
        
        Component.setSameWidth(bottomSpace, southLayout);
        Component.setSameHeight(bottomSpace, southLayout);
        
        // visual effects in the first show
        addShowListener(e -> {
            notesPlaceholder.getParent().replace(notesPlaceholder, notesLabel, CommonTransitions.createFade(1500));
        });
    }    
}

