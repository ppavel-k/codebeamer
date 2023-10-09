package codebeamer.rampup.client.invoker;

import org.springframework.context.annotation.Bean;

public class AppConfiguration {

    @Bean
    public ApiClient apiClient() {
        String baseUrl = "http://localhost:8070/api";
        return new ApiClient(baseUrl);
    }

//    @Bean
//    public ObjectMapper objectMapper() {
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        mapper.setDateFormat(dateFormat);
//        // mapper.registerModule(new JavaTimeModule());
//        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
//        //JsonNullableModule jnm = new JsonNullableModule();
//        //mapper.registerModule(jnm);
//        return mapper;
//    }

}
