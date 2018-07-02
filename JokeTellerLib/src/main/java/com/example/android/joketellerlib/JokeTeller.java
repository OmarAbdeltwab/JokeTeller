package com.example.android.joketellerlib;

public class JokeTeller {

    private static final String[] Jokes= new String[]{
            "What did the traffic light say to the car? \n   Don’t look! I’m about to change"
            , "Why was the little strawberry crying?\n His mom was in a jam.",

            "Why are frogs  so happy?\n They eat whatever bugs them.",
            "How do you befriend a squirrel?\n Just act like a nut.",
            "Have you heard about the corduroy pillow?\n No? Really? It/’s making headlines/!",
            "Why did the jaguar eat the tightrope walker?\n    It was craving a well-balanced meal"};


    static public String GetTheJoke(){

        return Jokes[(int) Math.floor(Math.random() * 6)];}

}
