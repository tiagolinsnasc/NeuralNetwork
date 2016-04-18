package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import core.Neuron;

public class Rec {
	public static boolean SAVE_ACTIVE = false; 
	private static File SAVED_FILE = new File("cfg.txt");
	
	
	public static boolean saveState(Neuron nr){
		String w = "";
		for (int i = 0; i < nr.getWeights().length; i++) {
			w += nr.getWeights()[i]+",";
		}
		//Replace all values	
		String str = nr.getIdNeuron()+" ="+" "+w.substring(0,w.length()-1);
		write(str);
		return true;
	}
	
	public static boolean saveState(Neuron[] nr){
		String w = "";
		String allText = "";
		for (int i = 0; i < nr.length; i++) {
			w = "";
			for (int j = 0; j < nr[i].getWeights().length; j++) {
				w += nr[i].getWeights()[j]+",";
			}
			//Replace all values	
			String str = nr[i].getIdNeuron()+" ="+" "+w.substring(0,w.length()-1);
			allText += str+"\n";
		}
		write(allText);
		return true;
	}
	
	public static Neuron[] readStates(){
		String recovered = read();
		
		
		
		
		return null;
	}
	
	
	public static void write(String txt){
		try{
    		//if file doesnt exists, then create it
    		if(!SAVED_FILE.exists()){
    			SAVED_FILE.createNewFile();
    		}
    		//false = no append file
    		FileWriter fileWritter = new FileWriter(SAVED_FILE.getName(),false);
    	    BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
    	    bufferWritter.write(txt);
    	    bufferWritter.close();
    	    
	        System.out.println("File saved!");
	        
    	}catch(IOException e){
    		e.printStackTrace();
    	}}
	
	public static String read(){
		BufferedReader br = null;
		String out = "";
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(SAVED_FILE));
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println("Read:"+sCurrentLine);
				out+= sCurrentLine;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return out;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
