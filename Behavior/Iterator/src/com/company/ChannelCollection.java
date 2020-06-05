package com.company;

public class ChannelCollection implements Collection {

    private String name;
    private String[] channels;

    public ChannelCollection(String name, String[] channels) {
        this.name = name;
        this.channels = channels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getChannels() {
        return channels;
    }

    public void setChannels(String[] channels) {
        this.channels = channels;
    }

    @Override
    public Iterator getIterator() {
        return new ChannelIterator();
    }

    public class ChannelIterator implements Iterator {
        int id = 0;

        @Override
        public boolean hasNext() {
            if (id < channels.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return channels[id++];
        }

        @Override
        public boolean hasPrevious() {
            if (id > 0){
                return true;
            }
            return false;
        }

        @Override
        public Object previous() {
            id--;
            return channels[id];

        }


    }
}
