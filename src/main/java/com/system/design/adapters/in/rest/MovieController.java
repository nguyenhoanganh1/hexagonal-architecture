package com.system.design.adapters.in.rest;

import com.system.design.application.usecase.MovieUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MovieController {

    private final MovieUseCase movieUseCase;

}
