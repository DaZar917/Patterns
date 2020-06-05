package com.company;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Observed {

    List<Observer> bidders= new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        System.out.println("Welcome!");
        notifyObserver();
        bidders.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Good bye!");
        notifyObserver();
        bidders.remove(observer);
    }

    @Override
    public void notifyObserver() {

        int value = 0;

        for (Observer observer: bidders) {
            if (value < observer.getValue()) {
                value = observer.getValue();
            }
        }

        for (Observer observer: bidders){
            observer.handleEvent(value);
        }
    }
}
