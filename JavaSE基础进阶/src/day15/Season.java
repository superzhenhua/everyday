package day15;

import javax.swing.*;

public enum Season {
    SPRING("春"),
    SUMMER("夏"),
    AUTUMN("秋"),
    WINNER("冬");
    public String name;

   // private Season() {
   // }

    private Season(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                '}';
    }
}
