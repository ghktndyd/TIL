package javaexam.generic;

public class WildCardSample {
    public static void main(String[] args) {
        WildCardSample wildCardSample = new WildCardSample();
        wildCardSample.callWildCardMethod();
    }

    public void callWildCardMethod() {
        WildCardGeneric<String> wildCard = new WildCardGeneric<>();
        wildCard.setWildCard("A");
        wildCardStringMethod(wildCard);
    }

    public void wildCardStringMethod(WildCardGeneric<String> cardGeneric) {
        String value = cardGeneric.getWildCard();
        System.out.println("value = " + value);
    }
}
