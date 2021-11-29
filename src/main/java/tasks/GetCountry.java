package tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetCountry implements  Task {

    private final int lat;
    public GetCountry(int lat){

        this.lat =lat;
    }

    public static Performable fromlat(int lat){

       return instrumented(GetCountry.class,lat);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Get.resource("?formatted=true&lat=-"+lat+"&lng=20&username=qa_mobile_easy&style=full").with(requestSpecification -> requestSpecification.contentType(ContentType.JSON).header("Header1","value1")));

    }
}
