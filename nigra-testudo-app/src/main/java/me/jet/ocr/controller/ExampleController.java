package me.jet.ocr.controller;

//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.tags.Tag;

import lombok.extern.slf4j.Slf4j;
import me.jet.ocr.api.IExampleApi;
import me.jet.ocr.output.ExampleOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
//@Tag(name = "样例参数")
public class ExampleController {

    @Autowired
    private IExampleApi iExampleApi;

    //    @Operation(summary = "样例请求")
    @GetMapping(value = "/example")
    public ExampleOutput exampleCon() {
        log.info("do{}");
        return iExampleApi.process(null);
    }
}
