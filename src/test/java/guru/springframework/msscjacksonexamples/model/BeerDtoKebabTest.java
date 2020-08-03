package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertTrue;

@JsonTest
@ActiveProfiles("kebab")
public class BeerDtoKebabTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void kebabTest() throws JsonProcessingException{
        BeerDto beerDto = getDto();
        String beerDtojson = objectMapper.writeValueAsString(beerDto);
        System.out.println(beerDtojson);
        assertTrue(beerDtojson.contains("beer-name"));
        assertTrue(beerDtojson.contains("beer-style"));
        assertTrue(beerDtojson.contains("created-date"));
        assertTrue(beerDtojson.contains("last-updated-date"));
    }

}
