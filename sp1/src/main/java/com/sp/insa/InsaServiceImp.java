package com.sp.insa;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("insa.insaService")
public class InsaServiceImp implements InsaService {
	
	@Override
	public void calculator(Insa dto) {
			
		int tax = 0;
		
		if((dto.getSal()+dto.getBonus())>=3000000) {
			 tax = (int)((dto.getSal()+dto.getBonus())*0.03);
		} else if((dto.getSal()+dto.getBonus())>=2000000) {
			tax = (int)((dto.getSal()+dto.getBonus())*0.02);
		}
		dto.setTax(tax);
		
		int money=dto.getSal()+dto.getBonus()-dto.getTax();
		dto.setMoney(money);
		
		Calendar cal = Calendar.getInstance();
		String year = dto.getBirth().substring(0, 4);
		int age = cal.get(Calendar.YEAR)-Integer.parseInt(year);
		dto.setAge(age);
		
		String [] ddi=new String[] {"원숭이","닭","개","돼지","쥐","소"
	            ,"호랑이","토끼","용","뱀","말","양"};
	      int zz=Integer.parseInt(dto.getBirth().substring(0, 4))%12;
	      dto.setDdi(ddi[zz]);
	}
}
