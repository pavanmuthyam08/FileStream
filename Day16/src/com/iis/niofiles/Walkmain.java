package com.iis.niofiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Walkmain{
	public static void main(String[] args) {
		Path path=Paths.get("/home/administrator");
		List<Path> paths=null;
		try {
			paths = listFiles(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		paths.forEach(x->System.out.println(x));
		
	}
	
	//List All the files in the path
	public static List<Path> listFiles(Path path) throws IOException
	{
		List<Path> result;
		try(Stream<Path> walk = Files.walk(path))
		{
			result=walk.collect(Collectors.toList());
		}
		return result;
		
	}

}
