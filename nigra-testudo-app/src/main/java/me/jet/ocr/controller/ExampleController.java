package me.jet.ocr.controller;

import me.jet.ocr.api.IExampleApi;
import me.jet.ocr.input.ExampleInput;
import me.jet.ocr.output.ExampleOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ExampleController {

    @Autowired
    private IExampleApi iExampleApi;

    @PostMapping(value = "/example")
    public ExampleOutput exampleCon(@Validated @RequestBody ExampleInput input) {
        return iExampleApi.process(input);
    }
}
