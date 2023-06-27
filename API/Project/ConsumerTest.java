package LiveProject;

import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

//generates contract and mock tests
@ExtendWith(PactConsumerTestExt.class)
public class ConsumerTest {
    // Create headers map
    Map<String, String> headers = new HashMap<>();

    @Pact(consumer = "UserConsumer", provider = "UserProvider")
    public RequestResponsePact createPact(PactDslWithProvider builder) {
        //Set the header
        headers.put("Content-Type", "application/json");

        //Set the body
        DslPart requestResponseBody = new PactDslJsonBody()
                .numberType("id", 123)
                .stringType("firstName", "pramila")
                .stringType("lastName", "s")
                .stringType("email", "pramila@example.com");

        //Write to contract
        return builder.given("request to create a user")
                .uponReceiving("request to create a user")
                .method("POST")
                .path("/api/users")
                .headers(headers)
                .body(requestResponseBody)
                .willRespondWith()
                .status(201)
                .body(requestResponseBody)
                .toPact();
    }

    @Test
    @PactTestFor(providerName = "UserProvider", port = "8282")
    public void postRequestTest() {
        //write a restAssuredTest now
        //request body
        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("id", 123);
        reqBody.put("firstName", "Pramila");
        reqBody.put("lastName", "s");
        reqBody.put("email", "pramila@example.com");

        //Send POST Request
        given().baseUri("http://localhost:8282/api/users").headers(headers).body(reqBody).
                when().post().
                then().statusCode(201).log().all();
    }


}
