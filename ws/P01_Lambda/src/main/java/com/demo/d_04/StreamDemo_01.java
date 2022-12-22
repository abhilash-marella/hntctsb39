package com.demo.d_04;

import java.util.List;
import java.util.stream.Collectors;

import javax.print.DocFlavor.INPUT_STREAM;

public class StreamDemo_01 {

	public static void main(String[] args) {
		List<String> superheros = List.of(
			"SuPeRMan",
			"iRonMaN",
			"antMAN",
			"HulK",
			"HawkEYe",
			"ThAnoS",
			"WondarWOMAN",
			"shaktimAN",
			"hanumAN",
			"viSION"
		);
		
		
		// capitalize names
		// filter all names ending with "man", or "MAN", or "MaN", or "mAN", ...
		// filter all names starting with s or S
		// append is superhero
		
		List<String> finalList = superheros.stream()
			.map((input)->{
				input = input.toLowerCase();
				int ascii = input.charAt(0);
				ascii -= 32;
				input = (((char)ascii)+"")+(input.substring(1));
				return input;
			})// stream
			.filter((name)->name.endsWith("man"))// stream
			.filter((name)->name.startsWith("S"))// stream
			.map((input)->{
				System.out.println("appending text to "+input);
				return input+" is superhero";
			})
			.collect(Collectors.toList());
		
		System.out.println(finalList);
	}
	
}
