package com.company;

public class Facebook {
    private static Facebook facebook;
    private static String account = "This is a account:\n";

    public static synchronized Facebook getFacebook() {
        if (facebook == null){
            facebook = new Facebook();
        }
        return facebook;
    }

    private Facebook() {

    }

    public void addLog(String accountLog){
        account += accountLog + "\n";
    }

    public void showLog(){
        System.out.println(account);
    }

}
