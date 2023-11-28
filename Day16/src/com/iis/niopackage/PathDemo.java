package com.iis.niopackage;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
	public static void main(String[] args) {
		Path path=Paths.get("/home/administrator/Documents/io");
		Path path1=Paths.get("demo.txt");
		Path path2=Paths.get("welcome.txt");
		FileSystem fs=path.getFileSystem();
		System.out.println("File System to string "+fs.toString());
		System.out.println("path is absolute "+path.isAbsolute());
		System.out.println("path getcount "+path.getNameCount());
		System.out.println("path root is "+path.getRoot());
		System.out.println("path parnt is "+path.getParent());
		System.out.println("The path is ending "+path.endsWith(path1));
		System.out.println("The path start with "+path.startsWith(path2));
		System.out.println(path.subpath(0, 3));
		System.out.println("reslove method "+path.resolve(path1));
		System.out.println("reslove string is "+path.resolve("hello.txt"));
		System.out.println("resolve siblings "+path.resolveSibling(path1));
		System.out.println(path.resolveSibling(path2));
		System.out.println("resolve string siblings "+path.resolveSibling("pavan"));
		System.out.println(path.toUri());
		System.out.println("");
	}


}
