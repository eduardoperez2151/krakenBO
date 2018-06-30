package com.geocom.controllers;

import com.geocom.controllers.abstracts.AbstractController;
import com.geocom.dtos.PermissionDTO;
import com.geocom.services.PermissionService;
import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/permission", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "GeoCom Permissions services", produces = "application/json")
public class PermissionController extends AbstractController<PermissionDTO,Long> {

    protected PermissionController(final PermissionService permissionService) {
        super(permissionService);
    }
}
