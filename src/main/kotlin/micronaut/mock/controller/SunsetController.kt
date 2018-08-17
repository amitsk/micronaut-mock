package micronaut.mock.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import org.reactivestreams.Publisher
import org.slf4j.LoggerFactory
import reactor.core.publisher.Mono

@Controller("/")
class SunsetController {
  val logger = LoggerFactory.getLogger(this::class.java)
  @Get("/json")
  fun sunsetSunrise(): HttpResponse<Publisher<String>> {
    logger.info(" Returning SunsetSunrise payload")
    return HttpResponse.ok<Publisher<String>>().body(
      Mono.just(
        "{\n" +
            "      \"results\": {\n" +
            "          \"sunrise\": \"5:02:46 AM\",\n" +
            "          \"sunset\": \"7:40:32 PM\",\n" +
            "          \"solar_noon\": \"12:21:39 PM\",\n" +
            "          \"day_length\": \"14:37:46\",\n" +
            "          \"civil_twilight_begin\": \"4:32:19 AM\",\n" +
            "          \"civil_twilight_end\": \"8:10:59 PM\",\n" +
            "          \"nautical_twilight_begin\": \"3:54:22 AM\",\n" +
            "          \"nautical_twilight_end\": \"8:48:56 PM\",\n" +
            "          \"astronomical_twilight_begin\": \"3:11:57 AM\",\n" +
            "          \"astronomical_twilight_end\": \"9:31:21 PM\"\n" +
            "      },\n" +
            "      \"status\": \"OK\"\n" +
            "  }"
      )
    )
  }
}