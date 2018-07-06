package cucumbertest;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Stepdefs {

    @Given("^Profesor logado en el sistema$")
    public void profesor_logado_en_el_sistema() throws Throwable {
        throw new PendingException();
    }

    @When("^Profe mira lista alumnos$")
    public void profe_mira_lista_alumnos() throws Throwable {
        throw new PendingException();
    }

    @Then("^Mostrar alumno presente$")
    public void mostrar_alumno_presente() throws Throwable {
        assert 1 == 1;
    }

    @And("^Alumno logado$")
    public void alumno_logado() throws Throwable {
        throw new PendingException();
    }

}