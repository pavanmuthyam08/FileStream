package com.iis.channelInterface;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;

public class CopyChannelDemo
{
  public static void main(String[] args) throws IOException{
	FileInputStream fin=new FileInputStream("/home/administrator/Documents/NioFiles/channel.txt");
	ReadableByteChannel source=fin.getChannel();
	FileOutputStream fout=new FileOutputStream("/home/administrator/Documents/NioFiles/channe3.txt");
	WritableByteChannel dest=fout.getChannel();
	copyData(source,dest);
	
	source.close();
	dest.close();
}
  private static void copyData(ReadableByteChannel source,WritableByteChannel dest) throws IOException
  {
	  ByteBuffer buffer=ByteBuffer.allocateDirect(16*1024);
	  while(source.read(buffer)!=-1)
	  {
		//Prepare Buffer to drained 
		  buffer.flip();
	  }
	  while(buffer.hasRemaining())
	  {
		  dest.write(buffer);
		  System.out.println("Copy done ");
	  }
	  buffer.clear();
  }
}
