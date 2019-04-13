package id.polinema.lsp.controller;

import id.polinema.lsp.entity.ElemenKopetensi;
import id.polinema.lsp.service.ElemenKopetensiService;
import id.polinema.lsp.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "kopetensi/elemen")
public class ElemenKopetensiController {

    @Autowired
    ElemenKopetensiService elemenKopetensiService;
    private String service = "Elemen Kopetensi";

    @GetMapping
    ResponseEntity<Response> findAll(){
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Get All data");

        response.setData(elemenKopetensiService.findAll());

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

        response.setData(elemenKopetensiService.findById(id));

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @PostMapping
    ResponseEntity<Response> create(@RequestBody @Validated ElemenKopetensi elemen){
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Data Created Successfully");

        //Insert Data
        response.setData(elemenKopetensiService.create(elemen));
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @PutMapping(value = "{id}")
    ResponseEntity<Response> update(@PathVariable("id") Long id, @RequestBody @Validated ElemenKopetensi elemen){
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Data Updated Successfully");

        //Update Data
        response.setData(elemenKopetensiService.update(id,elemen));

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

        elemenKopetensiService.delete(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }
}
