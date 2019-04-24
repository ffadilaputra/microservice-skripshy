package id.polinema.acessor.managementacessor.controller;

import id.polinema.acessor.managementacessor.entity.Pemohon;
import id.polinema.acessor.managementacessor.service.PemohonService;
import id.polinema.acessor.managementacessor.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "pemohon")
public class PemohonController {

    @Autowired
    PemohonService pemohonService;
    private String service = "Pemohon";

    @GetMapping
    ResponseEntity<Response> findAll(){
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Get All data");

        response.setData(pemohonService.findAll());

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

        response.setData(pemohonService.findById(id));

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @PostMapping
    ResponseEntity<Response> create(@RequestBody @Validated Pemohon pemohon){
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Data Created Successfully");

        //Insert Data
        response.setData(pemohonService.create(pemohon));
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @PutMapping(value = "{id}")
    ResponseEntity<Response> update(@PathVariable("id") Long id, @RequestBody @Validated Pemohon pemohon){
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Data Updated Successfully");

        //Update Data
        response.setData(pemohonService.update(id,pemohon));

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @DeleteMapping(value = "{id}")
    ResponseEntity<Response> deleteById(@PathVariable("id") Long id) {
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Data Deleted by Id");

        pemohonService.delete(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);

    }
    }
