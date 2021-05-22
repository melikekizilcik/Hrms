package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.entities.concretes.JobTitle;

@RestController //katmanin controller katmanı olduğunu belirtiyoruz
@RequestMapping("/api/jobtitles") //Sistemimize bu adres uzerinden istek gelirse bu controller karsilayip karar verecek
public class JobTitlesController {
	
	//Api'nin business katmani ile iletisim kurmasi lazim. Bunu da interface ile yapiyoruz:
	private JobService jobService;
	
	@Autowired //projeyi tariyor, JobService'i implemente eden classi buluyor ve class'i new'liyori,new'lenen nesneyi JobService'e atiyor.
	public JobTitlesController(JobService jobService) {
		super();
		this.jobService = jobService;
	}


	@GetMapping("/getall") //veri istedigimiz zaman kullaniyoruz
	public List<JobTitle> getAll(){
		return this.jobService.getAll(); //is pozisyonlarini listeliyoruz
	}
}
