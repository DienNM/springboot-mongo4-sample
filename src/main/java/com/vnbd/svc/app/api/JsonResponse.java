package com.vnbd.svc.app.api;

import java.util.HashMap;
import java.util.List;

/**
 * @author DienNM (DEE)
 */

public class JsonResponse extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    public static final String RESULTS = "results";
    public static final String RESULT = "result";
    public static final String PAGING = "paging";
    public static final String SUCCESS = "success";
    public static final String MESSAGE = "message";
    public static final String ERRORS = "errors";
    public static final String ERROR_CODE = "errorCode";
    public static final String TOOK = "took";
    public static final String VERSION = "version";
    
    

    public JsonResponse() {
        this(false);
    }

    public JsonResponse(boolean success) {
        put(SUCCESS, success);
    }

    public JsonResponse(Object object, boolean success) {
        put(SUCCESS, success);
        put(RESULTS, object);
    }

    public void putPaging(Object pageble) {
        put(PAGING, pageble);
    }

    public void putResults(Object data) {
        put(RESULTS, data);
    }

    public void putResult(Object data) {
        put(RESULT, data);
    }

    public void putMessage(String message) {
        put(MESSAGE, message);
    }

    public void putErrors(List<?> errors) {
        put(ERRORS, errors);
    }

    public void putErrorCode(String errorCode) {
        put(ERROR_CODE, errorCode);
    }

    public void putTook(Object took) {
        put(TOOK, took);
    }
}
