package com.sp.calc;

import org.springframework.stereotype.Service;

@Service("calc.userService")
public class UserServiceImpl implements UserService {

	@Override
	public String calculator(User dto) {
		String s = null;
		
		switch(dto.getOperator()) {
		case "+": s=String.format("%d+%d=%d", dto.getNum1(), dto.getNum2(), dto.getNum1()+dto.getNum2());
				  break;
		case "-": s=String.format("%d-%d=%d", dto.getNum1(), dto.getNum2(), dto.getNum1()-dto.getNum2());
		  break;
		case "*": s=String.format("%d*%d=%d", dto.getNum1(), dto.getNum2(), dto.getNum1()*dto.getNum2());
		  break;
		case "/": s=String.format("%d/%d=%d", dto.getNum1(), dto.getNum2(), dto.getNum1()/dto.getNum2());
		  break;
		}
		
		return s;
	}

}
