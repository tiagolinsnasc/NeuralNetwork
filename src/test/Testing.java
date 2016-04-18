package test;

import core.Neuron;
import util.Rec;

public class Testing {

	public static void main(String[] args) {
		Neuron nr = new Neuron();
		nr.setIdNeuron(1);
		nr.setWeights(new double[]{1.1,0.34,1.2,1.1});
		
		Neuron nr1 = new Neuron();
		nr1.setIdNeuron(2);
		nr1.setWeights(new double[]{1.12,0.34,1.2,1.2});
		
		Neuron nr2 = new Neuron();
		nr2.setIdNeuron(3);
		nr2.setWeights(new double[]{2.11,0.35,2.2,1.2});
		
//		Rec.saveState(new Neuron[]{nr,nr1,nr2});
		
		Rec.readStates();
		
	}

}
