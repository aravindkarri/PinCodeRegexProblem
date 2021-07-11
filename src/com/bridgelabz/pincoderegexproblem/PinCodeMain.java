package com.bridgelabz.pincoderegexproblem;

import java.util.regex.Pattern;

public class PinCodeMain
{
	public static void main(String args[])
	{
		boolean isMatched = Pattern.compile("^([0-9]{3}[ ]?[0-9]{3})").matcher("400 083").matches();
		System.out.println(isMatched);
	}
}
