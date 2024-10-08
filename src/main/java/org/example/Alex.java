package com.example;
import java.util.List;

public class Alex extends com.example.Lion {
    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public Alex(com.example.Feline feline) {
        super();
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
