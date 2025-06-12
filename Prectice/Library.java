package com.Prectice; 
 interface Story {
    void storyBook();
    void actionStory();
    void historicalBook();
    void magicalBook();
}

class BtmLibrary implements Story {  // Corrected spelling
    public void storyBook() {
        System.out.println("THIS IS THE MOGLI STORY BOOK");
    }

    public void historicalBook() {
        System.out.println("THIS IS THE HISTORICAL STORY OF JUNGLE BOOK");
    }

    public void magicalBook() {
        System.out.println("THIS IS THE STORY OF Magic Of Life");
    }

    public void actionStory() {
        System.out.println("THIS IS THE BALU ACTION STORY");
    }
}

public class Library {
    public static void main(String[] args) {
        BtmLibrary btmlibrary = new BtmLibrary();
        btmlibrary.storyBook();
        btmlibrary.magicalBook();
        btmlibrary.historicalBook();
        btmlibrary.actionStory();
    }
}
