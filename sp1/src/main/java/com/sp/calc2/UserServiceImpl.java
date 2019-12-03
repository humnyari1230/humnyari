package com.sp.calc2;

import org.springframework.stereotype.Service;

@Service("calc2.userService")
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

	@Override
	public String calculator(int num1, String operator, int num2) {
		String s = null;
		
		switch(operator) {
		case "+": s=String.format("%d+%d=%d", num1, num2, num1+num2);
				  break;
		case "-": s=String.format("%d-%d=%d", num1, num2, num1-num2);
		  break;
		case "*": s=String.format("%d*%d=%d", num1, num2, num1*num2);
		  break;
		case "/": s=String.format("%d/%d=%d", num1, num2, num1/num2);
		  break;
		}
		
		return s;
	}

}
