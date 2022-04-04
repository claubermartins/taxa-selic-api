package com.taxaselic.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
	    return new Docket(DocumentationType.SWAGGER_2)
	        .select()
	       .apis(RequestHandlerSelectors.basePackage("br.com.taxaselicapi.controller"))
	        .paths(PathSelectors.any())
	        .build()
	        .useDefaultResponseMessages(false)
	        .apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
	    return new ApiInfo(
	  	      "API que consiste em simular a compra de produtos com base na taxa de juros Selic.", 
		      "Esta API tem como objetivo retornar uma lista de parcelas dado um produto e uma condicao de pagamento. ", 
		      "API", 
		      "Terms of service", 
		      new Contact("Clauber Martins", "https://github.com/claubermartins", "clauber789@gmail.com"), 
		      "Clauber Martins - Linkedin", "https://www.linkedin.com/in/clauber-martins-095889200/", Collections.emptyList());
	}

    private List<ResponseMessage> responseMessageForGET()
    {
        return new ArrayList<ResponseMessage>() {{
            add(new ResponseMessageBuilder()
                .code(500)
                .message("500 message")
                .responseModel(new ModelRef("Error"))
                .build());
            add(new ResponseMessageBuilder()
                    .code(200)
                    .message("Ok!")
                    .build());
            add(new ResponseMessageBuilder()
                    .code(400)
                    .message("Bad Request!")
                    .build());
            add(new ResponseMessageBuilder()
                    .code(404)
                    .message("Not Found!")
                    .build());
        }};
    }
}