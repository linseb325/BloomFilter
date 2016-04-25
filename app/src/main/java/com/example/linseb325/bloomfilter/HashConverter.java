package com.example.linseb325.bloomfilter;

import java.io.Console;

/**
 * Created by linseb325 on 4/25/16.
 */
public class HashConverter
{
    public boolean[] convertTo18BitArray(String inputString)
    {
        boolean[] arrayToReturn = new boolean[18];
        for(int i = 0; i < 18; i++)
        {
            arrayToReturn[i] = false;
        }
        for (char currChar : inputString.toCharArray())
        {
            arrayToReturn[this.hashFunction1(currChar)] = true;
            arrayToReturn[this.hashFunction2(currChar)] = true;
            arrayToReturn[this.hashFunction3(currChar)] = true;
        }
        return arrayToReturn;
    }

    public int hashFunction1(char c)
    {
        int inputValue = this.convertCharToInt(c);
        inputValue += (inputValue * 5);
        inputValue = inputValue % 18;
        return inputValue;
    }
    public int hashFunction2(char c)
    {
        int inputValue = this.convertCharToInt(c);
        inputValue += 23;
        inputValue = inputValue % 18;
        return inputValue;
    }
    public int hashFunction3(char c)
    {
        int inputValue = this.convertCharToInt(c);
        inputValue = inputValue % 5;
        inputValue++;
        inputValue *= 10;
        inputValue = inputValue % 18;
        return inputValue;
    }
    public int convertCharToInt(char charToConvert)
    {
        String characterString = "abcdefghijklmnopqrstuvwxyz";
        if(characterString.contains((Character.toLowerCase(charToConvert) + "")))
        {
            return characterString.indexOf(Character.toLowerCase(charToConvert));
        }
        else
        {
            System.out.println("Not convertible!");
            return -1;
        }
    }
}
