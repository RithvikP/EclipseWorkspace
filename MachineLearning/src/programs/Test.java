package programs;

import java.io.File;
import java.io.IOException;

import net.sf.javaml.classification.Classifier;
import net.sf.javaml.classification.KNearestNeighbors;
import net.sf.javaml.core.*;
import net.sf.javaml.tools.InstanceTools;
import net.sf.javaml.tools.data.FileHandler;

public class Test {

	public static void main(String[] args) throws IOException {
		
		Dataset data = FileHandler.loadDataset(new File("/Users/Rithvik/Desktop/TestFile.rtf"), ".");
		 
		Classifier knn = new KNearestNeighbors(500);
		knn.buildClassifier(data);
		
		Dataset dataForClassification = FileHandler.loadDataset(new File("/Users/Rithvik/Desktop/TestLook.rtf"), ",");
		int correct = 0, incorrect = 0;
		for (Instance inst : dataForClassification) {
		    Object predictedClassValue = knn.classify(inst);
		    Object realClassValue = inst.classValue();
		    if (predictedClassValue.equals(realClassValue))
		        correct++;
		    else
		        incorrect++;
		}
		

	}

}
