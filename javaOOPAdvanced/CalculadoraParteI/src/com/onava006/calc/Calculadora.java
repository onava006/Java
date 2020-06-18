package com.onava006.calc;

public class Calculadora implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Double OperandOne = 0.0; 
	private Double OperandTwo = 0.0;
	private String Operation;
	private Double result;
	
	public Calculadora() {
		
	}
	
	private void setOperandOne(Double operandOne) {
		OperandOne = operandOne;
	}


	private void setOperandTwo(Double operandTwo) {
		OperandTwo = operandTwo;
	}
	
	private void setOperation(String operand) {
		Operation = operand;
	}
	
	public void getResult() {
		System.out.println(result);
	} 	
	
	
	public void performOperation(Double operandOne, Double operandTwo, String operand) {
		setOperandOne(operandOne);
		setOperandTwo(operandTwo);
		setOperation(operand);
		
		switch(Operation) {
		
		case "+":			
			result = Double.sum(OperandOne, OperandTwo);
			getResult();
			break;
		case "-":
			OperandTwo = OperandTwo * -1;
			result = Double.sum(OperandOne, OperandTwo);
			OperandTwo = OperandTwo * -1;
			getResult();
			break;
		default:
			System.out.println("operación aritmetica no reconocida");		
		}		
	} 
}
