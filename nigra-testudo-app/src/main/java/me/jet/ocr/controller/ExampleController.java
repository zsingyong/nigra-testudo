package me.jet.ocr.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import me.jet.ocr.api.IExampleApi;
import me.jet.ocr.input.ExampleInput;
import me.jet.ocr.output.ExampleOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Tag(name = "样例参数")
public class ExampleController {

    @Autowired
    private IExampleApi iExampleApi;

    @Operation(summary = "样例请求")
    @PostMapping(value = "/example")
    public ExampleOutput exampleCon(@Validated @RequestBody ExampleInput input) {
        return iExampleApi.process(input);
    }
}
