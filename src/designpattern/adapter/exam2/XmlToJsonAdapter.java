package designpattern.adapter.exam2;

public class XmlToJsonAdapter implements JsonService {

    private LegacyXmlService legacyXmlService;

    public XmlToJsonAdapter(LegacyXmlService legacyXmlService) {
        this.legacyXmlService = legacyXmlService;
    }

    @Override
    public String getJson() {
        String xmlData = legacyXmlService.getXmlData();

        String jsonData = "Json Data";

        return jsonData;
    }
}
