package core;

public class Neuron {
	int idNeuron;//Identifier of Neuron
	int inputs[];//inputs
	double weights[];//weights to inputs
	int output;//out
	
	public int getIdNeuron() {
		return idNeuron;
	}
	public void setIdNeuron(int idNeuron) {
		this.idNeuron = idNeuron;
	}
	public int[] getInputs() {
		return inputs;
	}
	public void setInputs(int[] inputs) {
		this.inputs = inputs;
	}
	public double[] getWeights() {
		return weights;
	}
	public void setWeights(double[] weights) {
		this.weights = weights;
	}
	public int getOutput() {
		return output;
	}
	public void setOutput(int output) {
		this.output = output;
	}

	
}
