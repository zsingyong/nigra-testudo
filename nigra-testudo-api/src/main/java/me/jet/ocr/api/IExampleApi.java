package me.jet.ocr.api;

import me.jet.ocr.input.ExampleInput;
import me.jet.ocr.output.ExampleOutput;

public interface IExampleApi {
    ExampleOutput process(ExampleInput exampleInput);
}
