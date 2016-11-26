/**
 * Created by ananta on 11/6/2016.
 */
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

//------------------------------------------------------
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class HardwareEvent {

    @XmlAttribute
    private String eventId;

    public HardwareEvent() {
        super();
    }

    public HardwareEvent(String eventId, String eventName, String eventValue) {
        super();
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventValue = eventValue;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventValue() {
        return eventValue;
    }

    public void setEventValue(String eventValue) {
        this.eventValue = eventValue;
    }

    @XmlAttribute
    private String eventName;

    @XmlAttribute
    private String eventValue;




}