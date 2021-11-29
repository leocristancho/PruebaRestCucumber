import Models.country.CountryData;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import questions.GetContryQ;
import questions.ResponseCode;
import tasks.GetCountry;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;


@RunWith(SerenityRunner.class)
public class SerenityInitialTest {

   // private static final String restAìUrl="http://api.geonames.org/timezoneJSON?";

    @Test
    public void inicialTest(){
/*

        Actor Leonardo = Actor.named("Leonardo Administrador")
                .whoCan(CallAnApi.at(restAìUrl));

        Leonardo.attemptsTo(GetCountry.fromlat(15));

        //assertThat(SerenityRest.lastResponse().statusCode()).isEqualTo(200);
        Leonardo.should( seeThat("El código de respuesta", ResponseCode.was(),equalTo(200)));

        CountryData country= new GetContryQ().answeredBy(Leonardo);

        Leonardo.should(seeThat("País asociado:", act 
        		-> country.getCountryName(),equalTo("DR Congo")));





*/

    }
}
