package id.polinema.lsp.controller;

import id.polinema.lsp.service.UnitKopetensiService;
import id.polinema.lsp.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kopetensi/unit")
public class UnitKopetensiController {

    @Autowired
    UnitKopetensiService unitKopetensiService;
    private String service = "Unit Kopetensi Service";

    @GetMapping
    ResponseEntity<Response> findAll(){
        String nameOfCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
        Response response = new Response();
        response.setService(this.getClass().getName() + nameOfCurrMethod);
        response.setMessage("Get All data");

        response.setData(unitKopetensiService.findAll());

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

}
