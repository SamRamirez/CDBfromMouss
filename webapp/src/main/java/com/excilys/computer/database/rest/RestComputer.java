package com.excilys.computer.database.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.excilys.computer.database.core.modele.Computer;
import com.excilys.computer.database.services.ServiceComputer;

@RestController
public class RestComputer {

	private final ServiceComputer serviceComputer;

	public RestComputer(ServiceComputer serviceComputer) {
		this.serviceComputer=serviceComputer;
	}

	@GetMapping("/allComputers")
	public Computer allComputers() {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println(serviceComputer);
		System.out.println("bbbbbbbbbbbbbbbbb");
		if(!(serviceComputer.detailComputer(1)==null)) {
			System.out.println("bbb"+serviceComputer.detailComputer(1).getId());
		}
		System.out.println("bbbbbbbbbbb");
		if(!(serviceComputer.detailComputer(2)==null)) {
			System.out.println("bbb"+serviceComputer.detailComputer(2).getId());
		}
		System.out.println("bbbbbbbbbbbbbbbbb");
		if(!(serviceComputer.detailComputer(3)==null)) {
			System.out.println("bbb"+serviceComputer.detailComputer(3).getId());
		}
		System.out.println("bbbbbbbbbbbbbbbbb");
		if(!(serviceComputer.detailComputer(4)==null)) {
			System.out.println("bbb"+serviceComputer.detailComputer(4).getId());
		}
		System.out.println("bbbbbbbbbbbbbbbbb");
		if(!(serviceComputer.detailComputer(15)==null)) {
			System.out.println("bbb"+serviceComputer.detailComputer(15).getId());
		}
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		return serviceComputer.detailComputer(15);
	}

}


