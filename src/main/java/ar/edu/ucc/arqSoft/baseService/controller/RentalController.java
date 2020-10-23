package ar.edu.ucc.arqSoft.baseService.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.ucc.arqSoft.baseService.dto.RentalRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.RentalResponseDto;
import ar.edu.ucc.arqSoft.baseService.service.RentalService;

@Controller
@RequestMapping("/rental")
public class RentalController {
	@Autowired
	private RentalService rentalService;
	
	@RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody RentalResponseDto saveRental(@RequestBody RentalRequestDto request)
    {
        return rentalService.insertRental(request);
    }

}
