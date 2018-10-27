/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.uikit.materialscreens;

import com.codename1.components.SpanLabel;
import com.codename1.components.FloatingActionButton;
import com.codename1.components.MultiButton;
import com.codename1.ui.Button;
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
import com.codename1.ui.events.SelectionListener;
import java.util.*;
import java.util.Random; 

/**
 *
 * @author Priya Khandelwal
 */
public class Game 
{
    ArrayList<Question> questions = new ArrayList<Question>();
    int points;
    int level; 
    
    public Game()
    {
        addQuestions(); 
        points = 0;
        level = 1;
    }
    
    public void addQuestions()
    {
        // question 1
        questions.add(new Question(
            "Kristina is on Facebook and receives a friend request from a boy she doesn’t know. " + 
            "What should she do?",
            "Deny the friend request",
            "Accept the friend request. It’s rude to ignore him",
            "Send him a message and ask him how he knows her",
            "A friend is someone you know and trust and have interacted with over time. ",
            1
            ));
        
        //question 2
        questions.add(new Question(
            "Hector unlocks his smartphone and notices he has 12 apps that need to be updated. What should he do?",
            "Update the apps",
            "Ignore the prompt to update",
            "Update only some of the apps",
            "It’s important to Keep a Clean Machine. Keeping a Clean " +
            "Machine means having the latest operating system, software, " +
            "web browser, anti-virus protection and apps on your " +
            "computer and mobile devices. You should also only have apps " +
            "on your phone that you actually use",
            2
            ));
        
        //question 3
        questions.add(new Question(
            "You receive an email from a person that identifies " +
            "themselves as your friend John. They want to meet you in " +
            "the park after school Do you:",
            "Tell your parents about the email and ignore the request",
            "Ask the person a question only John would know to make " +
            "sure it is John",
            "Go to the park and meet your friend John",
            "Some people will pretend to be other people and may be " +
            "impersonating someone you know. It’s better to be safe than " +
            "sorry! Unfamiliar email addresses and posts on social network " +
            "sites should raise a red flag. Let your parents know and let " +
            "them help you make the right decision about contacting John",
            3
            ));
        
        //question 4
        questions.add(new Question(
            "You receive a chain email that tells you to pass it on to " +
            "10 of your closest friends. Do you: ",
            "Delete the email. You're never sure what viruses " +
            "these types of chain emails can have.",
            "Send the email to your friends – it’s so cool and you " +
            "want them to see it too!",
            "Send the email to only your family members to see what happens",
            "When in doubt, throw it out! Links in email, tweets, posts, " +
            "and online advertising are often the way cybercriminals " +
            "compromise your computer. If it looks suspicious, even if " +
            "you know the source, it’s best to delete or if appropriate, " +
            "mark as junk email.",
            1
            
        ));
        
        //question 5
        questions.add(new Question(
            "You don’t have to worry when you visit your favorite sites, " +
            "like Facebook and gaming sites, because they are safe from " +
            "spyware, malware and other online threats.",
            "Never true",
            "Sometimes true",
            "Always true",
            "Trusted sites can be SAFER. However, what you do on " +
            "those sites – such as clicking on posts with links or using apps – " +
            "can put you at risk. The best security step you can take is to " +
            "Keep a Clean Machine. Keeping a Clean Machine means having " +
            "the latest operating system, software, web browser, anti-virus " +
            "protection and apps on your computer and mobile devices. " +
            "Remember, when in doubt, throw it out! Links in email, tweets, " +
            "posts, and online advertising are often the way cybercriminals " +
            "compromise your computer. If it looks suspicious, even if you " +
            "know the source, it’s best to delete or if appropriate, mark as " +
            "junk email.",
            2
            
        ));
        
        //question 6
        questions.add(new Question(
            "When online, you should be careful whenever " +
            "approached by a new person or asked to provide " +
            "information about yourself.",
            "Always true",
            "Sometimes True",
            "Never true",
            "You always need to be on the lookout for online " +
            "intruders! Be careful because they may be trying to get " +
            "information from or about you. Remember to Be Web " +
            "Wise and think before you act. Be wary of " +
            "communications that implore you to act immediately, " +
            "offer something that sounds too good to be true, or ask " +
            "for personal information.",
            3
            
        ));
        
        //question 7
        questions.add(new Question(
            "You should know who you’re talking to online.",
            "Always true",
            "Sometimes true",
            "Never true",
            "The Internet can be a place to meet people and join " +
            "new communities. But just because you meet someone " +
            "online, it doesn’t mean you really know their identity. Use " +
            "caution when interacting with new people. There is nothing " +
            "wrong with being suspicious and extremely guarded about " +
            "sharing any personal information.",
            1
            
        ));
        
        //question 8
        questions.add(new Question(
            "When it comes to online shopping, you can safely " +
            "shop from ANY site.",
            "Never true",
            "Sometimes true",
            "Always true",
            "When shopping online, you should always shop from " +
            "trusted and well-known websites and always with a parent or " +
            "other adult present. " +
            "When banking and shopping, check to be sure the sites is security " +
            "enabled. Look for web addresses with 'https://,' which means " +
            "the site takes extra measures to help secure your information. ",
            2
            
        ));
        
        //question 9
        questions.add(new Question(
            "You should be aware of pop-ups and " +
            "downloads.",
            "Always true",
            "Sometimes true",
            "Never true",
            "Pop-ups and downloads can contain viruses that " +
            "could infect your computer. " +
            "You can avoid viruses by Keeping a Clean Machine and " +
            "having the latest operating system, software, web " +
            "browser, anti-virus protection and apps on your " +
            "computer and mobile devices.",
            3
            
        ));
        
        //question 10
        questions.add(new Question(
            "You and a friend are on the computer, looking to download " +
            "music and movies. You should:",
            "Only with your parent’s permission, go to trusted " +
            "websites or app stores to download music and movies.",
            "Go to a site that your friend uses and download a few " +
            "files onto the computer.",
            "Do a Google Search and click on whichever sites seem safe",
            "Your friends may not know what websites are safe or " +
            "unsafe for you to download. It’s illegal to download " +
            "music or movies from certain websites. Only purchase " +
            "music and movies from established services for media " +
            "distribution.",
            1
            
        ));
        
        //question 11
        questions.add(new Question(
            "What is the best way to use social networking sites?",
            "All of the above.",
            "Limit the amount of information I share about myself.",
            "Make my page private, except to the people I have as my " +
            "friends.",
            "All of the answer options are true. Own Your Online Presence. When available, set " +
            "the privacy and security settings on websites to " +
            "your comfort level for information sharing. It’s ok " +
            "to limit how and with whom you share " +
            "information.",
            2
            
        ));
        
        //question 12
        questions.add(new Question(
            "You posted a picture online, but are worried your friend may see it. " +
            "You soon remember that your friend DOES NOT have a computer. " +
            "Your friend will never see the photo, so you don't have to delete it... right?",
            "False- Even if your friend doesn’t have a computer, there are many other " +
            "ways he could see the photos",
            "True- If your friend doesn't have a computer, there's no point in deleting the photos.",
            "It doesn't matter whether your friend is comfortable with you posting pictures of him or not; you don't have to delete it.",
            "You never know who is going to see things that are posted " +
            "online. Copies could be passed around and someone may have " +
            "saved an image before you deleted it. Be a good online citizen. " +
            "Think about images you post and whether your friends would be " +
            "okay with them. Post only about others as you would have them " +
            "post about you. Whenever possible, get permission before posting " +
            "pictures or videos of others. Likewise, let others know they need " +
            "your permission before posting pictures or videos of you.",
            3
            
        ));
        
        //question 13
        questions.add(new Question(
            "The great thing about the cyber world is that you can " +
            "say things you might not always say directly to " +
            "someone’s face.",
            "Never true",
            "Sometimes true",
            "Always true",
            "Statements you make online about people can be " +
            "just as hurtful as saying them face-to-face. " +
            "Being nice in the cyber world is equally as important as " +
            "when you talk face to face. If you don’t want it done to " +
            "you, don’t do it to someone else! Be a good online citizen. " +
            "Post only about others as you have them post about you.",
            1
            
        ));
        
        //question 14
        questions.add(new Question(
            "It is okay to download FREE music from music sharing " +
            "sites, as long as no one finds out.",
            "Never true",
            "Sometiems True",
            "Always True",
            "This is the same as stealing from a store and you are stealing " +
            "from your favorite artists as well! " +
            "Only purchase music from established services for music " +
            "distribution. Some file sharing sites are also well known sources of " +
            "malware distribution. Remember, safer for me more secure for " +
            "all. What you do online has the potential to affect everyone – at " +
            "home, at work and around the world. Practicing good online habits " +
            "benefits the global digital community.",
            2
            
        ));
        
        //question 15
        questions.add(new Question(
            "The pictures you decide to post online today can " +
            "affect your future reputation.",
            "Always true",
            "Sometimes true",
            "Never true",
            "The photos you post online may never go away! " +
            "In the digital age, you need to pay attention to your " +
            "reputation from the moment you start going online. Your " +
            "online reputation can be both positive and negative, " +
            "depending on the choices you make and can affect the " +
            "future when you apply for colleges or jobs. You can manage " +
            "your online reputation by remembering to Own Your Online " +
            "Presence and setting privacy and security settings to your " +
            "comfort level for information sharing.",
            3
            
        ));
        
        //question 16
        questions.add(new Question(
            "You and your parents have established rules when you use the " +
            "Internet. You are over a friend’s house and decide to use the " +
            "internet. Do you:",
            "Respect your parents’ rules, even if you’re at a friend’s house.",
            "Do everything your friend does online, because you’re at their " +
            "house.",
            "It doesn’t matter. You can’t get in trouble because your " +
            "parents will never find out!",
            "Your parents are trying to help you establish good online " +
            "habits with all the devices you use to access the Internet, " +
            "even if they are not your own.",
            1
            
        ));
        
        //question 17
        questions.add(new Question(
            "You are playing a game on a smartphone and the app " +
            "asks for your current location. It’s okay to enable location " +
            "services because all of your friends play the game and if " +
            "they do it, it must be okay.",
            "Never true",
            "Sometimes true",
            "Always true",
            "Many apps do not need geo-location services enabled in " +
            "order to provide the service. Make sure you decline or optout " +
            "of the location service feature on your phone. If you don’t " +
            "know how to do this, ask your parents. Protect your personal " +
            "information by reading the privacy policy of an app before " +
            "you download it to understand what information the app " +
            "accesses and how it uses your information.",
            2
            
        ));
        
        //question 18
        questions.add(new Question(
            "Stealing other people’s work online – from sites like " +
            "Wikipedia and Google – is a crime.",
            "Always true",
            "Sometimes true",
            "Never true",
            "Stealing other people’s work is considered " +
            "theft. If you cut and paste content into your " +
            "homework without citing the source, it is cheating " +
            "and plagiarism.",
            3
            
        ));
        
        //question 19
        questions.add(new Question(
            "You are deciding on what personal information to post about yourself " +
            "in an online profile. You decide to:",
            "Review the information carefully before you post it because you do " +
            "not want others to potentially misuse your information",
            "Go ahead and post information about yourself online, because you " +
            "can always choose to edit it later if you don’t want people viewing " +
            "certain information.",
            "Post it anyways because it doesn't matter who sees your information",
            "Own your online presence. When available, take the " +
            "time to understand and set privacy and security settings " +
            "on websites to your comfort level for information " +
            "sharing. You should know who will see the content " +
            "before you post it.",
            1
        ));
        
        //question 20
        questions.add(new Question(
            "Post only about others as you would have " +
            "them post about you.",
            "Always true",
            "Sometimes true",
            "Never true",
            "You should always practice digital respect. " +
            "Treat others as nicely as you would like to be treated. " +
            "Remember, safer for me more secure for all. What you " +
            "do online has the potential to affect everyone – at " +
            "home, at work and around the world. Practicing good " +
            "online habits benefits the global digital community.",
            2 
        ));
        
        //question 21
        questions.add(new Question(
            "Jessica’s friend Sophie asks for Jessica’s password to her " +
            "Facebook account. What should Jessica do?",
            "Don’t give her password to Sophie.",
            "Give Sophie her password. Sophie is her friend and Jessica " +
            "can trust her.",
            "Tell Sophie her password and change it as soon as she gets " +
            "home.",
            "Protect your personal information. Passwords are never to be " +
            "shared with anyone other than a parent or guardian. It is a good " +
            "idea for parents and guardians to keep passwords to make sure " +
            "you remain safe and secure. Just because you spend time with " +
            "friends, doesn’t mean you have to follow everything they do. If " +
            "they are doing something that doesn’t seem right, you should feel " +
            "completely comfortable standing up for what you think is right.",
            3
            
        ));
        
        //question 22
        questions.add(new Question(
            "After a disagreement at school, a group of kids send Jaedon " +
            "threatening messages on Facebook. What should he do?",
            "All of the above",
            "Keep the emails and comments he recieves and block the kids from his page.",
            "Tell his parents.",
            "If someone is bullying or harassing you online, you should tell " +
            "your parents or a trusted adult. Ignore and block the person " +
            "and save all messages. Many websites, including Facebook, " +
            "have ways to report the abuse and/or help you respond to " +
            "messages that make you uncomfortable.",
            1
            
        ));
        
        //question 23
        questions.add(new Question(
            "Creating a fake Facebook page for someone you " +
            "know in your class, or for someone you don’t even " +
            "know, is illegal.",
            "Always true",
            "Sometimes true",
            "Never true",
            "Impersonating someone else online is one " +
            "form of identity theft! Penalties can be as high as " +
            "$100,000 fine plus a minimum of ten years in prison.",
            2
            
        ));
        
        //question 24
        questions.add(new Question(
            "When you are connected to the Internet, you are " +
            "responsible for your actions.",
            "Always true",
            "Sometimes true",
            "Never true",
            "Remember to STOP. THINK. CONNECT. Make sure " +
            "you have taken security precautions, understand the " +
            "consequences of your actions and behaviors and enjoy " +
            "the Internet. Remember, the Internet is a shared resource. " +
            "When you are safer online, you make the Internet more " +
            "secure for everyone!",
            3
            
        ));
        
        //question 25
        questions.add(new Question(
            "When you receive an email with an attachment that you were NOT expecting from a friend, you should:",
            "Ask your parents if it is okay to open the attachment.",
            "Ask a friend if you think it's okay to open the attachment.",
            "Open the attachment without thinking about it.",
            "If you were not expecting the email, you shouldn't open it. Your friend's email account could have been hacked " +
            "and the attachment might contain a virus.",
            3
            
        ));
        
        //question 26
        questions.add(new Question(
            "When is the best time to discuss your vacation and post pictures on social media?",
            "After you have returned home from the vacation",
            "When you are heading home from vacation",
            "Anytime; it does not affect your social media safety",
            "It's okay to share pictures of the fun moments you had, but you should be wary of posting them when you're still traveling! " +
            "Thieves could easily look through your social media page and discover that you're not home. It's always safer to wait till you're " +
            "back before you post anything about your vacation.",
            1
            
        ));
        
        //question 27
        questions.add(new Question(
            "Which of the following would be a strong password for your social media login?",
            "Alpha!1Num3er",
            "catsanddogs",
            "password",
            "Your password should be at least 12 characters long and preferrably be a 'passphrase' rather than a 'password'. " +
            "Include numbers, capital letters, and symbols so that your password is hard to guess. What's more, don't include things like " +
            "your name or birthday in your password. The more complicated your password, the more secure.",
            2
            
        ));
        
        //question 28
        questions.add(new Question(
            "Which is okay to give out over the Internet?",
            "Your best joke.",
            "Your birthday.",
            "Your address.",
            "Don't share personal information online, as your identity is at risk of being compromised.",
            3
            
        ));
        
        //question 29
        questions.add(new Question(
            "A person with a username FlyGuy12 just contacted you and told " +
            "you that they think you are cool. They say that they are 12. How old are they " +
            "really?",
            "There is no way to tell",
            "12",
            "45",
            "Don't trust people over the internet that you don't know. They could be lying about their identity.",
            1
            
        ));
        
        //question 30
        questions.add(new Question(
            "Someone keeps sending you obscene and insulting messages " +
            "online. What should you do?",
            "Tell an adult.",
            "Insult them back.",
            "Delete the messages.",
            "Save the rude messages so that you can show them to a trusted adult. If you try and take matters into your own hands by insulting " +
            "them back, you demonstrate that you're no better than them. After all, you're responding to their cyberbullying by cyberbullying them in return.",
            2
            
        ));
        
        //question 31
        questions.add(new Question(
            "You have over 1500 people following you on Instagram. How " +
            "could this put you in danger?",
            "Being that you do not know more than half the people following you " +
            "it puts you at risk if you put personal information on these sites. ",
            "It does not put you in danger. Being popular is great!",
            "Delete your accounts immediately.",
            "You should always be aware of who is following you. Only let people who you know follow you. Though the idea of having " +
            "hundreds of thousands of followers sounds enticing, safety always comes first.",
            3
            
        ));
        
        //question 32
        questions.add(new Question(
            "You have been talking to an online friend for a long time and " +
            "decided that you should finally meet. What should you do?",
            "Ask a parent if you can meet them and have a parent there when you " +
            "do.",
            "Invite them over to your house",
            "Meet them quickly or they may meet another person online",
            "Ideally, you should not ask invite someone that you met over the internet and have never seen in person. You never know who the person behind the " +
            "computer screen is, and you should always be wary of sharing your address with someone, even if you've been talking to them for a while. " +
            "However, if you have your parents' permission and you both agree that it is safe, it is okay to meet this online friend in a parent's presence.",
            1
            
        ));
        
        //question 33
        questions.add(new Question(
            "You just got an email that you won a new computer and all you " +
            "have to do is fill out the information card and they will send it to you! What " +
            "should you do?",
            "Ask a parent about the email.",
            "Fill out the card and send it in",
            "Check to see if you want that kind of computer.",
            "Emails like these are often scams that are looking to steal your personal information. Remember, safer for me more secure for " +
            "all. What you do online has the potential to affect everyone – at " +
            "home, at work and around the world. Practicing good online habits " +
            "benefits the global digital community.",
            2
            
        ));
        
        //question 34
        questions.add(new Question(
            "You are talking in a chatroom with several friends from school. " +
            "You are planning to " +
            "meet up and play soccer together. Is it okay to " +
            "meet up with your friends?",
            "Yes, but let your parents know where you will be.",
            "No; meeting people online and planning where to meet up is " +
            "dangerous.",
            "RSVP yes so that your friends don't feel bad but then don't show up.",
            "In this case, it's actually okay to meet up with your friends. Since you know the people that you are talking to, you can trust the messages. " +
            "Just be sure that your parents know where you are and who you are meeting up with.",
            3
            
        ));
        
        //question 35
        questions.add(new Question(
            "You have been talking to CutiePie12 for a long time online and " +
            "she wants to meet you at the movies. How do you know " +
            "this is a real account?",
            "There is no way to know if the account is real as you have never meet " +
            "her face to face. You should ask your parents for help.",
            "You have talked to her for a long time.",
            "She has a great profile!",
            "Ideally, you should not ask invite someone that you met over the internet and have never seen in person. You never know who the person behind the " +
            "computer screen is, and you should always be wary of meeting up with someone, even if you've been talking to them for a while. " +
            "However, if you have your parents' permission and you both agree that it is safe, it is okay to meet this online friend in a parent's presence.",
            1
            
        )); 
    }
    
    public Question getQuestion()
    {
        
        Random rand = new Random();
        int i = rand.nextInt(questions.size());
        return questions.get(i);
    }
    public void addPoints(int num)
    {
        for (int i = 0; i < num; i++)
        {
            points++;
        }
    }
    
    public void calcLevel()
    {
        level = points/20 + 1; 
    }
    
    public int getPoints()
    {
        return points;
    }
    
    public int getLevel()
    {
        calcLevel();
        return level; 
    }
    
    public void setPoints(int points)
    {
        this.points = points; 
    }

}
