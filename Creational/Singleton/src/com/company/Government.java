package com.company;

public class Government {
    private static Government government;
    private static String governmentFile = "This is a government file...";

    public static synchronized Government getGovernment(){
        if (government == null){
            government = new Government();
        }
        return government;
    }

    private Government(){

    }

    public void addToInfo(String governmentInfo){
        governmentFile += governmentInfo + "\n";
    }

    public void showGovermentFile(){
        System.out.println(governmentFile);
    }
}
