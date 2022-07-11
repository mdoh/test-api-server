package com.example.testserver.controller


import com.example.testapi.server.model.Document
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import java.util.concurrent.CompletableFuture


@RequestMapping("/testapi/v2")
@Controller
class DocumentApiController  {


    @Operation(
        operationId = "readDocument",
        summary = "Access documents",
        responses = [ApiResponse(
            responseCode = "200",
            description = "Successful",
            content = [Content(mediaType = "application/json", schema = Schema(implementation = Document::class))]
        ), ApiResponse(
            responseCode = "400",
            description = "Invalid or missing parameter"
        ), ApiResponse(responseCode = "404", description = "No document with 'cmsId' found")],
        security = [SecurityRequirement(name = "basicAuth")]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/document/{tenant}/{cmsId}"],
        produces = ["application/json"]
    )
    fun readDocument(
        @Parameter(
            name = "tenant",
            description = "Tenant",
            required = true,
            schema = Schema(description = "")
        ) @PathVariable("tenant") tenant: String?,
        @Parameter(
            name = "cmsId",
            description = "Cms-id of document",
            required = true,
            schema = Schema(description = "")
        ) @PathVariable("cmsId") cmsId: String?
    ): CompletableFuture<ResponseEntity<Document?>>? {
        return CompletableFuture.completedFuture(ResponseEntity(HttpStatus.NOT_IMPLEMENTED))

    }

//  @Operation(
//        operationId = "readDocument",
//        summary = "Access documents",
//        responses = [ApiResponse(
//            responseCode = "200",
//            description = "Successful",
//            content = [Content(mediaType = "application/json", schema = Schema(implementation = Document::class))]
//        ), ApiResponse(
//            responseCode = "400",
//            description = "Invalid or missing parameter"
//        ), ApiResponse(responseCode = "404", description = "No document with 'cmsId' found")],
//        security = [SecurityRequirement(name = "basicAuth")]
//    )
//    @RequestMapping(
//        method = [RequestMethod.GET],
//        value = ["/document2/{tenant}/{cmsId}"],
//        produces = ["application/json"]
//    )
//    fun readDocument2(
//        @Parameter(
//            name = "tenant",
//            description = "Tenant",
//            required = true,
//            schema = Schema(description = "")
//        ) @PathVariable("tenant") tenant: String?,
//        @Parameter(
//            name = "cmsId",
//            description = "Cms-id of document",
//            required = true,
//            schema = Schema(description = "")
//        ) @PathVariable("cmsId") cmsId: String?
//    ): CompletableFuture<ResponseEntity<Document?>>? {
//        return CompletableFuture.completedFuture(ResponseEntity(HttpStatus.NOT_IMPLEMENTED))
//
//    }
//
//    @Operation(
//        operationId = "readDocument",
//        summary = "Access documents",
//        responses = [ApiResponse(
//            responseCode = "200",
//            description = "Successful",
//            content = [Content(mediaType = "application/json", schema = Schema(implementation = Document::class))]
//        ), ApiResponse(
//            responseCode = "400",
//            description = "Invalid or missing parameter"
//        ), ApiResponse(responseCode = "404", description = "No document with 'cmsId' found")],
//        security = [SecurityRequirement(name = "basicAuth")]
//    )
//    @RequestMapping(
//        method = [RequestMethod.GET],
//        value = ["/document3/{tenant}/{cmsId}"],
//        produces = ["application/json"]
//    )
//    fun readDocument3(
//        @Parameter(
//            name = "tenant",
//            description = "Tenant",
//            required = true,
//            schema = Schema(description = "")
//        ) @PathVariable("tenant") tenant: String?,
//        @Parameter(
//            name = "cmsId",
//            description = "Cms-id of document",
//            required = true,
//            schema = Schema(description = "")
//        ) @PathVariable("cmsId") cmsId: String?
//    ): CompletableFuture<ResponseEntity<Document?>>? {
//        return CompletableFuture.completedFuture(ResponseEntity(HttpStatus.NOT_IMPLEMENTED))
//
//    }
}
