package com.company;

public class ChannelRunner {

    public static void main(String[] args) {
        String[] channels = {"First novy", "Second Ukraine", "Third ICTV", "Fourth TET", "Fifth MAIN"};

        ChannelCollection channelCollection = new ChannelCollection("Yaroslav Melnychyn", channels);

        Iterator iterator = channelCollection.getIterator();
        System.out.println("Channel: " + channelCollection.getName() + "\n");
        System.out.print("Channels: ");

        while(iterator.hasNext()){
            System.out.print(iterator.next().toString() + ", " );
        }
        System.out.print("\n==================\n");
        System.out.print("Channels: ");

        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() + ", ");
        }
        System.out.print("\n==================\n");

    }
}
