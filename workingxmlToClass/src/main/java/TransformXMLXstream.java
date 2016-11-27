
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class TransformXMLXstream {

    public static void main(String[] args) throws Exception {
        try {
            CamelContext context = new DefaultCamelContext();
            context.setTracing(true);

            context.addRoutes(new RouteBuilder() {

                public void configure() throws Exception {
                    from("direct:ABC")
                            .log("event?showAll=true")
                            .marshal()
                            .xstream()
                            .to("file:d:/ananta?fileName=abc.xml")
                            .unmarshal().xstream().bean(ShowEvents.class);
                }
            });



            context.start();

            ProducerTemplate producer = context.createProducerTemplate();
            producer.sendBody(
                    "direct:ABC",
                    new HardwareEvent("2", "current", "40 amp")
            );

            context.stop();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
