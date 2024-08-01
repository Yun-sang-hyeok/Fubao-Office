package com.fu.fubaooffice.app.office.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "스웨거", description = "스웨거 API")
@RestController
@RequestMapping("/api/v3")
public class OfficeController {

    @Operation(summary = "테스트", description = "테스트입니다.")
    @GetMapping("/test")
    public String test() {
        return "Hello Fubao!!!!!!!!!!!!!";
    }
}
