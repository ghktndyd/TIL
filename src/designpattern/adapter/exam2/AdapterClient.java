package designpattern.adapter.exam2;

public class AdapterClient {
    public static void main(String[] args) {
        LegacyXmlService legacyXmlService = new LegacyXmlService();
        JsonService jsonService = new XmlToJsonAdapter(legacyXmlService);

        System.out.println(jsonService.getJson());

    }
}
