package comliveproject.salonapi.controller;

import comliveproject.salonapi.entity.SalonServiceDetail;
import comliveproject.salonapi.repository.SalonServiceDetailRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/services",
        produces="application/json")
@CrossOrigin(origins = "*")
public class ServiceDetailsController {

    private SalonServiceDetailRepository salonServiceDetailRepo;

    ServiceDetailsController(SalonServiceDetailRepository salonServiceDetailRepo) {
        this.salonServiceDetailRepo = salonServiceDetailRepo;
    }

    @GetMapping("/retrieveAvailableSalonServices")
    List<SalonServiceDetail> retrieveAvailableSalonServices() {
        return salonServiceDetailRepo.findAll();
    }
}
