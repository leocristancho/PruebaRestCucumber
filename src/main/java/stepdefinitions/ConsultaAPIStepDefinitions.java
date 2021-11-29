package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import questions.ResponseCode;
import tasks.GetCountry;
import static org.hamcrest.CoreMatchers.equalTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ConsultaAPIStepDefinitions {
    private static final String restAìUrl="http://api.geonames.org/timezoneJSON?";
    Actor Leonardo;

    @Given("Leonardo es un usuario que requiere consultar la api Time Zone")
    public void leonardo_es_un_usuario_que_requiere_consultar_la_api_time_zone() {

         Leonardo = Actor.named("Leonardo Administrador")
                .whoCan(CallAnApi.at(restAìUrl));


        throw new io.cucumber.java.PendingException();
    }

    @When("Leonardo  envia los parametros asociados")
    public void leonardo_envia_los_parametros_asociados() {
        Leonardo.attemptsTo(GetCountry.fromlat(15));
        throw new io.cucumber.java.PendingException();
    }

    @Then("Leonardo debe obtener un codigo de respuesta exitosa")
    public void leonardo_debe_obtener_un_codigo_de_respuesta_exitosa() {
        Leonardo.should( seeThat("El código de respuesta", ResponseCode.was(),equalTo(200)));
        throw new io.cucumber.java.PendingException();
    }


}
