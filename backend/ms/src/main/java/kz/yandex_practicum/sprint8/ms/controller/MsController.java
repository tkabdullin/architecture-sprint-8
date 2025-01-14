package kz.yandex_practicum.sprint8.ms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author SV
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@RestController
@CrossOrigin(origins = "*")
public class MsController {

    private static final Logger logger = LoggerFactory.getLogger(MsController.class);

    @GetMapping("/reports")
    ResponseEntity<String> getReporting(Authentication authentification) {
        //logger.info("Get telemetry for device with id: {}", deviceId);
        return ResponseEntity.ok("/reports: " + authentification.getName());
    }

    @GetMapping("/data")
    ResponseEntity<String> getData(Authentication authentification) {
        //logger.info("Get telemetry for device with id: {}", deviceId);
        return ResponseEntity.ok("/data: " + authentification.getName());
    }
    

    @GetMapping("/info")
    ResponseEntity<String> getInfo() {
        //logger.info("Get latest telemetry for device with id: {}", deviceId);
        return ResponseEntity.ok("/info");
    }

}
