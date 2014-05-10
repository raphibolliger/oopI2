package ch.fhnw.oopI2.GameProject;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by raphi on 16.04.14.
 */
public class Hangman {

    private char[] normalWord;
    private char[] hiddenWord;
    private ArrayList<Character> chosenLetters = new ArrayList<Character>();

    public Hangman(String word)
    {
        normalWord = word.toCharArray();
        hiddenWord = new char[normalWord.length];

        for (int i = 0; i < hiddenWord.length; i++)
        {
            hiddenWord[i] = '_';
        }
    }

    public String getHiddenWord() {
        String temp = "";
        for (int i = 0; i < this.hiddenWord.length; i++)
        {
            temp += hiddenWord[i]+" ";
        }
        return temp;
    }

    public void tryLetter(char letter)
    {
        for (int i = 0; i < normalWord.length; i++)
        {
            if (normalWord[i] == letter)
                hiddenWord[i] = letter;
        }
        setChosenLetters(letter);
    }


    private void setChosenLetters(char letter)
    {
        chosenLetters.add(letter);
    }


}
