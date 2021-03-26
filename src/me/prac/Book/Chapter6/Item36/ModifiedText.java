package me.prac.Book.Chapter6.Item36;

import java.util.EnumSet;
import java.util.Set;

public class ModifiedText {
    public enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH }

    public void applyStyles(Set<Style> styles) {

    }

    public static void main(String[] args) {
        ModifiedText modifiedText = new ModifiedText();
        modifiedText.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
    }
}
