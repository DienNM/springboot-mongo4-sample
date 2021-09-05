package com.vnbd.svc.app.api.any;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vnbd.svc.app.api.CommonApi;
import com.vnbd.svc.app.api.JsonResponse;
import com.vnbd.svc.module.data.ContactData;
import com.vnbd.svc.module.service.ContactService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author dee
 */
@Api(tags = "Contact")
@RestController
@RequestMapping("/api/contact")
public class ContactCRUDApi extends CommonApi {

    private Logger logger = LoggerFactory.getLogger(ContactCRUDApi.class);

    @Autowired
    private ContactService contactService;

    @ApiOperation(value = "Get by Id")
    @ApiResponses(value = { @ApiResponse(code = 200, response = ContactData.class, message = "Success") })
    @RequestMapping(value = "/get/by-id", method = RequestMethod.GET)
    public ResponseEntity<JsonResponse> getById(@RequestParam(value = "id") String id, HttpServletRequest request, HttpServletResponse response) {
        try {
            ContactData contact = contactService.getById(id);
            JsonResponse jsonResponse = new JsonResponse(true);
            jsonResponse.putResult(contact);
            return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("{}", e);
            JsonResponse jsonResponse = new JsonResponse(false);
            jsonResponse = new JsonResponse(false);
            jsonResponse.putMessage(e.getMessage());
            return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Save")
    @ApiResponses(value = { @ApiResponse(code = 200, response = ContactData.class, message = "Success") })
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<JsonResponse> save(@RequestBody ContactData data, HttpServletRequest request, HttpServletResponse response) {
        try {
            contactService.save(data);
            JsonResponse jsonResponse = new JsonResponse(true);
            jsonResponse.putResult(data);
            return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("{}", e);
            JsonResponse jsonResponse = new JsonResponse(false);
            jsonResponse = new JsonResponse(false);
            jsonResponse.putMessage(e.getMessage());
            return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Delete by Id")
    @ApiResponses(value = { @ApiResponse(code = 200, response = ContactData.class, message = "Success") })
    @RequestMapping(value = "/delete/by-id", method = RequestMethod.POST)
    public ResponseEntity<JsonResponse> deleteById(@RequestParam(value = "id") String id, HttpServletRequest request, HttpServletResponse response) {
        try {
            boolean success = contactService.deleteById(id);
            JsonResponse jsonResponse = new JsonResponse(success);
            return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("{}", e);
            JsonResponse jsonResponse = new JsonResponse(false);
            jsonResponse = new JsonResponse(false);
            jsonResponse.putMessage(e.getMessage());
            return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
