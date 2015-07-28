package prop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "prefix")
@Component
public class SampleProperty {
    private String stringProp1;
    private String stringProp2;
    @Max(99)
    @Min(0)
    private Integer intProp1;
    private List<String> listProp;
    private Map<String, String> mapProp;

    public String getStringProp1() {
        return stringProp1;
    }

    public void setStringProp1(String stringProp1) {
        this.stringProp1 = stringProp1;
    }

    public String getStringProp2() {
        return stringProp2;
    }

    public void setStringProp2(String stringProp2) {
        this.stringProp2 = stringProp2;
    }

    public Integer getIntProp1() {
        return intProp1;
    }

    public void setIntProp1(Integer intProp1) {
        this.intProp1 = intProp1;
    }

    public List<String> getListProp() {
        return listProp;
    }

    public void setListProp(List<String> listProp) {
        this.listProp = listProp;
    }

    public Map<String, String> getMapProp() {
        return mapProp;
    }

    public void setMapProp(Map<String, String> mapProp) {
        this.mapProp = mapProp;
    }
}
