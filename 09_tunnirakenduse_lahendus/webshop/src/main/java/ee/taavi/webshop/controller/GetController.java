package ee.taavi.webshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GetController {

    @GetMapping("tooted")//localhost:8080/tooted
    public String saaTooted(){
        return "Said tooted kätte";
    }

    //! peale igat muudatust backendile restart
    @GetMapping("prindi-logidesse")//localhost:8080/tooted
    public String prindiLogidesse(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Logi nr " + i);
        }
        return "Logidesse edukalt prinditud.";
    }

    @GetMapping("liida/{arv1}/{arv2}")  //localhost:8080/liida/1/3
    public int liidaKokku(@PathVariable int arv1, @PathVariable int arv2){
        return arv1 + arv2;
    }

    List<String> sonad = new ArrayList<>();
    //String[] sonad = {}

    @GetMapping("saa-sonad")
    public List<String> saaSonad(){
            return sonad;
    }

    @GetMapping("lisa-sona/{sona}")//localhost:8080/lisa-sona/sona1
    public List<String> saaSonad(@PathVariable String sona){
        sonad.add(sona);
        return sonad;
    }

    @GetMapping("saa-yks-sona/{index}")//localhost:8080/saa-yks-sona/1
    public String saaSonad(@PathVariable int index){
        return sonad.get(index);
    }

    //404 -- sellist URLi ei ole Not Found
    //400 -- muutujat ei osatud convertida Bad Request
    //403 -- forbidden ei saa ligi
    //401 -- need autentication, saad ligi, kui autendid.

    //500 -- Server võtab errori oma süüks.

    @GetMapping("kustuta-yks-sona/{index}")
    public List<String> kustutaSona(@PathVariable int index){
        sonad.remove(index);
        return sonad;
    }

    @GetMapping("sonade-arv")
    public int sonadeArv(){
        return sonad.size();
    }
}

