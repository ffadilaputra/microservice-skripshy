package id.polinema.lsp.controller;

import id.polinema.lsp.entity.Skema;
import id.polinema.lsp.service.SkemaService;
import id.polinema.lsp.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "skema")
public class SkemaController {

    @Autowired
    SkemaService skemaService;
    private String service = "Skema";

    @GetMapping
    ResponseEntity<Response> findAll(){
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Get All data");

        response.setData(skemaService.findAll());

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @GetMapping(value = "{id}")
    ResponseEntity<Response> getById(@PathVariable("id") Long id){
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Get Data by Id");

        response.setData(skemaService.findById(id));

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @PostMapping
    ResponseEntity<Response> create(@RequestBody @Validated Skema skema){
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Data Created Successfully");

        //Insert Data
        response.setData(skemaService.create(skema));
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @PutMapping(value = "{id}")
    ResponseEntity<Response> update(@PathVariable("id") Long id, @RequestBody @Validated Skema skema){
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Data Updated Successfully");

        //Update Data
        response.setData(skemaService.update(id,skema));

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @DeleteMapping(value = "{id}")
    ResponseEntity<Response> deleteById(@PathVariable("id") Long id){
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Data Deleted by Id");

        skemaService.delete(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }


}
